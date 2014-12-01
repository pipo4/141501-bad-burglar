import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase BurglarCreditos muestra los créditos del juego.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.30)
 */
public class BurglarCreditos extends World
{
    private FlechaAtras flecha;
    private GreenfootSound clic;
    /**
     * Constructor de la clase BurglarCreditos.
     * 
     */
    public BurglarCreditos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        flecha=new FlechaAtras();
        addObject(flecha,750,565);
        clic=new GreenfootSound("select.wav");
    }
    
    /**
     * Verifica si se hizo clic sobre la flecha para regresar al menú principal
     */
    public void act()
    {
     if(Greenfoot.getMouseInfo()!=null){ 
           
           if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==flecha){
                clic.play();
                Greenfoot.setWorld(new BurglarMenu());
            }
            
        }   
    }
}
