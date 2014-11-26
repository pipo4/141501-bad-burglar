import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonRecords here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
