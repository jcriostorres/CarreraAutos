package control;

import Modelo.ManipulacionBD;
import dominio.*;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private Juego juegoActual;
    private ManipulacionBD controlBD;
    private int longitudCarriles;
    
    public Controlador(){
        this.controlBD = new ManipulacionBD();
        this.juegoActual = null;
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
    
    public void setListaConductores(List<Conductor> listaConductores) {
        List<Carril> listaCarriles = asignarCarriles(listaConductores);
        Pista pista = new Pista(listaCarriles);
        juegoActual = new Juego(pista);
    }

    
  
    
}
