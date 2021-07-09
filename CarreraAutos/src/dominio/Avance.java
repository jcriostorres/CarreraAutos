
package dominio;

/**
 *
 * @author catalina
 */
public class Avance {
    
    private static int obtenerNumAleatorio(){
        int numAleatorio = -1;
        while(numAleatorio < 1 || numAleatorio > 6){
            numAleatorio = (int) (10 * Math.random());
        }
        return(numAleatorio);
    }
    
    public static int obtenerAvance(){
        int numAletorio = obtenerNumAleatorio();
        return(numAletorio * 100);
    }
    
}
