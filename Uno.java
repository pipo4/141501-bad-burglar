import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Uno es una subclase de Money, que va a permitir al jugador acumular puntos cuando recoga
 * una de moneda con valor de 1 de esta clase.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.22)
 */
public class Uno extends Money
{
    private int valor;
    
    /**
     * Constructor de la clase Uno que crea una moneda de GreenfootImage y se le
     * asigna un valor de 1.
     */
    public Uno()
    {   GreenfootImage moneda1=new GreenfootImage("moneda1.png");
        moneda1.scale(moneda1.getWidth()/6, moneda1.getHeight()/6);
        setImage(moneda1);
        
        valor=1;
    }
     
     /**
     * Este metodo va acumulando los puntos que lleva el jugador cuando recoge dinero
     * 
     */
   public void acumulaPuntos() 
    {
         int puntos=((BurglarWorld)(getWorld())).getBurglar().getPuntos();
         puntos=puntos+this.valor;
         super.acumulaPuntos(puntos);
    }  
}

