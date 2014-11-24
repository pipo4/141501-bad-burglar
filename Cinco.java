import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *La clase Cinco va a permitir al jugador acumular puntos cuando recoga esta moneda
 *con valor de 5.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.22)
 */
public class Cinco extends Money
{
    private int valor;
    
    /**
     * constructor de la clase Cinco, que crea por medio de una imagen de GreenfootImage una
     * moneda de 5 pesos
     */
    public Cinco() 
    {   GreenfootImage moneda5=new GreenfootImage("moneda5.png");
        moneda5.scale(moneda5.getWidth()/6, moneda5.getHeight()/6);
        setImage(moneda5);
        
        valor=5;
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
