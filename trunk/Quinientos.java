import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Quinientos es un billete que tiene un valor de 500 puntos para el jugador.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.7)
 */
public class Quinientos extends Money
{
    private int valor;
    /**
     * Constructor de la clase Quinientos 
     * Se crea la imagen del billete.
     */
     public Quinientos()
    {
        GreenfootImage billete500=new GreenfootImage("billete500.jpg");
        billete500.scale(billete500.getWidth()/10, billete500.getHeight()/10);
        setImage(billete500);
        valor=500;
    }
   
    /**
     * Este metodo acumula los puntos del ladron segun el valor del billete
     * 
     */
    public void acumulaPuntos() 
    {
         int puntos=((BurglarWorld)(getWorld())).getBurglar().getPuntos();
         puntos=puntos+this.valor;
         super.acumulaPuntos(puntos);
    } 
}
