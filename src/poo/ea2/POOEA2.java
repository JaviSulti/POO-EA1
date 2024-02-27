
package poo.ea2;

import poo.ea2.servicios.CircunferenciaServicio;

public class POOEA2 {
    
    public static void main(String[] args) {

        CircunferenciaServicio cs = new CircunferenciaServicio();
        
        System.out.println("Como el radio ingresado es: " + cs.crearCircunferencia()+",");
        System.out.println("El area resultante es: " + cs.area());
        System.out.println("El perimetro resultante es: "+ cs.perimetro());
        
    }
    
}
