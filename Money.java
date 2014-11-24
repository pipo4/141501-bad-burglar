import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Money permite crear los billetes de diferentes valores para que despues el ladron acumule puntos al recogerlos.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.7)
 */
public class Money extends Actor
{
    
    /**
     * Este metodo recibe como parametro un entero que va a ir incrementando a los puntos del ladron
     * @param unValor el valor que tenga un billete
     */
    public void acumulaPuntos(int unValor) 
    {
       
        ((BurglarWorld)(getWorld())).getBurglar().setPuntos(unValor);
        
    }    
    
    
} 
