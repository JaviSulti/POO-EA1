
package poo.ea2.entidades;

public class Circunferencia {

    //Atributos
    private Double radio;
    
    //Constructor vacio
    public Circunferencia() {
    }
        
    /*Constructur que inicialice el radio pasado como parametro.
    Constructor con los atributos.
    */
    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
       
}
