import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La BurglarRecords muestra la información que se tiene de los jugadores y su puntuación.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.26)
 */
public class BurglarRecords extends World
{

    private FlechaAtras flecha;
    private ScoreBoard score;
    
    /**
     * constructor de la clase BurglarRecords.
     * 
     */
    public BurglarRecords()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(800, 600, 1); 
        
        score=new ScoreBoard(600, 400);
        addObject(score, getWidth()/2, getHeight()/2);
        flecha=new FlechaAtras();
        addObject(flecha,750,550);
    }
    
    /**
     * Checa si se presiono la flecha de regresar, para mandar al jugador al menú principal
     */
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null){
           
           if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==flecha){
                Greenfoot.setWorld(new BurglarMenu());
            }
            
        }   
    }
}


