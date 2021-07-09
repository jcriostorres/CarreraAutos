
package dominio;

/**
 *
 * @author catalina
 */
public class Carro {
    private String color;
    private String marca;

    public Carro() {
    }

    public Carro(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" + "color=" + color + ", marca=" + marca + '}';
    }
        
    
    
}
