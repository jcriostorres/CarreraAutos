
package dominio;

/**
 *
 * @author catalina
 */
public class Carril {
    
    private int longitud;
    private int numCarril;
    private Conductor condutor;

    public Carril() {
    }

    public Carril(int longitud, int numCarril, Conductor condutor) {
        this.longitud = longitud;
        this.numCarril = numCarril;
        this.condutor = condutor;
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

    public Conductor getCondutor() {
        return condutor;
    }

    public void setCondutor(Conductor condutor) {
        this.condutor = condutor;
    }

    @Override
    public String toString() {
        return "Carril{" + "longitud=" + longitud + ", numCarril=" + numCarril + ", condutor=" + condutor + '}';
    }
    
    
    
    
}
