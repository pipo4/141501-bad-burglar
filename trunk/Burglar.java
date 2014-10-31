import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burglar here.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (a version number or a date)
 */
public class Burglar extends Actor
{
    private GreenfootImage ladron;
    public Burglar()
    {
        ladron=new GreenfootImage("ladron.png"); 
        ladron.scale( ladron.getWidth()/10,ladron.getHeight()/10);
        ladron.mirrorHorizontally();
        setImage(ladron);
    }
    /**
     * Act - do whatever the Burglar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        move();
        validaciones();
        
    }   
    
    public void move()
    {
        if(Greenfoot.isKeyDown("up")) {
          setLocation(getX(),getY()-3);
          GreenfootImage im=new GreenfootImage("imagen1.png");
          ladron=im;
          
          setImage(ladron);
        }
          
        if(Greenfoot.isKeyDown("down")){
         setLocation(getX(),getY()+3);
        }
         
        if(Greenfoot.isKeyDown("right")){
          setLocation(getX()+3,getY());
        }
          
        if(Greenfoot.isKeyDown("left")){
            
          setLocation(getX()-3,getY());
        }
    }
    
    public void validaciones()
    {
        GreenfootImage miImagen=super.getImage();
        if(this.isTouching(Lines.class)){
           
        if(Greenfoot.isKeyDown("up")) {
          setLocation(getX(),getY()+3);
        }
          
        if(Greenfoot.isKeyDown("down")){
         setLocation(getX(),getY()-3);
        }
         
        if(Greenfoot.isKeyDown("right")){
          setLocation(getX()-3,getY());
        }
          
        if(Greenfoot.isKeyDown("left")){
          setLocation(getX()+3,getY());
        }
        }
        
        if(getX()-miImagen.getWidth()/2<=0){
              this.setLocation(getX()+3,getY());
            }
              
        if(getY()+miImagen.getHeight()/2>=getWorld().getHeight()){
              this.setLocation(getX(),getY()-3);
            }
              
    }
}
