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
    private static final int DERECHA=2;
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
        direccion=IZQUIERDA;
        
    }
    
    /**
     * El método actua permite hacer el movimiento del enemigo
     */
    public void act() 
    {
        this.setLocation(getX()+direccion, getY());
            if(getX()>=450){ 
              this.direccion=IZQUIERDA; 
             }
             if(getX()<=150){
               this.direccion=DERECHA;
             }
       this.turn(direccion-2);
       
       super.quitaVida();
    }    
    
   
}
