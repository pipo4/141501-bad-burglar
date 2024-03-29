import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.UserInfo; 

/**
 * La clase Records va a guardar la puntuación del juegador y mostrará los récords del menú las
 * puntuaciones más altas.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.26)
 */
public class Records
{
    private UserInfo jugador;
    
    public Records() 
    { 
        if ((UserInfo.isStorageAvailable()) && (UserInfo.getMyInfo() != null)) {
          this.jugador = UserInfo.getMyInfo();
        }
    }
    
    public void guardaRecords(int puntos)
    {
         if((UserInfo.isStorageAvailable()) && (this.jugador != null) && ((puntos > this.jugador.getScore())) || (this.jugador.getInt(0))==0){ 
            this.jugador.setScore(puntos);
            this.jugador.setInt(0,1); 
            this.jugador.store();
        }
        
        if((UserInfo.isStorageAvailable()) && (this.jugador != null) && (puntos > this.jugador.getScore())){
            this.jugador.setScore(puntos);
            this.jugador.setInt(0,1); 
            this.jugador.store();
        }
    }
     
}
