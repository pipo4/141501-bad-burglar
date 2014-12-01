import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase BotonCreditos dibuha un botón que al ser presionado mostrará los créditos del juego.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.30)
 */
public class BotonCreditos extends Actor
{
     private GreenfootImage botonCreditos;
    /**
     * Constrcutor de BotonRecords, por medio de una GreenfootImage se creará un botón
     * para los creditos del juego
     */
    public BotonCreditos()
    {
      botonCreditos=new GreenfootImage("botonCréditod.png");
      botonCreditos.scale(botonCreditos.getWidth()/2, botonCreditos.getHeight()/2);
      
      setImage(botonCreditos);
    }   
}
