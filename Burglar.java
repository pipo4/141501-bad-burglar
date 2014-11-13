import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Burglar contiene al personaje principal del juego, un ladrón. En esta clase se crea una
 * imagen del personaje que va a tener vidas y puntos , asi como movimiento del ladrón en el escenario
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.12) 
 */
public class Burglar extends Actor
{
    private GreenfootImage ladron;
    private GreenfootImage ladronizquierda;
    private GreenfootImage ladronizquierda1;
    private GreenfootImage ladronizquierda2;
    private GreenfootImage ladronizquierda3;
    private GreenfootImage ladronderecha;
    private GreenfootImage ladronderecha1;
    private GreenfootImage ladronderecha2;
    private GreenfootImage ladronderecha3;
    /**Variable para acumular los puntos que lleva el ladrón*/
    private int puntos;
    /**Variable que contiene las vidas que tiene el jugador*/
    private int vidas;
    /**Variable que permitirá avanzar al personaje, contiene los pasos del personaje*/
    private int avanza;
    /**Contiene la direccion que lleva el ladron*/
    private int direccion;
    /**Constante que representa la dirección hacia la derecha */
    private static final int DERECHA=3;
    /**Constante que representa la dirección hacia la izquierda */
    private static final int IZQUIERDA=-3;
    /**Constante que representa la dirección hacia arriba */
    private static final int ARRIBA=-3;
    /**Constante que representa la dirección hacia abajo */
    private static final int ABAJO=3;
    /**variable booleana que con un true indica que el personaje esta parado, con un false indica que el personaje esta caminando*/
    private boolean parado;
    /**
     * Constructor de la clase Burglar.
     * Crea la imagen del ladron.
     */
    public Burglar()
    {
        ladron=new GreenfootImage("l1.png"); 
        ladron.scale( ladron.getWidth()/2,ladron.getHeight()/2); 
        
        ladronizquierda=new GreenfootImage("l1.png"); 
        ladronizquierda.scale( ladronizquierda.getWidth()/2,ladronizquierda.getHeight()/2); 
        
        ladronizquierda1=new GreenfootImage("ladronizq1.png"); 
        ladronizquierda1.scale( ladronizquierda1.getWidth()/2,ladronizquierda1.getHeight()/2); 
         
        ladronizquierda2=new GreenfootImage("ladronizq2.png"); 
        ladronizquierda2.scale( ladronizquierda2.getWidth()/2,ladronizquierda2.getHeight()/2); 
        
        ladronizquierda3=new GreenfootImage("ladronizq3.png"); 
        ladronizquierda3.scale( ladronizquierda3.getWidth()/2,ladronizquierda3.getHeight()/2); 
        
        ladronderecha=new GreenfootImage("ladronder.png"); 
        ladronderecha.scale( ladronderecha.getWidth()/2,ladronderecha.getHeight()/2); 
        
        ladronderecha1=new GreenfootImage("ladronder1.png"); 
        ladronderecha1.scale( ladronderecha1.getWidth()/2,ladronderecha1.getHeight()/2); 
        
        ladronderecha2=new GreenfootImage("ladronder2.png"); 
        ladronderecha2.scale( ladronderecha2.getWidth()/2,ladronderecha2.getHeight()/2);
        
        ladronderecha3=new GreenfootImage("ladronder3.png"); 
        ladronderecha3.scale( ladronderecha3.getWidth()/2,ladronderecha3.getHeight()/2); 
        
        setImage(ladron);
        puntos=0;
        vidas=3;
        avanza=0;
        direccion=IZQUIERDA;
        parado=true;
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
        caminar();
        
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
     * Éste método contiene el movimiento del personaje (arriba,abajo,izquierda,derecha) y se cambia la
     * dirección según la tecla que se presione.
     */
    public void move()
    {
      if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("left")){
        parado=false;
          if(Greenfoot.isKeyDown("up")) {
          this.direccion=ARRIBA;
          setLocation(getX(),getY()+ARRIBA);
        }
          
        if(Greenfoot.isKeyDown("down")){
         this.direccion=ABAJO;
         setLocation(getX(),getY()+ABAJO);
        }
         
        if(Greenfoot.isKeyDown("right")){
          this.direccion=DERECHA;
          setLocation(getX()+DERECHA,getY());
        }
          
        if(Greenfoot.isKeyDown("left")){
          this.direccion=IZQUIERDA;
          setLocation(getX()+IZQUIERDA,getY());
        }
     }
     else{
         parado=true;
        }
    }
    
    /**
     * Contiene los pasos que dará el ladrón, cada vez que de tres pasos se reinicia la variable. Se manda
     * llamar al método avanzaLadron() para que cambie la imagen segun los pasos que camine.
     */
    public void caminar()
    {
        avanza++;
        if(avanza>=3){
            avanza=0;
        }
        avanzaLadron();
    }
    
    /**
     * Éste método verifica si el ladron esta parado o caminando con la variable booleana parado. Se verifica su
     * dirección y movimiento y se cambia por la imagen que le corresponda para cuando se presione
     * una tecla se vea que el personaje camina
     */
    public void avanzaLadron()
    {
        if(parado==true){
            if(this.direccion==IZQUIERDA){
                ladron=ladronizquierda;
            }
            else{
                ladron=ladronderecha;
            }
        }
        
        if(parado==false){
         switch(avanza){
            case 0: if(direccion==IZQUIERDA){
                    ladron=ladronizquierda1;
                    }
                    else{
                        if(direccion==DERECHA){
                         ladron=ladronderecha1;
                        }
                    }
            break;
            
            case 1: if(direccion==IZQUIERDA){
                    ladron=ladronizquierda2;
                    }
                    else{
                        if(direccion==DERECHA){
                          ladron=ladronderecha2;
                        }
                    }
            break;
            
            case 2: if(direccion==IZQUIERDA){
                    ladron=ladronizquierda3;
                    }
                    else{
                        if(direccion==DERECHA){
                        ladron=ladronderecha3;
                       }  
                    }
            break;
            
         }
        }
        setImage(ladron);
      
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
          setLocation(getX(),getY()+ABAJO);
        }
          
        if(Greenfoot.isKeyDown("down")){
         setLocation(getX(),getY()+ARRIBA);
        }
         
        if(Greenfoot.isKeyDown("right")){
          setLocation(getX()+DERECHA,getY());
        }
          
        if(Greenfoot.isKeyDown("left")){
          setLocation(getX()+IZQUIERDA,getY());
        }
        }
        
        if(getX()-miImagen.getWidth()/2<=0){
              this.setLocation(getX()+DERECHA,getY());
            }
              
        if(getY()+miImagen.getHeight()/2>=getWorld().getHeight()){
              this.setLocation(getX(),getY()+ARRIBA);
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
