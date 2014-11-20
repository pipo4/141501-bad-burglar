import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Veinte es una subclase de Money, tendrá que ser recogido por el jugador para acumular 20 puntos.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.18)
 */
public class Veinte extends Money
{
    private int valor;
    /**
     * Constructor de la clase Cien.
     * Se crea la imagen del billete y se asigna su valor a 20.
     */
     public Veinte()
    {
        GreenfootImage billete20=new GreenfootImage("billete20.jpg");
        billete20.scale(billete20.getWidth()/10, billete20.getHeight()/10);
        setImage(billete20);
        valor=20;
    }
    
    /**
     * Este metodo va acumulando los puntos que lleva el ladron segun sea el valor del billete
     * 
     */
   public void acumulaPuntos() 
    {
         int puntos=((BurglarWorld)(getWorld())).getBurglar().getPuntos();
         puntos=puntos+this.valor;
         super.acumulaPuntos(puntos);
    }   
}
