import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *La clase Cincuenta es un billete que tiene un valor de cincuenta puntos para el ladron.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.7)
 */
public class Cincuenta extends Money
{
    private int valor;
    /**
     * Constructor de la clase Cincuenta 
     * Se crea la imagen del billete.
     */
    public Cincuenta()
    {
        GreenfootImage billete50=new GreenfootImage("billete50.jpg");
        billete50.scale(billete50.getWidth()/10, billete50.getHeight()/10);
        setImage(billete50);
        
        valor=50;
        
    }
     
     
    /**
     * Este metodo acumula los puntos del ladrón según sea el valor del billete
     * 
     */
    public void  acumulaPuntos() 
    {
         
         int puntos=((BurglarWorld)(getWorld())).getBurglar().getPuntos();
         puntos=puntos+this.valor;
         super.acumulaPuntos(puntos);
         
    }    
}
