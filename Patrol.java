import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Patrol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Patrol extends Enemy
{
    private GreenfootImage patrulla; 
    public Patrol()
    {
        patrulla=new GreenfootImage("patrulla1.png");
        patrulla.scale(patrulla.getWidth()/4,patrulla.getHeight()/4);
        setImage(patrulla);
    }
    /**
     * Act - do whatever the Patrol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(getX()>180){
          setLocation(getX()-1,getY());
        }
        
        
    }    
}
