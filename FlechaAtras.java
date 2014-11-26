import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La flecha FlechaAtras va a permitir regresar al menú del juego.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.26)
 */
public class FlechaAtras extends Actor
{
    private GreenfootImage flecha;
    public FlechaAtras()
    {
        flecha=new GreenfootImage("flecha.png");
        flecha.scale(flecha.getWidth()/2, flecha.getHeight()/2);
        setImage(flecha);
    }
}
