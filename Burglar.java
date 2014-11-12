import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Burglar contiene al personaje principal del juego, un ladrón. En esta clase se crea una
 * imagen del personaje que va a tener vidas y puntos , asi como movimiento del ladrón en el escenario
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.7)
 */
public class Burglar extends Actor
{
    private GreenfootImage ladron;
    private int puntos;
    private int vidas;
    
    /**
     * Constructor de la clase Burglar.
     * Crea la imagen del ladron.
     */
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
     * En el método act() , se mandan llamar a los métodos que contiene el movimiento del ladron, 
     * validaciones para que no se salga del escenario y se acumulan los puntos
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
    
    /**
     * Éste método contiene el movimiento del personaje (arriba,abajo,izquierda,derecha).
     */
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
    
    /**
     * Este método contiene las validaciones necesarias para que el ladrón no pase el limite
     * del laberinto, que fue dibujado con la clase Lines
     */
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
    
    /**
     * Este método contiene un parámetro de tipo entero, el cual se agregará al atributo puntos
     * del ladrón e ir acumulándolos
     * @param unosPuntos el valor entero de los puntos para el ladron
     */
    public void setPuntos(int unosPuntos)
    {
        puntos=unosPuntos;
    }
    
    /**
     * Este método regresa el valor entero de los puntos que se hayan acumulado
     * @return puntos Los puntos que lleva el ladrón
     */
    public int getPuntos()
    {
        return puntos;
    }
    
   
}
