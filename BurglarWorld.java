import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * La clase BurglarWorld va a contener el escenario del juego y también donde se controlarán los niveles del 
 * juego. Esto incluye creación de personajes u objetos y su movimiento(si es que lo tiene)
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.11)
 */
public class BurglarWorld extends World
{
    private Burglar burglar;
    private Counter mensajeVidas, mensajePuntos;
    private SimpleTimer reloj;
    private Policeman police;
    private Patrol patrulla;
    private Cincuenta cincuenta;
    private Doscientos doscientos;
    private Quinientos quinientos;
    /** Constante para girar 0 grados el bloque de la clase Lines y ponerlo en el escenario para el laberinto*/
    private static final int GIRA_0=0;
    /** Constante para girar 90 grados el bloque de la clase Lines y ponerlo en el escenario para el laberinto*/
    private static final int GIRA_90=90;
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
        addObject(cincuenta,50,500);

        addObject(new Cincuenta(),500,200);

        doscientos=new Doscientos();
        addObject(doscientos,300,50);

        patrulla=new Patrol();
        addObject(patrulla,560,400);

        quinientos = new Quinientos();
        addObject(quinientos, 836, 66);
        
        
    }
    
    /**
     *  Asinga los puntos que tenga el ladron para que puedan ser mostrados en el mensaje de puntos.
     */
    public void act()
    {
       mensajePuntos.setValue(burglar.getPuntos());
       
       
       //mision.playLoop();
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
    
    
}
