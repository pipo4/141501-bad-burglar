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
    private int puntos;
    private int vidas;
    
    public Burglar()
    {
        ladron=new GreenfootImage("ladron.png"); 
        ladron.scale( ladron.getWidth()/12,ladron.getHeight()/12);
        ladron.mirrorHorizontally();
        setImage(ladron);
        puntos=0;
        vidas=3;

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
        
        if(isTouching(Cincuenta.class)){
         ((BurglarWorld)(getWorld())).getCincuenta().acumulaPuntos();   
          removeTouching(Cincuenta.class);
        }
        
        if(isTouching(Doscientos.class)){
          ((BurglarWorld)(getWorld())).getDoscientos().acumulaPuntos();
          removeTouching(Doscientos.class);
        }
        
        if(isTouching(Quinientos.class)){
          ((BurglarWorld)(getWorld())).getQuinientos().acumulaPuntos();
          removeTouching(Quinientos.class);
        }
       
    }   
    
    public void move()
    {
        if(Greenfoot.isKeyDown("up")) {
          setLocation(getX(),getY()-3);
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
           
        if(Greenfoot.isKeyDown("up")){ 
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
    
    public void setPuntos(int unosPuntos)
    {
        puntos=unosPuntos;
    }
    
    public int getPuntos()
    {
        return puntos;
    }
}
