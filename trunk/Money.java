import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Money here.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (a version number or a date)
 */
public class Money extends Actor
{
    public void acumulaPuntos(int unValor) 
    {
        
        ((BurglarWorld)(getWorld())).getBurglar().setPuntos(unValor);
        
    }    
} 
