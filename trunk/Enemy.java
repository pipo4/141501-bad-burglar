import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Enemy contiene a los enemigos del ladron, que le quitaran puntos o vidas.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.19)
 */
public class Enemy extends Actor
{
    /**
     * variable booleana que con un false indica que un eemigo no ha tocado al ladron
     */
    private boolean intersecta=false;
    
    /**
     * Método que quita una vida al jugador en caso de que el enemigo llegue a tocarlo, se hacen las validaciones
     * con la variable intersecta, si el enemigo toco al ladron , esta variable pasa a ser true, de lo contario es false
     */
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
     * haciendo validaciones con la variable intersecta, si el enemigo toco al ladron , esta variable pasa a ser true, de lo contario es false
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
        
        if(((BurglarWorld)(getWorld())).getBurglar().getNivel()==1 || ((BurglarWorld)(getWorld())).getBurglar().getNivel()==2 || ((BurglarWorld)(getWorld())).getBurglar().getNivel()==0){
            intersecta=false;
            if(isTouching(Burglar.class)&&intersecta==false){
                intersecta=true;
            }
        }
    }
    
    
}
