
package dominio;

/**
 *
 * @author catalina
 */
public class Conductor {
    private Carro carro;
    private String nombre;
    private String cedula;
    private int carrerasGanadas;

    public Conductor() {
    }

    public Conductor(Carro carro, String nombre, String cedula) {
        this.carro = carro;
        this.nombre = nombre;
        this.cedula = cedula;
        this.carrerasGanadas = 0;
    }
    
     public Conductor(Carro carro, String nombre, String cedula, int carrerasGanadas) {
        this.carro = carro;
        this.nombre = nombre;
        this.cedula = cedula;
        this.carrerasGanadas = carrerasGanadas;
    }

       
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Conductor{" + "carro=" + carro + ", nombre=" + nombre + ", cedula=" + cedula + '}';
    }

   
    
    
}
