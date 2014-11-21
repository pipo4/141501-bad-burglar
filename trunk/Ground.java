import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Ground aparece en el último nivel y cuando el jugador llegue a la meta
 * despues de recoger el dinerohabrá ganado el juego.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.20)
 */
public class Ground extends Actor
{
    /**
     * constructor de la clase ground que crea una imagen de greenfootImage para
     * representar la meta a la que tiene que llegar el jugador
     */
    public Ground()
    {
        GreenfootImage imagen=new GreenfootImage("images (2).jpg"); 
        
        imagen.scale(imagen.getWidth()/2, imagen.getHeight()/5);
        
        setImage(imagen);
    }
       
}
