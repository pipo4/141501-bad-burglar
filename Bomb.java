import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Bomb aparece como enemigo en el tercer nivel y le quita una vida al jugador
 * en case de que llegue a tocarla.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.16)
 */
public class Bomb extends Enemy
{
    private GreenfootImage bomba;
    private GreenfootImage bomba0;
    private GreenfootImage bomba1;
   //private GreenfootImage police1izquierda;
   private GreenfootImage bomba2;
   //private GreenfootImage police2izquierda;
   private GreenfootImage bomba3;
   //private GreenfootImage police3izquierda;
   private GreenfootImage bomba4;
   //private GreenfootImage police4izquierda;
   private int avanza;
   private int direccion;
    
    /**
     * Constructor de la clase Bomb. Crea al enemigo con una imagen de GreenfootImage
     */
    public Bomb()
    {
        
        avanza=0;
        bomba0= new GreenfootImage("bomba5.png");//0
        bomba0.scale(bomba0.getWidth()/2, bomba0.getHeight()/2);
        
        bomba1= new GreenfootImage("bomba6.png");//1
        bomba1.scale(bomba1.getWidth()/2, bomba1.getHeight()/2);
        
        bomba2= new GreenfootImage("bomba7.png");//2
        bomba2.scale(bomba2.getWidth()/2, bomba2.getHeight()/2);
        
        bomba3= new GreenfootImage("bomba8.png");//4
        bomba3.scale(bomba3.getWidth()/2, bomba3.getHeight()/2);
        
        bomba4= new GreenfootImage("bomba5.png");
        bomba4.scale(bomba4.getWidth()/2, bomba4.getHeight()/2);
        
        setImage(bomba0);
        direccion=DERECHA;
    }
    
    /**
     * se manda llamar al metodo de quitaVida, cuando el enemigo haya tocado una bomba
     */
    public void act() 
    { 
        /*this.setLocation(getX()+direccion,getY());
        if(getX()>=310){
               this.direccion=IZQUIERDA;
            }
            if(getX()<=145){
                this.direccion=DERECHA;
            }*/
          
        if(this.isTouching(Burglar.class)){   
         camina(); 
         
        }
        
         
        
        
       super.quitaVida();
    }  
    
    public void camina()
   {
       avanza++;
       if(avanza>=10){
           avanza=0;
        }
           move();
        
   }
    
   public void move()
    {
         
        switch(avanza){
            case 0: if(direccion==DERECHA){
                   bomba0=bomba0;
                    }
            break;
            case 2: if(direccion==DERECHA){
                   bomba0=bomba1;
                    }
                    /*else{
                        police=police1izquierda;
                    }*/
                   
            break;
            
            case 4: if(direccion==DERECHA){
                 
                    bomba0=bomba2;
                   
                    }
                   /* else{
                        police=police2izquierda;
                    }*/
                   
            break;
            
            case 6: if(direccion==DERECHA){
                
                    bomba0=bomba3;
                   
                    }
                    /*else{
                        police=police4izquierda;
                    }*/
                    
            break;
            
        }   
        
    
        setImage(bomba0);
        
    } 
    
}
