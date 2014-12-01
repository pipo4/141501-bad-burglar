import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * La clase Burglar contiene al personaje principal del juego, un ladrón. En esta clase se crea una
 * imagen del personaje que va a tener vidas y puntos , asi como movimiento del ladrón en el escenario, 
 * para esto es necesario declarar cuatro constantes que van a contener la direccion que lleva
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.19) 
 */
public class Burglar extends Actor
{
    /**Variables para crear las imagenes del ladron cuando camina*/
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
    /**Variable que permitirá avanzar al personaje, contiene los pasos que dara el ladron*/
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
    /**variable booleana que con un true indica que el personaje esta parado, con un false indica que el personaje esta en movimiento*/
    private boolean parado;
    /**contiene el nivel en el que se encuentra el jugador*/
    private int nivel;
   
    /**
     * Constructor de la clase Burglar.
     * Se crean las imagenes del ladron de todas las posiciones en las que puede estar.
     * Se inicializan los puntos en cero y las vidas en tres.
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
        nivel=0;
       
    }
    
    /**
     * En el método act() , se mandan llamar a los métodos que contiene el movimiento del ladron, 
     * validaciones para que no se salga del escenario y el acumulador de los puntos cuando 
     * el ladron toque algun billete
     */
    public void act() 
    {
        // Add your action code here.
        
        move();  
        caminar();
        validaciones();
       
        verificaDinero();
     
        cambiaDeNivel();
      
    }   
    
    /**
     * Éste método va checando si el jugador toco dinero, ya sea algun billete o una moneda,
     * para que acumule puntos y elimine el dinero del escenario
     */
    public void verificaDinero()
    {
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
        
         if(isTouching(Veinte.class)){
         ((BurglarWorld)(getWorld())).getVeinte().acumulaPuntos(); 
          removeTouching(Veinte.class);
          
        }
        
        if(isTouching(Cien.class)){
         ((BurglarWorld)(getWorld())).getCien().acumulaPuntos();
          removeTouching(Cien.class);
         
        }
        
        if(isTouching(Diez.class)){
            ((BurglarWorld)(getWorld())).getMoneda10().acumulaPuntos();
            removeTouching(Diez.class);
           
            }
            
        if(isTouching(Cinco.class)){
            ((BurglarWorld)(getWorld())).getMoneda5().acumulaPuntos();
            removeTouching(Cinco.class);
            }
            
        if(isTouching(Uno.class)){
            ((BurglarWorld)(getWorld())).getMoneda1().acumulaPuntos();
            removeTouching(Uno.class);
            }
            
        
    }
    
    /**
     * Este método verifica la cantidad de dinero que lleva el jugador para poder pasar de nivel
     */
    public void cambiaDeNivel()
    {
         if(puntos>=680 && getX()<=115 && getY()>=440 && nivel==0 && ((BurglarWorld)(getWorld())).numberOfObjects()==35){  
           nivel=1;
           ((BurglarWorld)(getWorld())).cambiaNivel1();
           
        }
        
       if(puntos>=1490 && getY()>=520 && getX()>=225 && nivel==1 && ((BurglarWorld)(getWorld())).numberOfObjects()>=33){
           nivel=2;
           ((BurglarWorld)(getWorld())).cambiaNivel2();
          
        }
        
       if(puntos>=1800){
           nivel=3;
           
        }
        
       if(this.isTouching(Ground.class) && getY()>=550){
           ((BurglarWorld)(getWorld())).ganaste();
           //((BurglarWorld)(getWorld())).detenerMusica();
        }
       else{
           if(this.isTouching(Ground.class) && getY()>=540 && puntos>2480){
           ((BurglarWorld)(getWorld())).ganaste();
            //((BurglarWorld)(getWorld())).detenerMusica();
        }
        }
    }
    
    
    /**
     * Éste método contiene el movimiento del personaje (arriba,abajo,izquierda,derecha) y se cambia la
     * dirección según la tecla que se presione.
     * Cuando se presiona una tecla la variable parado es false, de  lo contrario dicha variable 
     * sigue siendo true.
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
             case 0: if(this.direccion==IZQUIERDA){
                     ladron=ladronizquierda1;
                    }
                    else{
                        if(this.direccion==DERECHA){
                         ladron=ladronderecha1;
                        }
                        
                    }
                   
            break;  
            
            case 1: if(this.direccion==IZQUIERDA){
                     ladron=ladronizquierda2;
                    }
                    else{
                        if(this.direccion==DERECHA){
                          ladron=ladronderecha2;
                        }  
                         
                            
                        
                    }
                  
            break;
            
            case 2: if(this.direccion==IZQUIERDA){
                     ladron=ladronizquierda3;
                    }
                    else{
                        if(this.direccion==DERECHA){
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
          setLocation(getX()+IZQUIERDA,getY());
        }
          
        if(Greenfoot.isKeyDown("left")){
          setLocation(getX()+DERECHA,getY());
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
    
     /**
     * método que regresa el nivel en el que se encuentra el jugador
     * @return nivel número de nivel del juego
     */
    public int getNivel()
    {
        return nivel;
    }
    
    /**
     * Método de acceso que permite checar las vidas del jugador
     * @return vidas número de vidas que tiene el jugador
     */
    public int getVidas()
    {
        return vidas;
    }
    
   
}
