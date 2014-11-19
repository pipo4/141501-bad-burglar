import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Enemy contiene a los enemigos del ladron, que le quitaran puntos o vidas.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.7)
 */
public class Enemy extends Actor
{
    private boolean intersecta=false;
    
    
    public void quitaVida()
    {
        if(isTouching(Burglar.class) && intersecta==false){
           ((BurglarWorld)(getWorld())).getMensajeVidas().add(-1);
           intersecta=true;
        }
       
    }
    
     /**
     * El método quitaPuntos() verifica si un objeto de la clase Policeman toca al ladron, se tendrá que quitar puntos
     */
     public void quitaPuntos()
    {
        if(isTouching(Burglar.class)&&intersecta==false){
          // if( intersects(((BurglarWorld)(getWorld())).getBurglar())){ 
               int puntos=((BurglarWorld)(getWorld())).getBurglar().getPuntos();
            if(((BurglarWorld)(getWorld())).getMensajePuntos().getValue()>0) { 
               // if(((BurglarWorld)(getWorld())).getBurglar().getPuntos()>49){
                //puntos=puntos-1;
                puntos=puntos-20;
                ((BurglarWorld)(getWorld())).getBurglar().setPuntos(puntos);
            }
            intersecta=true;
        }
    }
}
