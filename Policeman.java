import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Policeman es un enemigo del juego que va a tener movimiento en el escenario, tratando de atrapar al ladron.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.9)
 */
public class Policeman extends Enemy
{
   private SimpleTimer reloj;
    private GreenfootImage police;
    /**variable que contiene a la dirección que lleva el policia, 1=derecha y -1=izquierda*/
    private int direccion=1;
    /**
     * Constructor de la clase Policeman : se crea el personjae con una imagen de Greenfoot
     */
    public Policeman()
    {
       
        police=new GreenfootImage("poli1.png");
        setImage(police); 
        
    }
    
     /**
     *En el método act() de la clase Policeman se llaman a los métodos del movimiento del policia y cuando se van a quitar puntos.
     */
    public void act() 
    {
        // Add your action code here.
       reloj=((BurglarWorld)(getWorld())).getReloj();
      
         move();
         
         quitaPuntos();
   }    
    
    /**
     * El método move() permite hacer el movimiento del ladron
     */
    public void move()
    {
        this.setLocation(getX()+direccion,getY());
           if(getX()>=810 || getX()<=250){
               this.direccion=-direccion;
               police.mirrorHorizontally();
            }
       /*  if(reloj.millisElapsed()>=1000){  
            GreenfootImage police1=new GreenfootImage("poli2.png");
            police=police1;
            setImage(police); 
        }
            if(reloj.millisElapsed()>=2000){
               GreenfootImage police2=new GreenfootImage("poli3.png"); 
               police=police2;
               setImage(police);
              }
              if(reloj.millisElapsed()>=3000){
               GreenfootImage police3=new GreenfootImage("poli4.png"); 
               police=police3;
               setImage(police);
              }
                if(reloj.millisElapsed()>=4000){
               GreenfootImage police4=new GreenfootImage("poli5.png"); 
               police=police4;
               setImage(police);
              }
                if(reloj.millisElapsed()>=5000){
                  GreenfootImage police5=new GreenfootImage("poli6.png"); 
                  police=police5;
                 setImage(police);
                }
                  if(reloj.millisElapsed()>=6000){
                    GreenfootImage police6=new GreenfootImage("poli7.png"); 
                    police=police6;
                    setImage(police); 
                  }
                    if(reloj.millisElapsed()>=7000){
                      GreenfootImage police7=new GreenfootImage("poli8.png"); 
                       police=police7;
                      setImage(police);
                    }
                       if(reloj.millisElapsed()>=8000){
                          GreenfootImage police8=new GreenfootImage("poli9.png"); 
                          police=police8;
                          setImage(police);
                        }
        */
       
    } 
    
    /**
     * El método quitaPuntos() verifica si un objeto de la clase Policeman toca al ladron, se tendrá que quitar puntos
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

