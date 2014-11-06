import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Policeman here.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (a version number or a date)
 */
public class Policeman extends Enemy
{
   private SimpleTimer reloj;
    private GreenfootImage police;
    public Policeman()
    {
       
        police=new GreenfootImage("poli1.png");
        setImage(police); 
         
    }
    
    public void act() 
    {
        // Add your action code here.
       reloj=((BurglarWorld)(getWorld())).getReloj();
       
        if(getX()<=745){
         
         if(reloj.millisElapsed()>=500){ 
              setLocation(getX()+1,getY());
              
            }  
           // move(); 
        }
          
         /* if(this.isTouching(Burglar.class)){  
              reloj.mark();
            ((BurglarWorld)(getWorld())).setValor(-1);  
            reloj.mark();
        }*/
       
       /* if(getX()>=745){
             police.mirrorHorizontally();
              setImage(police); 
        }*/
    }    
    
    public void move()
    {
       
         if(reloj.millisElapsed()>=1000){  
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
        
       
    } 
}
