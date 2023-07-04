
package app;

import servicios.BarajaServicio;


public class App {


    public static void main(String[] args) {
        
        BarajaServicio bs = new BarajaServicio();
        
        bs.crearBajara();
        bs.bajararBaraja();
        bs.cartasDisponibles();
        bs.siguienteCarta();
        bs.cartasMonton();
        
        bs.cartasDisponibles();
        bs.darCartas();
        bs.cartasDisponibles();
        bs.cartasMonton();
    }
    
}
