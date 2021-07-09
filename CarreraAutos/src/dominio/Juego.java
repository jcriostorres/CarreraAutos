
package dominio;

/**
 *
 * @author catalina
 */
public class Juego {
  
    private Pista pista;

    public Juego() {
    }

    public Juego(Pista pista) {
        this.pista = pista;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    @Override
    public String toString() {
        return "Juego{" + "pista=" + pista + '}';
    }
    
    
}
