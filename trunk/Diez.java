import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Diez permitirá al jugador acumular puntos cuando recoga esta moneda con valor de 10.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.22)
 */
public class Diez extends Money
{
    private int valor; 
    
    /**
     * constructor de la clase Diez que crea una moneda de 10 pesos con
     * una imagen de GreenfootImage
     */
    public Diez()
    {
        GreenfootImage moneda10=new GreenfootImage("moneda10.png");
        moneda10.scale(moneda10.getWidth()/6, moneda10.getHeight()/6);
        setImage(moneda10);
        
        valor=10;
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
