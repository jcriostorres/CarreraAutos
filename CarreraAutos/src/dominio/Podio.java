
package dominio;

/**
 *
 * @author catalina
 */
public class Podio {
    
    private Conductor[] vecPodio;

    public Podio() {
    }

    public Podio(Conductor[] vecPodio) {
        this.vecPodio = vecPodio;
    }

    public Conductor[] getVecPodio() {
        return vecPodio;
    }

    public void setVecPodio(Conductor[] vecPodio) {
        this.vecPodio = vecPodio;
    }

    @Override
    public String toString() {
        return "Podio{" + "vecPodio=" + vecPodio + '}';
    }
    
    
    
}
