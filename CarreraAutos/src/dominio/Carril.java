
package dominio;

/**
 *
 * @author catalina
 */
public class Carril {
    
    private int longitud;
    private int numCarril;
    private Conductor conductor;

    public Carril() {
    }

    public Carril(int longitud, int numCarril, Conductor conductor) {
        this.longitud = longitud;
        this.numCarril = numCarril;
        this.conductor = conductor;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getNumCarril() {
        return numCarril;
    }

    public void setNumCarril(int numCarril) {
        this.numCarril = numCarril;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Carril{" + "longitud=" + longitud + ", numCarril=" + numCarril + ", conductor=" + conductor + '}';
    }
    
    
    
    
}
