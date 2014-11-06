import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cincuenta here.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (a version number or a date)
 */
public class Cincuenta extends Money
{
    private int valor;
    public Cincuenta()
    {
        GreenfootImage billete50=new GreenfootImage("billete50.jpg");
        billete50.scale(billete50.getWidth()/10, billete50.getHeight()/10);
        setImage(billete50);
        
        valor=50;
        
    }
     
    public void  acumulaPuntos() 
    {
         
         int puntos=((BurglarWorld)(getWorld())).getBurglar().getPuntos();
         puntos=puntos+this.valor;
         super.acumulaPuntos(puntos);
         
    }    
}
