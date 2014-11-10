import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Patrol es un enemigo del juego que andará tratanto de atrapar al ladron.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.9)
 */
public class Patrol extends Enemy
{
    private GreenfootImage patrulla; 
    /**Variable que contiene la direccion que tiene la patrulla ,1=derecha y -1=izquierda */
    private int direccion=-1;
    
    /**
     * Constructor de la clase Patrol
     * se crea la imagen de la patrulla 
     */
    public Patrol()
    {
        patrulla=new GreenfootImage("patrulla1.png");
        patrulla.scale(patrulla.getWidth()/4,patrulla.getHeight()/4);
        setImage(patrulla);
    }
    /**
     * El método act() manda llamar a los métodos de la clase Patrol
     */
    public void act() 
    {
        // Add your action code here.
         
        move();
        quitaPuntos();
    }    
    
    /**
     * El método move() permite realizar el movimiento de la patrulla
     */
    public void move()
    {
        this.setLocation(getX()+direccion,getY());
           if(getX()<=180 || getX()>=560){
               this.direccion=-direccion;
               patrulla.mirrorHorizontally(); 
            }
    }
    
    /**
     * El método quitaPuntos() verifica si un objeto de la clase Patrol toca al ladron, se tendrá que quitar puntos
     */
     public void quitaPuntos()
    {
        if(isTouching(Burglar.class)){
          // if( intersects(((BurglarWorld)(getWorld())).getBurglar())){ 
               int puntos=((BurglarWorld)(getWorld())).getBurglar().getPuntos();
            if(((BurglarWorld)(getWorld())).getMensajePuntos().getValue()>0) { 
               // if(((BurglarWorld)(getWorld())).getBurglar().getPuntos()>49){
                puntos=puntos-1;
               // puntos=puntos-50;
                super.quitaPuntos(puntos);
            }
        }
    }
}
