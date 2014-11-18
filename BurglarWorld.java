import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase BurglarWorld va a contener el escenario del juego y también donde se controlarán los niveles del 
 * juego. Esto incluye creación de personajes u objetos y su movimiento(si es que lo tiene)
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.16)
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
    /** Constante para girar 0 grados el bloque de la clase Lines y ponerlo en el escenario para el laberinto*/
    private static final int GIRA_0=0;
    /** Constante para girar 90 grados el bloque de la clase Lines y ponerlo en el escenario para el laberinto*/
    private static final int GIRA_90=90;
    /**Constante entera que contiene el color para dibujar el escenario*/
    private static final int AZUL=0;
   
    private GreenfootSound mision;
   
    /**
     * Constructor de la clase BurglarWorld.
     * Se crean los mensajes de puntos y vidas
     * 
     */
    public BurglarWorld()
    {    
        super(1000, 600, 1); 
        reloj=new SimpleTimer();
        this.setPaintOrder(Burglar.class,Policeman.class,Patrol.class);
        prepare();
        mensajeVidas=new Counter("Vidas: "); 
        mensajeVidas.setValue(3);
        addObject(mensajeVidas,52,20);
        mensajePuntos=new Counter("Dinero: ");
        mensajePuntos.setValue(0);
        addObject(mensajePuntos,58,55);
        mision=new GreenfootSound("mision imposible.mp3");
    }

    /**
     * El método prepare dibuja el escenario, crea los personajes y los agrega al mundo BurglarWorld
     */
    private void prepare()
    {
        dibujaEscenario();//dibuja las lineas del escenario 

        burglar = new Burglar();//agrega al ladron
        addObject(burglar, 954, 172);

        police = new Policeman();
        addObject(police,655,160);

        cincuenta=new Cincuenta(); 
        addObject(cincuenta,800,200); 
       
        doscientos=new Doscientos();
        addObject(doscientos,300,50);
       
        patrulla=new Patrol();
        addObject(patrulla,560,400);

        quinientos = new Quinientos();
        addObject(quinientos, 100, 450);
         
        
    }
    
    /**
     *  Asinga los puntos que tenga el ladron para que puedan ser mostrados en el mensaje de puntos.
     */
    public void act()
    {
       
       mensajePuntos.setValue(burglar.getPuntos());
      
       //mision.play();
       
       //mision.stop();
       
       
    }
    
    /**
     * Dibuja el escenario con ayuda de la clase Lines, que dibuja 
     * una barra de color azul con una dirección, y los agrega 
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
     * Método que verifica el número de objetos en BurglarWorld para cambiar de nivel, agregando
     * como enemigos a unas esposas y un gas pimineta
     */
    public void cambiaNivel1()
    {
        
           GreenfootImage fondoNivel2=new GreenfootImage("images (6).jpg");
           
           setBackground(fondoNivel2); 
           
           burglar.setLocation(954, 172);
           police.setLocation(300,400);
           removeObject(patrulla);
           
           addObject(cincuenta,450,300);//450,300
           
           addObject(doscientos,230,550);//230,550
           addObject(quinientos,160,130);//160,130
           
           addObject(new Doscientos(),780,350);//780,350
           
           esposas= new Handcuffs();
           addObject(esposas,736,120);
           Handcuffs esposas2=new Handcuffs();
           addObject(esposas2,630,305);
           
           gas=new PepperGas();
           addObject(gas,350,170);
    }
    
     /**
     * método que verifica el número de objetos en BurglarWorld para cambiar de nivel
     */
    public void cambiaNivel2()
    {
        
           GreenfootImage fondoNivel2=new GreenfootImage("images (15).jpg");
           fondoNivel2.scale(fondoNivel2.getWidth(), fondoNivel2.getHeight()); 
           fondoNivel2.setTransparency(190);
           setBackground(fondoNivel2); 
           removeObject(police);
           removeObject(gas);
           
           burglar.setLocation(954, 172);
           
           bomba=new Bomb();
           addObject(bomba,200,135);
           addObject(new Bomb(),300,300);
           
           alarma= new Alarm(); 
           addObject(alarma,100,550);
           
           
           addObject(doscientos,580,420);
           addObject(cincuenta,150,140);
           addObject(quinientos,280,330);
           addObject(new Cincuenta(),820,50);
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
     * @return quinientos Un objeto de la claseQuinientos
     */
    public Quinientos getQuinientos()
    {
        return quinientos;
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
     * Método que regresa a un enemigo del juegp, en este caso un policia
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
    
    public void restaVidas()
    {
        mensajeVidas.add(-1);
    }
   
}
