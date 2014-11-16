import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Lines permite dibujar el laberinto del juego con ayuda de una barra.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (2014.11.15)
 */
public class Lines extends Actor
{
    
    private GreenfootImage imagen;
    /**
     * Constructor de la clase Lines, recibe una direccion para girar la barra y colocarla
     * en el escenario
     * @param  dir direccion en la que se quiere colocar la barra para dibujar el laberinto
     *
     */
    public Lines(int dir)
    {
        this.turn(dir);
        imagen=new GreenfootImage("brick.png");
        imagen.scale(imagen.getWidth()*4,imagen.getHeight());
        
        imagen.setColor(java.awt.Color.blue);
       
        imagen.fill();
        setImage(imagen);
    } 
    
    /**
     * Éste método verifica las coordenadas del ladron para cambiar de color el escenario, 
     * lo que significa un cambio de nivel.
     */
    public void act()
    {
        if(((BurglarWorld)(getWorld())).getBurglar().getNivel()==1){
            imagen.setColor(java.awt.Color.yellow); 
            imagen.fill();
            setImage(imagen);
        }
    }
   
}
