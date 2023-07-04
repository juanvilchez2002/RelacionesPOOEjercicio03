
package entidad;


public class Carta {
    //atrtibutos
    private int numero;
    private String palo;
    
    //constructor vacio
    public Carta() {
    }
    
    //constructor con parametros
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    //setters y getters
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    //

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
}
