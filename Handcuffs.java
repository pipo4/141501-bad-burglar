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
    /**Constante que representa la direccion hacia arriba del enemigo con valor de -3*/
    private static final int ARRIBA=-3;
     /**Constante que representa la direccion hacia abajo del enemigo con valor de 3*/
    private static final int ABAJO=3;
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
        if(((BurglarWorld)(getWorld())).getBurglar().getNivel()==1){
          this.setLocation(getX(), getY()+direccion);
            if(getY()>=305){ 
              this.direccion=ARRIBA; 
            }
             if(getY()<=130){
               this.direccion=ABAJO;
             }
           
        }
        
         if(((BurglarWorld)(getWorld())).getBurglar().getNivel()==2 || ((BurglarWorld)(getWorld())).getBurglar().getNivel()==3){
          this.setLocation(getX()+direccion, getY()+direccion);
            if(getY()>=270){ 
              this.direccion=ARRIBA; 
             }
             if(getY()<=130){
               this.direccion=ABAJO;
             }
          
        }
        
       this.turn(direccion*2);
        
       
        quitaVida(); 
    }
    
    /**
     * Este método le quita una vida al jugador en caso de que el ladron llegara
     * a tocar las esposas
     */
    public void quitaVida()
    {
        if(this.isTouching(Burglar.class)){
          
            ((BurglarWorld)(getWorld())).restaVidas();
           
        }
    }
}
