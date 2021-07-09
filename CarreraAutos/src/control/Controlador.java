package control;

import Modelo.ManipulacionBD;
import dominio.Conductor;

public class Controlador {

    private ManipulacionBD controlBD;
    
    public Controlador(){
        this.controlBD = new ManipulacionBD();
    }
    
    public void ingresarCorredor(Conductor conductor) {
        controlBD.ingresarCorredor(conductor);
    }

    public boolean existeUsuario(String cedula) {
        return(this.controlBD.existeUsuario(cedula));
    }

    
  
    
}
