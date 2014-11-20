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
    private GreenfootImage bomba;
    
    /**
     * Constructor de la clase Bomb. Crea al enemigo con una imagen de GreenfootImage
     */
    public Bomb()
    {
        bomba= new GreenfootImage("bomb.png");
        bomba.scale(bomba.getWidth()/2, bomba.getHeight()/2);
        setImage(bomba);
    }
    
    /**
     * se manda llamar al metodo de quitaVida, cuando el nemigo haya tocado una bomba
     */
    public void act() 
    {
        super.quitaVida();
    }    
    
    
}
