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
    public Bomb()
    {
        bomba= new GreenfootImage("bomb.png");
        bomba.scale(bomba.getWidth()/2, bomba.getHeight()/2);
        setImage(bomba);
    }
    
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
