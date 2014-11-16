import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Handcuffs es un enemigo que aparece en el nivel 1, y es tocada por el jugador
 * se tendrán que quitar puntos.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.16)
 */
public class Handcuffs extends Enemy
{
    private GreenfootImage esposas;
    /**Constante que representa la direccion hacia arriba del enemigo con valor de -4*/
    private static final int ARRIBA=-4;
     /**Constante que representa la direccion hacia abajo del enemigo con valor de 4*/
    private static final int ABAJO=4;
    /**Variable entera que contiene la direccion de las esposas*/
    private int direccion;
    
    /**
     * Constructor de la clase Handcuffs, crea el enemigo con una imagen de GreenfootImage y
     * se ajusta el tamaño de la imagen
     */
    public Handcuffs() 
    {
        esposas= new GreenfootImage("esposas.png");
        esposas.scale(esposas.getWidth()/6,esposas.getHeight()/6);
        setImage(esposas);
        direccion=ABAJO;
    }    
    
    /**
     * Este método permite que las esposas tengan movimiento y cambien de direccion
     */
    public void act()
    {
        this.setLocation(getX(), getY()+direccion);
        this.turn(direccion*2);
        if(getY()>=305){
            this.direccion=ARRIBA;
        }
         if(getY()<=130){
            this.direccion=ABAJO;
        }
        quitaVida(); 
    }
    
    /**
     * Este método le quita una vida al jugador en caso de que el ladron llegara
     * a tocar las esposas
     */
    public void quitaVida()
    {
        if(this.isTouching(Burglar.class)){
          
            ((BurglarWorld)(getWorld())).getMensajeVidas().add(-1);
           
        }
    }
}
