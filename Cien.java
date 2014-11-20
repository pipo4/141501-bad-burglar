import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Cien es una subclase de Money y tendrá que ser recogido por el jugador para acumular 100 puntos
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.18)
 */
public class Cien extends Money
{
     private int valor;
    /**
     * Constructor de la clase Cien.
     * Se crea la imagen del billete y se asigna el valor a 100.
     */
     public Cien()
    {
        GreenfootImage billete100=new GreenfootImage("billete100.jpg");
        billete100.scale(billete100.getWidth()/10, billete100.getHeight()/10);
        setImage(billete100);
        valor=100;
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
