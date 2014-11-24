import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Alarm aparece como enemigo en el tercer nivel y se activa cuando el ladron haya recogido
 * todo el dinero, y si no llega a la salida en un determinado tiempo perderá todo el dinero.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.16)
 */
public class Alarm extends Enemy
{
    private GreenfootImage alarma;
    
    /**
     * Constructor de la clase Alarm. Crea la imagen de una alarma por medio de 
     * GreenfootImage
     */
    public Alarm()
    {
        alarma=new GreenfootImage("alarma.png");
        alarma.scale(alarma.getWidth()/3, alarma.getHeight()/3);
        alarma.setTransparency(50);
        setImage(alarma);
        
    }
    
    /**
     * El método act verifica si el jugador ha llegado al último nivel para activar
     * la alarma de seguridad
     */
    public void act() 
    {
        if(((BurglarWorld)(getWorld())).getBurglar().getNivel() == 3){
          
            alarma.setTransparency(250);
            if(((BurglarWorld)(getWorld())).getContador().getValue()<=0){
                ((BurglarWorld)(getWorld())).getMensajePuntos().setValue(0);
                Greenfoot.delay(50);
                 Letrero perdiste=new Letrero(" GAME OVER "); 
                ((BurglarWorld)(getWorld())).addObject(perdiste,((BurglarWorld)(getWorld())).getWidth()/2,((BurglarWorld)(getWorld())).getHeight()/2);
     
                Greenfoot.stop();
            }
        }
        
    }    
   
}
