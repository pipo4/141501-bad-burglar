import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Policeman es un enemigo del juego que va a tener movimiento en el escenario, tratando de atrapar al ladron.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.11)
 */
public class Policeman extends Enemy
{
   private GreenfootImage police;
   private GreenfootImage police1;
   private GreenfootImage police1izquierda;
   private GreenfootImage police2;
   private GreenfootImage police2izquierda;
   private GreenfootImage police4;
   private GreenfootImage police4izquierda;
   private GreenfootImage police5;
   private GreenfootImage police5izquierda;
   
   /**Variable entera que va contando los pasos del policia*/
   private int avanza;
   /**Variable que contiene a la dirección que lleva el policia, puede ser izquierda o derecha.*/
   private int direccion;
   /**Constante entera que representa la dirección hacia la derecha con un 1*/
   private static final int DERECHA=1;
   /**Constante entera que representa la dirección hacia la izquierda con un -1*/
   private static final int IZQUIERDA=-1;
    /**
     * Constructor de la clase Policeman : se crea el personjae con una imagen de Greenfoot
     */
    public Policeman()
    {
        avanza=0;
        police=new GreenfootImage("poli1.png");
       
        police1=new GreenfootImage("poli2.png");
        police1izquierda=new GreenfootImage("poli2.png");
        police1izquierda.mirrorHorizontally();
        
        police2=new GreenfootImage("poli3.png"); 
        police2izquierda=new GreenfootImage("poli3.png");
        police2izquierda.mirrorHorizontally();
        
        
        police4=new GreenfootImage("poli6.png"); 
        police4izquierda=new GreenfootImage("poli6.png");
        police4izquierda.mirrorHorizontally();
        
        police5=new GreenfootImage("poli7.png");
        police5izquierda=new GreenfootImage("poli7.png");
        police5izquierda.mirrorHorizontally();
        
       
        setImage(police); 
        direccion=DERECHA;
    }
    
     /**
     *En el método act() de la clase Policeman se llaman a los métodos del movimiento del policia y el método
     * para quitar puntos. También se le cambia la dirección al policia cuando llega a un limite.
     */
    public void act() 
    {
        // Add your action code here.
       
       this.setLocation(getX()+direccion,getY());
           if(getX()>=810){
               this.direccion=IZQUIERDA;
            }
            if(getX()<=250){
                this.direccion=DERECHA;
            }
       
         camina();
            
         quitaPuntos();
         
       
   }    
    
   /**
    * Éste método incrementa la variable avanza que va a tener un valor máximo de 8, que va a representar la velocidad
    * que lleva , cuando la variable avanza es mayor o igual que cuatro se vuelve a reiniciar
    * para que de el efecto que el policia camina.
    */
   public void camina()
   {
       avanza++;
       if(avanza>=8){
           avanza=0;
        }
           move();
        
   }
   
    /**
     * El método move() permite hacer el movimiento del ladron. El ladron tiene una dirección, y cuando llega al
     * límite donde debe aparecer, se regresa cambiando la dirección
     */
    public void move()
    {
         
        switch(avanza){
            case 0: if(direccion==DERECHA){
                    police=police1;
                    }
                    else{
                        police=police1izquierda;
                    }
            break;
            
            case 1: if(direccion==DERECHA){
                    police=police2;
                    }
                    else{
                        police=police2izquierda;
                    }
            break;
            
            case 2: if(direccion==DERECHA){
                    police=police4;
                    }
                    else{
                        police=police4izquierda;
                    }
            break;
            
            case 3: if(direccion==DERECHA){
                    police=police5;
                    }
                    else{
                        police=police5izquierda;
                    }
            break;
            
        }
        
        setImage(police);
      
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

