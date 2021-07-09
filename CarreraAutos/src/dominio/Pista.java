
package dominio;

import java.util.List;

/**
 *
 * @author catalina
 */
public class Pista {
    private List<Carril> listaCarriles;

    public Pista() {
    }

    public List<Carril> getListaCarriles() {
        return listaCarriles;
    }

    public void setListaCarriles(List<Carril> listaCarriles) {
        this.listaCarriles = listaCarriles;
    }

    @Override
    public String toString() {
        return "Pista{" + "listaCarriles=" + listaCarriles + '}';
    }
    
        
}
