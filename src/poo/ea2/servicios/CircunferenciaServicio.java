
package poo.ea2.servicios;

import java.util.Scanner;
import poo.ea2.entidades.Circunferencia;

public class CircunferenciaServicio {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    Circunferencia c1 = new Circunferencia();
    
    public double crearCircunferencia(){
        System.out.print("Por favor, ingrese el radio de la circunferencia > ");
        Double radio = teclado.nextDouble();
        c1.setRadio(radio);
        return c1.getRadio();
    }
    
    public double area(){
        Double area = Math.PI*this.c1.getRadio()*c1.getRadio();
        return area;
    }
    
    public double perimetro(){
        Double perimetro = 2*Math.PI*c1.getRadio();
        return perimetro;
    }
    
}
