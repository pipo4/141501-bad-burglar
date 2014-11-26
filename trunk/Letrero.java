import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;

/**
 * La clase Letrero va a permitir mostrar un mensaje cuando el juego termina, dicho mensaje
 * dirá que el juego ha terminado o cuando se ha ganado.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.25)
 */
public class Letrero extends Actor
{
    /**
     * constructor de la clase Letrero que tiene como parametro una cadena que se va a mostrar con una imagen
     * de GreenfootImage
     * @param unaCadena una cadena con el mensaje que se quiere mostrar
     */
    public Letrero(String unaCadena)
    {
       
        GreenfootImage letrero;
        
        letrero= new GreenfootImage(unaCadena,70,java.awt.Color.white,java.awt.Color.green);
        setImage(letrero);
    }
    
    /**
     * Constructor de la clase Letrero sin parámetros que creará un letrero con
     * el nombre del juego en el Menu
     */
    public Letrero()
    {
        GreenfootImage title;
        title=new GreenfootImage("tituloMenu.png");
        setImage(title);
    }
    
}
