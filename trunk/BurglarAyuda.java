import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase BurglarAyuda muestra la ayuda que necesita de saber el usuario para el juego.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.26)
 */
public class BurglarAyuda extends World
{
    private FlechaAtras flecha;
    private GreenfootSound clic;
    /**
     * Constructor de la clase BurglarAyuda.
     * 
     */
    public BurglarAyuda()
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
