import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BurglarWorld here.
 * 
 * @author (Cerda Varela Ignacio) 
 * @version (a version number or a date)
 */
public class BurglarWorld extends World
{
    private Burglar burglar;
   
    /**
     * Constructor for objects of class BurglarWorld.
     * 
     */
    public BurglarWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        dibujaEscenario();//dibuja las lineas del escenario

        burglar = new Burglar();//agrega al ladron
        addObject(burglar, 954, 172);
    }
    
     public void dibujaEscenario()
    {  
        addObject(new Lines(0), 985, 95);  
        addObject(new Lines(0), 960, 95);  
        addObject(new Lines(0), 935, 95); 
        addObject(new Lines(0), 910, 95);
        addObject(new Lines(0), 885, 95);
      
        addObject(new Lines(90), 877, 72);
        addObject(new Lines(90), 877, 42);
        addObject(new Lines(90), 877, 11);
        
        addObject(new Lines(0), 985, 230);  
        addObject(new Lines(0), 955, 230);  
        addObject(new Lines(0), 925, 230);
        addObject(new Lines(0), 895, 230);
        
        addObject(new Lines(90), 872, 238);
        addObject(new Lines(90), 872, 265);
        addObject(new Lines(90), 872, 292);
        addObject(new Lines(90), 872, 319);
        addObject(new Lines(90), 872, 346);
        addObject(new Lines(90), 872, 373);
        addObject(new Lines(90), 872, 400);
        addObject(new Lines(90), 872, 427);
        addObject(new Lines(90), 872, 454);
        addObject(new Lines(90), 872, 481);
        addObject(new Lines(90), 872, 508);
        addObject(new Lines(90), 872, 535);
        addObject(new Lines(90), 872, 562);
        addObject(new Lines(90), 872, 589);
        addObject(new Lines(90), 872, 616);
        
        addObject(new Lines(90), 745, 89);
        addObject(new Lines(90), 745, 58);
        addObject(new Lines(90), 745, 28);
        addObject(new Lines(90), 745, 10);
        
        addObject(new Lines(0), 738, 95);  
        addObject(new Lines(0), 708, 95);  
        addObject(new Lines(0), 678, 95);
        addObject(new Lines(0), 648, 95);
        addObject(new Lines(0), 618, 95);  
        addObject(new Lines(0), 588, 95);  
        addObject(new Lines(0), 558, 95);
        addObject(new Lines(0), 528, 95);
        addObject(new Lines(0), 498, 95);  
        addObject(new Lines(0), 468, 95);  
        addObject(new Lines(0), 438, 95);
        addObject(new Lines(0), 408, 95);
        addObject(new Lines(90), 745, 390);
        addObject(new Lines(90), 745, 420);
        addObject(new Lines(90), 745, 450);
        addObject(new Lines(90), 745, 480);
        addObject(new Lines(90), 745, 510);
        addObject(new Lines(90), 745, 540);
        addObject(new Lines(90), 745, 570);
        addObject(new Lines(90), 745, 600);//
        addObject(new Lines(90), 400, 102);
        addObject(new Lines(90), 400, 132);
        addObject(new Lines(0), 385, 140);  
        addObject(new Lines(0), 355, 140);  
        addObject(new Lines(0), 325, 140);
        addObject(new Lines(0), 295, 140);
        addObject(new Lines(0), 265, 140);  
        addObject(new Lines(0), 235, 140);  
        addObject(new Lines(90), 220, 102);
        addObject(new Lines(90), 220, 132);
        addObject(new Lines(0), 205, 95);
        addObject(new Lines(0), 175, 95);
        addObject(new Lines(0), 145, 95);
        addObject(new Lines(0), 115, 95);
        addObject(new Lines(0), 85, 95);
        addObject(new Lines(0), 55, 95);
        addObject(new Lines(0), 25, 95);
        addObject(new Lines(0), 5, 95);
        addObject(new Lines(0), 738, 370);
        addObject(new Lines(0), 708, 370);
        addObject(new Lines(0), 678, 370);
        addObject(new Lines(90), 670, 393);
        addObject(new Lines(90), 670, 423);
        addObject(new Lines(90), 670, 453);
        addObject(new Lines(90), 670, 483);
        addObject(new Lines(0), 660, 495);
        addObject(new Lines(0), 630, 495);
        addObject(new Lines(90), 610, 500);
        addObject(new Lines(90), 610, 530);
        addObject(new Lines(90), 610, 560);
        addObject(new Lines(90), 610, 590);
        addObject(new Lines(90), 500, 500);
        addObject(new Lines(90), 500, 530);
        addObject(new Lines(90), 500, 560);
        addObject(new Lines(90), 500, 590);
        addObject(new Lines(0), 490, 490);
        addObject(new Lines(0), 460, 490);
        addObject(new Lines(0), 430, 490);
        addObject(new Lines(0), 400, 490);
        addObject(new Lines(0), 370, 490);
        addObject(new Lines(0), 340, 490);
        addObject(new Lines(90), 320, 500);
        addObject(new Lines(90), 320, 530);
        addObject(new Lines(90), 320, 560);
        addObject(new Lines(90), 320, 590);
        
        addObject(new Lines(0), 115, 235);//
        addObject(new Lines(0), 85, 235);
        addObject(new Lines(0), 55, 235);
        addObject(new Lines(0), 25, 235);
        addObject(new Lines(0), 5, 235);
        
        addObject(new Lines(90), 135, 243);
        addObject(new Lines(90), 135, 273);
        addObject(new Lines(90), 135, 303);
        addObject(new Lines(90), 135, 333);
        addObject(new Lines(0), 115, 340);
        addObject(new Lines(0), 85, 340);
        addObject(new Lines(0), 55, 340);
        addObject(new Lines(0), 25, 340);
        addObject(new Lines(0), 5, 340);
    }
   
}
