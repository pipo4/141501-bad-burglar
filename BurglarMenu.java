import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *La clase BurglarMenu contiene al menu principal del juego.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.24)
 */
public class BurglarMenu extends World
{
 
    private Play play;
    private MouseInfo info;
    private GreenfootSound clic;
    /**
     * Constructor de BurglarMenu. Crea un nuevo mundo y los botones del menú
     * 
     */
    public BurglarMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        play=new Play();
        addObject(play,getWidth()/2,getHeight()/2);
        clic=new GreenfootSound("select.wav");
    }
    
    /**
     * Invoca a los métodos del BurglarMenu
     */
    public void act()
    {
        verifica();
    }
    
    /**
     * El método verifica checa los botones del menú , y según sea el botón presionado hace 
     * la acción indicada
     */
    public void verifica()
    {
        if(Greenfoot.getMouseInfo()!=null){ 
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == play){
                clic.play();
                Greenfoot.delay(40);
                Greenfoot.setWorld(new BurglarWorld());
            }
           
        }
    }


    
}
