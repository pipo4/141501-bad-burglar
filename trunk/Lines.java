import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lines here.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (a version number or a date)
 */
public class Lines extends Actor
{
    public Lines(int dir)
    {
        this.turn(dir);
        GreenfootImage imagen=new GreenfootImage("brick.png");
        imagen.scale(imagen.getWidth()*4,imagen.getHeight());
        imagen.setColor(java.awt.Color.blue);
        imagen.fill();
        setImage(imagen);
    } 
    
}
