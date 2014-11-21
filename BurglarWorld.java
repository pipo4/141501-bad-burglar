import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase BurglarWorld va a contener el escenario del juego y también donde se controlarán los niveles.
 * Esto incluye creación de personajes u objetos y su movimiento(si es que lo tiene).
 * También incluye los métodos de acceso para algunos actores
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.19)
 */
public class BurglarWorld extends World
{
    private Burglar burglar;
    private Counter mensajeVidas, mensajePuntos;
    private SimpleTimer reloj;
    private Policeman police;
    private Patrol patrulla;
    private Handcuffs esposas;
    private PepperGas gas;
    private Bomb bomba;
    private Alarm alarma;
    private Cincuenta cincuenta;
    private Doscientos doscientos;
    private Quinientos quinientos;
    private Cien cien;
    private Veinte veinte;
    /** Constante para girar 0 grados el bloque de la clase Lines y ponerlo en el escenario para el laberinto*/
    private static final int GIRA_0=0;
    /** Constante para girar 90 grados el bloque de la clase Lines y ponerlo en el escenario para el laberinto*/
    private static final int GIRA_90=90;
    /**Constante entera que contiene el color para dibujar el escenario en el nivel 1*/
    private static final int AZUL=0;
   
    private GreenfootSound mision;
    private GreenfootSound alarmSystem;
    /**
     * Constructor de la clase BurglarWorld. Se crea el escenario y los actores del primer nivel
     * Se crean los mensajes de puntos y vidas. También se crean los sonidos del juego.
     * 
     */
    public BurglarWorld()
    {    
        super(1000, 600, 1); 
        reloj=new SimpleTimer();
        reloj.mark();
        this.setPaintOrder(Burglar.class,Policeman.class,Patrol.class);
        prepare();
        mensajeVidas=new Counter("Vidas: "); 
        mensajeVidas.setValue(3);
        addObject(mensajeVidas,52,20);
        mensajePuntos=new Counter("Dinero: ");
        mensajePuntos.setValue(0);
        addObject(mensajePuntos,58,55);
        mision=new GreenfootSound("mision imposible.mp3");
        
        alarmSystem=new GreenfootSound("Alarma Efecto de Sonido.mp3");
    }

    /**
     * El método prepare dibuja el escenario, crea los personajes del primer nivel y los agrega al mundo BurglarWorld
     */
    private void prepare()
    {
        dibujaEscenario();//dibuja las lineas del escenario 

        burglar = new Burglar();//agrega al ladron
        addObject(burglar, 954, 172);

        police = new Policeman();
        addObject(police,655,160);

        cincuenta=new Cincuenta(); 
        addObject(cincuenta,500,280); 
        
        veinte= new Veinte();
        addObject(veinte,800,200);
       
        doscientos=new Doscientos();
        addObject(doscientos,300,50);
       
        patrulla=new Patrol();
        addObject(patrulla,560,400);

        quinientos = new Quinientos();
        addObject(quinientos, 100, 450);
         
        
    }
    
    /**
     *  Asinga los puntos que tenga el ladron para que puedan ser mostrados en el mensaje de puntos y se 
     *  checa si las vidas se agotaron, en este caso , el juego  termina. 
     *  Cuando se activa la alarma del ultimo nivel, el sonido de fondo del juego baja de volumen y una alarma
     *  empieza a sonar
     */
    public void act()
    {
       mision.playLoop();
       
       mensajePuntos.setValue(burglar.getPuntos());
       gameOver();
       //ganaste(); 
       if(burglar.getNivel()==3){
          
           alarmSystem.playLoop();
           mision.setVolume(30);
           alarmSystem.setVolume(70);
          
           
        }
    }
    
    /**
     * Dibuja el escenario con ayuda de la clase Lines, que permite dibujar 
     * una barra de color azul(para el primer nivel) con una dirección, y los agrega 
     * al mundo
     */
     
     public void dibujaEscenario()
    {  
        addObject(new Lines(GIRA_0), 945, 102);  
        
        addObject(new Lines(GIRA_90), 877, 50);
        
        addObject(new Lines(GIRA_0), 940, 229);  
        
        addObject(new Lines(GIRA_90), 872, 282);
        addObject(new Lines(GIRA_90), 872, 400);
        addObject(new Lines(GIRA_90), 872, 520);
        addObject(new Lines(GIRA_90), 872, 550);
        
        addObject(new Lines(GIRA_90), 745, 59);
        
        addObject(new Lines(GIRA_0), 688, 111);  
        addObject(new Lines(GIRA_0), 575, 111);  
        addObject(new Lines(GIRA_0), 457, 111);
       
        addObject(new Lines(GIRA_90), 745, 392);
        addObject(new Lines(GIRA_90), 745, 480);
        addObject(new Lines(GIRA_90), 745, 600);
         
        addObject(new Lines(GIRA_0), 693, 335);
       
        addObject(new Lines(GIRA_90), 640, 393);
       
        addObject(new Lines(GIRA_0), 588, 455);
        addObject(new Lines(GIRA_0), 468, 455);
        addObject(new Lines(GIRA_0), 376, 455);
  
        addObject(new Lines(GIRA_90), 320, 508);
        addObject(new Lines(GIRA_90), 320, 540);
        
        addObject(new Lines(GIRA_0), 55, 190);//
       
        addObject(new Lines(GIRA_90), 120, 243);
        addObject(new Lines(GIRA_90), 120, 350);
        
        addObject(new Lines(GIRA_0), 55, 402);
        
        addObject(new Lines(GIRA_90), 390, 59);  
      
        addObject(new Lines(GIRA_90), 245, 43);
        
        addObject(new Lines(GIRA_0), 180, 95);
        addObject(new Lines(GIRA_0), 60, 95);
    }
    
    /**
     * Método que cambia al segundo nivel , se cambia el fondo y el color del laberinto. Se eliminan los actores
     * del nivel anterior y se agregan los nuevos enemigos de este nivel
     */
    public void cambiaNivel1()
    {
        
           GreenfootImage fondoNivel2=new GreenfootImage("images (6).jpg");
           
           setBackground(fondoNivel2); 
           
           burglar.setLocation(954, 172);
           police.setLocation(300,400);
           removeObject(patrulla);
           
           addObject(cincuenta,500,370);//450,300
           addObject(veinte,680,200);
           addObject(doscientos,230,550);//230,550
           addObject(quinientos,160,130);//160,130
           
           cien=new Cien();
           addObject(cien,780,450);//780,350
           
           esposas= new Handcuffs();
           addObject(esposas,736,120);
           Handcuffs esposas2=new Handcuffs();
           addObject(esposas2,630,305);
           
           gas=new PepperGas();
           addObject(gas,350,170);
           
           
    }
    
     /**
     * Método que cambia al tercer nivel, cambiando el fondo y el color del laberinto y agregando
     * los enemigos de este nivel
     */
    public void cambiaNivel2()
    {
           reloj.mark();
           GreenfootImage fondoNivel2=new GreenfootImage("images (15).jpg");
           fondoNivel2.scale(fondoNivel2.getWidth(), fondoNivel2.getHeight()); 
           fondoNivel2.setTransparency(190);
           setBackground(fondoNivel2); 
           removeObject(police);
           removeObject(gas);
           
           burglar.setLocation(954, 172);
           
           bomba=new Bomb();
           addObject(bomba,180,150);
           addObject(new Bomb(),320,300);
           
           alarma= new Alarm(); 
           addObject(alarma,80,550);
           
           
           addObject(doscientos,580,420);
           addObject(cincuenta,90,140);
           addObject(quinientos,300,330);
           addObject(cien,830,50);
           addObject(veinte,790,460);
           
           Ground ground=new Ground();
           addObject(ground,220,560);
    }
   
    /**
     * Regresa al objeto de la clase Burglar para poder acceder a sus métodos
     * @return burglar  Al ladron (un objeto de la clase Burglar)
     */
    public Burglar getBurglar()
    {
        return burglar;
    }
    
    /**
     * Regresa un objeto de la clase Cincuenta para acceder a sus métodos
     * @return cincuenta Un objeto de la clase Cincuenta
     */
    public Cincuenta getCincuenta()
    {
        return cincuenta;
    }
    
    /**
     * Regresa un objeto de la clase Doscientos para acceder a sus métodos
     * @return doscientos Un objeto de la clase Doscientos
     */
    public Doscientos getDoscientos()
    {
        return doscientos; 
    }
    
    /**
     * Regresa un objeto de la clase Quinientos para acceder a sus métodos
     * @return quinientos Un objeto de la clase Quinientos
     */
    public Quinientos getQuinientos()
    {
        return quinientos;
    }
    /**
     * Regresa al billete de veinte que se creo
     * @return veinte Un objeto de la clase Veinte
     */
     public Veinte getVeinte()
    {
        return veinte;
    }
    /**
     * Regresa al objeto cien de la clase Cien
     * @return cien un objeto de la clase cien
     */
    public Cien getCien()
    {
        return cien;
    }
    
    /**
     * Método que regresa un objeto de la clase Counter para poder ir acumulando los puntos
     * que lleve el ladron 
     * @return mensajePuntos Objeto de la clase Counter 
     */
    public Counter getMensajePuntos()
    {
        return mensajePuntos;
    }
    
    /**
     * Método de acceso que regresa el mensaje de las vidas que tiene el jugador
     * @return mensajeVidas Objeto de la clase Counter
     */
    public Counter getMensajeVidas()
    {
        return mensajeVidas;
    }
    
    /**
     * Método que regresa a un enemigo del juego, en este caso un policia
     * @return police enemigo de la subclase Policeman
     */
    public Policeman getPolice()
    {
        return police;
    }
    
    /**
     * Método que regresa el reloj del juego
     * @return reloj objeto de la clase SimpleTimer
     */
    public SimpleTimer getReloj()
    {
        return reloj;
    }
    
   
    /**
     * Método que es llamado por el sistema de Greenfoot cuando se ha iniciado la simulación, y
     * empieza iniciando el sonido del juego
     */
    public void started()
    {
        super.started();
        mision.play();
        
    }
    
    /**
     * Método que es llamado por el sistema de Greenfoot cuando se pone en pausa el proyecto, cuando sucede esto 
     * tambien se pause la canción
     */
    public void stopped()
    {
        super.stopped();
        mision.pause();
        alarmSystem.pause();
    }
    
    /**
     * Método que checa la vidas del jugador, y si estas son igual a cero cambia el fondo, elimina 
     * todos los objetos de Burglar World y aparece un mensaje indicando que el juego termino
     */
    public void gameOver()
    {
         if(mensajeVidas.getValue()==0){
           removeObjects(getObjects(Actor.class));
           GreenfootImage fondofinal = new GreenfootImage("images (17).jpg");
           fondofinal.setTransparency(220);
           setBackground(fondofinal);
           Letrero perdiste=new Letrero(" GAME OVER ");
           addObject(perdiste,this.getWidth()/2,this.getHeight()/2);
           
           //addObject(new ScoreBoard(600, 400), getWidth() / 2, getHeight() / 2); 
             
           Greenfoot.stop();
        }
    }
    
    /**
     * Método que nos muestra un mensaje indicando que se ha ganado el juego
     */
    public void ganaste()
    {
         if(burglar.getPuntos()>2300){
           removeObjects(getObjects(Actor.class));
           GreenfootImage fondofinal = new GreenfootImage("images (17).jpg");
           fondofinal.setTransparency(220);
           setBackground(fondofinal);
           Letrero perdiste=new Letrero(" GANASTE ");
           addObject(perdiste,this.getWidth()/2,this.getHeight()/2);
           
           Greenfoot.stop();
        }
    }
   
}
