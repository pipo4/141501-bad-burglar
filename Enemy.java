import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Enemy contiene a los enemigos del ladron, que le quitaran puntos o vidas.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.19)
 */
public class Enemy extends Actor
{
    private boolean intersecta=false;
    
    
    public void quitaVida()
    {
        if(isTouching(Burglar.class) && intersecta==false &&((BurglarWorld)(getWorld())).getMensajeVidas().getValue()>0){
           ((BurglarWorld)(getWorld())).getMensajeVidas().add(-1);
           intersecta=true;
        }
        
        if(((BurglarWorld)(getWorld())).getBurglar().getNivel()==1 || ((BurglarWorld)(getWorld())).getBurglar().getNivel()==2){
            intersecta=false;
            if(isTouching(Burglar.class)&&intersecta==false){
                intersecta=true;
            }
        }
    }
    
     /**
     * El método quitaPuntos() verifica si un objeto de la clase Policeman toca al ladron, se tendrá que quitar puntos
     */
     public void quitaPuntos()
    {
        //if(isTouching(Burglar.class)&&intersecta==false){
           if( intersects(((BurglarWorld)(getWorld())).getBurglar())&&intersecta==false){ 
               int puntos=((BurglarWorld)(getWorld())).getBurglar().getPuntos();
            if(((BurglarWorld)(getWorld())).getMensajePuntos().getValue()>0) { 
                puntos=puntos-20;
                ((BurglarWorld)(getWorld())).getBurglar().setPuntos(puntos);
            }
            intersecta=true;
            
        }
        
        if(((BurglarWorld)(getWorld())).getBurglar().getNivel()==1 || ((BurglarWorld)(getWorld())).getBurglar().getNivel()==2){
            intersecta=false;
            if(isTouching(Burglar.class)&&intersecta==false){
                intersecta=true;
            }
        }
    }
    
    
}
