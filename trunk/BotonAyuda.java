import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase BotonAyuda va a dibujar un botón que nos dirigira a BurglarAyuda para mostrar
 * la información necesaria del juego.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.25)
 */
public class BotonAyuda extends Actor
{
    private GreenfootImage botonAyuda;
    /**
     * Constrcutor de BotonAyuda, por medio de una GreenfootImage se creará un botón
     * para la ayuda
     */
    public BotonAyuda()
    {
      botonAyuda=new GreenfootImage("botonAyuda.png");
      botonAyuda.scale(botonAyuda.getWidth()/2, botonAyuda.getHeight()/2);
      
      setImage(botonAyuda);
    }
}
