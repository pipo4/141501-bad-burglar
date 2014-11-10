import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Enemy contiene a los enemigos del ladron, que le quitaran puntos o vidas.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.7)
 */
public class Enemy extends Actor
{
    
    public void act() 
    {
        // Add your action code here.
         
    }  
    /**
     * Con este método se le quitan puntos al ladrón cuando lo atrapa un policia
     * @param unValor un entero para poder  disminuirle puntos al ladron
     */
    public void quitaPuntos(int unValor) 
    {
        
        ((BurglarWorld)(getWorld())).getBurglar().setPuntos(unValor);
        
    } 
   
}
