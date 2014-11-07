import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    
    public void act() 
    {
        // Add your action code here.
         
    }  
    public void quitaPuntos(int unValor) 
    {
        
        ((BurglarWorld)(getWorld())).getBurglar().setPuntos(unValor);
        
    } 
   
}
