import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Play dibuja un botón que se dirigira al juego.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.24)
 */
public class Play extends Actor
{
  private GreenfootImage botonPlay;
  
  /**
   * constructor de la clase Play, que dibuja un imagen de GreenfootImage un botón con la cadena "jugar"
   */
  public Play()
  {
      botonPlay=new GreenfootImage("botonVerde.png");
      botonPlay.scale(botonPlay.getWidth()/2, botonPlay.getHeight()/2);
      
      setImage(botonPlay);
    }
}
