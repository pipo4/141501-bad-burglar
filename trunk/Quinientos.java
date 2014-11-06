import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quinientos here.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (a version number or a date)
 */
public class Quinientos extends Money
{
    private int valor;
     public Quinientos()
    {
        GreenfootImage billete500=new GreenfootImage("billete500.jpg");
        billete500.scale(billete500.getWidth()/10, billete500.getHeight()/10);
        setImage(billete500);
        valor=500;
    }
   
    public void acumulaPuntos() 
    {
         int puntos=((BurglarWorld)(getWorld())).getBurglar().getPuntos();
         puntos=puntos+this.valor;
         super.acumulaPuntos(puntos);
    } 
}
