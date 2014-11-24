import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase PepperGas es un enemigo del segundo nivel, que si llega ser tocado por el ladron se le quita
 * una vida al jugador.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.16)
 */
public class PepperGas extends Enemy
{
    private GreenfootImage  gas;
     /**Constante que representa la direccion hacia izquierda del enemigo con valor de -2*/
    private static final int IZQUIERDA=-2;
     /**Constante que representa la direccion hacia derecha del enemigo con valor de 2*/
    private static final int ABAJO=2;
    /**Variable entera que contiene la direccion de las esposas*/
    private int direccion;
    
    /**
     * Constructor de la claae PepperGas.Crea al enemigo apartir de una imagen de GreenfootImage
     * y se le asigna una direccion
     * 
     */
    public PepperGas()
    {
        gas=new GreenfootImage("gas.png"); 
        gas.scale(gas.getWidth()/5,gas.getHeight()/5);
        setImage(gas);
        direccion=ABAJO;
        
    }
    
    /**
     * El método actua permite hacer el movimiento del enemigo, cambiando de direccion cuando se llegue a un limite
     */
    public void act() 
    {
        this.setLocation(getX(), getY()+direccion);
            
        if(this.isAtEdge() || this.isTouching(Lines.class)){
               gas.setTransparency(0);
            }
       this.turn(direccion-2);
       
       super.quitaVida();
    }    
    
   
}
