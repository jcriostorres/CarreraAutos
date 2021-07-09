
package dominio;

/**
 *
 * @author catalina
 */
public class Conductor {
    private Carro carro;
    private String nombre;

    public Conductor() {
    }

    public Conductor(Carro carro, String nombre) {
        this.carro = carro;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Conductor{" + "carro=" + carro + ", nombre=" + nombre + '}';
    }
    
    
    
}
