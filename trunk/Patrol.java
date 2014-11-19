import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Patrol es un enemigo del juego que andará tratanto de atrapar al ladron.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.11)
 */
public class Patrol extends Enemy
{
    private GreenfootImage patrulla; 
    /**Variable que contiene la direccion que tiene la patrulla ,puede ser izquierda o derecha */
    private int direccion;
    /**Constante entera que representa la dirección hacia la derecha con un 2*/
    private static final int DERECHA=2;
    /**Constante entera que representa la dirección hacia la izquierda con un -2*/
    private static final int IZQUIERDA=-2;
    
    /**
     * Constructor de la clase Patrol
     * se crea la imagen de la patrulla 
     */
    public Patrol()
    {
        patrulla=new GreenfootImage("patrulla1.png");
        patrulla.scale(patrulla.getWidth()/4,patrulla.getHeight()/4);
        setImage(patrulla);
        direccion=IZQUIERDA;
    }
    /**
     * El método act() manda llamar a los métodos de la clase Patrol
     */
    public void act() 
    {
        // Add your action code here.
         
        move();
        super.quitaPuntos();
    }    
    
    /**
     * El método move() permite realizar el movimiento de la patrulla
     */
    public void move()
    {
        this.setLocation(getX()+direccion,getY());
         //if(((BurglarWorld)(getWorld())).getNivel() == 0){
           if(getX()<=180){
               this.direccion=DERECHA;
               patrulla.mirrorHorizontally(); 
            }
            if(getX()>=560){
               this.direccion=IZQUIERDA;
               patrulla.mirrorHorizontally(); 
            }
       // }
    }
   
}
