import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Doscientos es un objeto que hereda de Money. Esta clase tiene un valor de tipo entero que igual a 200.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.7)
 */
public class Doscientos extends Money
{
    private int valor;
    /**
     * Constructor de la clase Doscientos.
     * Se crea la imagen del billete 
     */
     public Doscientos()
    {
        GreenfootImage billete200=new GreenfootImage("billete200.jpg");
        billete200.scale(billete200.getWidth()/10, billete200.getHeight()/10);
        setImage(billete200);
        valor=200;
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
