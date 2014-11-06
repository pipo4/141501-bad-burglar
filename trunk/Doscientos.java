import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Doscientos here.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (a version number or a date)
 */
public class Doscientos extends Money
{
    private int valor;
     public Doscientos()
    {
        GreenfootImage billete200=new GreenfootImage("billete200.jpg");
        billete200.scale(billete200.getWidth()/10, billete200.getHeight()/10);
        setImage(billete200);
        valor=200;
    }
    
   public void acumulaPuntos() 
    {
         int puntos=((BurglarWorld)(getWorld())).getBurglar().getPuntos();
         puntos=puntos+this.valor;
         super.acumulaPuntos(puntos);
    }   
  
}
