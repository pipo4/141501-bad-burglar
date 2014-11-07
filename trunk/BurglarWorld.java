import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BurglarWorld here.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (a version number or a date)
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
    
    /**
     * Constructor for objects of class BurglarWorld.
     * 
     */
    public BurglarWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        reloj=new SimpleTimer();
        this.setPaintOrder(Burglar.class,Policeman.class);
        prepare();
        mensajeVidas=new Counter("Vidas: "); 
        mensajeVidas.setValue(3);
        addObject(mensajeVidas,52,20);
        mensajePuntos=new Counter("Dinero: ");
        mensajePuntos.setValue(0);
        addObject(mensajePuntos,58,55);
        
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        dibujaEscenario();//dibuja las lineas del escenario

        burglar = new Burglar();//agrega al ladron
        addObject(burglar, 954, 172);

        police = new Policeman();
        addObject(police,454,160);

        cincuenta=new Cincuenta();
        addObject(cincuenta,500,200);
        /*Cincuenta cincuenta2=new Cincuenta();
        addObject(cincuenta2,250,460);*/

        doscientos=new Doscientos();
        addObject(doscientos,300,50);
        Doscientos doscientos2=new Doscientos();
        addObject(doscientos2,830,500);

        patrulla=new Patrol();
        addObject(patrulla,560,400);

        quinientos = new Quinientos();
        addObject(quinientos, 836, 66);
    }
    
    public void act()
    {
       mensajePuntos.setValue(burglar.getPuntos());
    }
    
     public void dibujaEscenario()
    {  
        addObject(new Lines(0), 945, 102);  
        
        addObject(new Lines(90), 877, 50);
        
        addObject(new Lines(0), 940, 230);  
        
        addObject(new Lines(90), 872, 282);
        addObject(new Lines(90), 872, 400);
        addObject(new Lines(90), 872, 520);
        addObject(new Lines(90), 872, 550);
        
        addObject(new Lines(90), 745, 59);
        
        addObject(new Lines(0), 688, 111);  
        addObject(new Lines(0), 575, 111);  
        addObject(new Lines(0), 455, 111);
       
        addObject(new Lines(90), 745, 392);
        addObject(new Lines(90), 745, 480);
        addObject(new Lines(90), 745, 600);
         
        addObject(new Lines(0), 695, 339);
       
        addObject(new Lines(90), 640, 393);
       
        addObject(new Lines(0), 588, 455);
        addObject(new Lines(0), 468, 455);
        addObject(new Lines(0), 372, 455);
  
        addObject(new Lines(90), 320, 508);
        addObject(new Lines(90), 320, 540);
        
        addObject(new Lines(0), 55, 190);//
       
        addObject(new Lines(90), 120, 243);
        addObject(new Lines(90), 120, 350);
        
        addObject(new Lines(0), 55, 402);
        
        addObject(new Lines(90), 390, 60);  
      
        addObject(new Lines(90), 245, 43);
        
        addObject(new Lines(0), 180, 95);
        addObject(new Lines(0), 60, 95);
    }
   
    
    public SimpleTimer getReloj()
    {
        return reloj;
    }
    
    public Burglar getBurglar()
    {
        return burglar;
    }
    
    public Cincuenta getCincuenta()
    {
        return cincuenta;
    }
    
    public Doscientos getDoscientos()
    {
        return doscientos; 
    }
    
    public Quinientos getQuinientos()
    {
        return quinientos;
    }
    
    public Counter getMensajePuntos()
    {
        return mensajePuntos;
    }
}
