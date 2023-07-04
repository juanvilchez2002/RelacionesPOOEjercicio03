
package servicios;

import entidad.Baraja;
import entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class BarajaServicio {
    
    Baraja mazoInicial = new Baraja();
    Baraja mazoEntrego = new Baraja();
    Scanner consola = new Scanner(System.in);
    
    public void crearBajara(){
        //creamos dos arraylist de cartas
        ArrayList<Carta> mi = new ArrayList();
        ArrayList<Carta> me = new ArrayList();
        
        //enviamos el ArrayList a me
        mazoEntrego.setCartas(me);
        
        //creamos arraylist q tiene los numeros y palos
        String[] palo = {"Basto", "Copa", "Espada", "Oro"};
        
        //adicionamos las cartas a mi
        for(int i=1; i<=12; i++){
            for(int j=0; j<palo.length; j++){
                if(i==8 || i==9){
                    continue;
                }
                    mi.add(new Carta( i, palo[j]));
                
            }
        }
        
        mazoInicial.setCartas(mi);
        System.out.println("Baraja creada!!!");
    }
    
    public void bajararBaraja(){
        Collections.shuffle(mazoInicial.getCartas());
        System.out.println("Cartas Barajadas!!!");
    }
    
    public void cartasMonton(){
        System.out.println("Mostrando las Cartas Usadas\n");
        if(mazoEntrego.getCartas().isEmpty()){
            System.out.println("No hay cartas");            
        }else{
            int i=0;
            for(Carta c: mazoEntrego.getCartas() ){
                System.out.println(i+". "+c.getPalo()+"-"+c.getNumero()+"");
                i+=1;
            }
        }
    }
    
    public void siguienteCarta(){
        if(mazoInicial.getCartas().isEmpty()){            
            System.out.println("No hay cartas en la baraja");  
        }else{
            System.out.print("Carta entregada: ");
            System.out.println(mazoInicial.getCartas().get(0));
            ArrayList<Carta> c = mazoEntrego.getCartas();
            c.add(mazoInicial.getCartas().remove(0));
            mazoEntrego.setCartas(c);
        }
    }
    
    public void cartasDisponibles(){
        if(mazoInicial.getCartas().isEmpty()){
            System.out.println("No hay cartas disponibles!!");
        }else{
            System.out.println("Quedan: "+mazoInicial.getCartas().size()+" cartas");
        }
    }
    
    public void darCartas(){
        System.out.print("Nro de Cartas: ");
        int num = consola.nextInt();
        
        if(num <= mazoInicial.getCartas().size()){
            ArrayList<Carta> c = mazoEntrego.getCartas();
            for(int i=0; i<num; i++){
                System.out.print("Carta entregada: ");
                System.out.println(mazoInicial.getCartas().get(0));                
                c.add(mazoInicial.getCartas().remove(0));
            }
            mazoEntrego.setCartas(c);
        }else{
            System.out.println("No hay suficientes cartas dispoibles!!!");
        }
    }
    
    public void mostrarBarajas(){
        System.out.println("Mostrando las Cartas Disponibles\n");
        if(mazoInicial.getCartas().isEmpty()){
            System.out.println("No hay cartas");            
        }else{
            int i=1;
            for(Carta c: mazoInicial.getCartas() ){
                System.out.println(i+". "+c.getPalo()+"-"+c.getNumero());
                i+=1;
            }
        }
    }
}
