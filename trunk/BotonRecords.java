import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase BotonRecords dibuja un botón, que al ser presionado mostrará los records de los jugadores.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.30)
 */
public class BotonRecords extends Actor
{
   private GreenfootImage botonRecord;
    /**
     * Constrcutor de BotonRecords, por medio de una GreenfootImage se creará un botón
     * para los records de los jugadores
     */
    public BotonRecords()
    {
      botonRecord=new GreenfootImage("botonRecords.png");
      botonRecord.scale(botonRecord.getWidth()/2, botonRecord.getHeight()/2);
      
      setImage(botonRecord);
    }   
}
