import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Bomb aparece como enemigo en el tercer nivel y le quita una vida al jugador
 * en case de que llegue a tocarla.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.16)
 */
public class Bomb extends Enemy
{
    private GreenfootImage bomba0;
    
    /**
     * Constructor de la clase Bomb. Crea al enemigo con una imagen de GreenfootImage
     */
    public Bomb()
    {
        bomba0= new GreenfootImage("bomb.png");
        bomba0.scale(bomba0.getWidth()/2, bomba0.getHeight()/2);
        
        setImage(bomba0);
    }
    
    /**
     * se manda llamar al metodo de quitaVida, cuando el nemigo haya tocado una bomba
     */
    public void act() 
    {
         
       super.quitaVida();
    }    
    
    
}
