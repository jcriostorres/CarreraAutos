package control;

import Modelo.ManipulacionBD;
import dominio.*;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private Juego juegoActual;
    private ManipulacionBD controlBD;
    private int longitudCarriles;
    private int posFinal;
    
    public Controlador(){
        this.controlBD = new ManipulacionBD();
        this.juegoActual = null;
        posFinal=1;
    }

    public void setLongitudCarriles(int longitudCarriles) {
        this.longitudCarriles = longitudCarriles;
    }

    
    public void ingresarCorredor(Conductor conductor) {
        controlBD.ingresarCorredor(conductor);
    }

    public boolean existeUsuario(String cedula) {
        return(this.controlBD.existeUsuario(cedula));
    }

    public Conductor getConductor(String cedula) {
        Conductor conductor = this.controlBD.getConductor(cedula);
        return(conductor);
    }

    private List<Carril> asignarCarriles(List<Conductor> listaConductores){
        List<Carril> listaCarriles = new ArrayList<>();
        for(int i = 0 ; i < listaConductores.size() ; i++ ){
           Carril carril = new Carril(longitudCarriles, (i + 1), listaConductores.get(i));
            listaCarriles.add(carril);
        }
        return(listaCarriles);
    }
    
    public boolean carreraTerminada(){
        boolean terminada= true;
        for(Carril carril: juegoActual.getPista().getListaCarriles()){
            if(carril.getCondutor().getCarro().getAvanceActual() < this.longitudCarriles){
                terminada = false;
                break;
            }
        }
        return(terminada);
    }
    
    public void setListaConductores(List<Conductor> listaConductores) {
        List<Carril> listaCarriles = asignarCarriles(listaConductores);
        Pista pista = new Pista(listaCarriles);
        juegoActual = new Juego(pista);
    }

    public void avanzar() {
        for(Carril carril : juegoActual.getPista().getListaCarriles()){
            if(carril.getCondutor().getCarro().getAvanceActual() < this.longitudCarriles){
                carril.getCondutor().getCarro().avanzar(Avance.obtenerAvance());
            } else if(carril.getCondutor().getPosFinal() == -1){
                carril.getCondutor().setPosFinal(posFinal++);
            }
        }
    }

    private String getNombrePorPosicion(int posFinal){
        String nombre = "";
        for(Carril carril : juegoActual.getPista().getListaCarriles()){
            if(carril.getCondutor().getPosFinal() == posFinal){
                nombre = carril.getCondutor().getNombre();
            }
        }
        return(nombre);
    }
    
    public void guardarPodio() {
        String nom1erPuesto = this.getNombrePorPosicion(1);
        String nom2doPuesto = this.getNombrePorPosicion(2);
        String nom3erPuesto = this.getNombrePorPosicion(3);
        this.controlBD.guardarPodio(nom1erPuesto,nom2doPuesto,nom3erPuesto);
    }

    public String getNomGanadores() {
        String cadenaRetorno = "Primer puesto: " + this.getNombrePorPosicion(1) + "\n" +
            "Segundo Puesto" + this.getNombrePorPosicion(2) + "\n" +
            "Tercer Puesto" + this.getNombrePorPosicion(3);
        return(cadenaRetorno);
    }

    public List<Conductor> getListaConductores() {
        List<Conductor> listaConductores = this.controlBD.getListaConductores();
        return(listaConductores);
    }

    
  
    
}
