
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square grass;
    private Square sky;
    private Square wall;
    private Square window;
    private Square door;
    
    private Triangle roof;
    private Triangle walkway;
    
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        grass = new Square();
        grass.moveHorizontal(-60);
        grass.moveVertical(110);
        grass.changeSize(300);
        grass.changeColor("green");
        grass.makeVisible();
        
        sky = new Square();
        sky.moveHorizontal(-60);
        sky.moveVertical(-190);
        sky.changeSize(300);
        sky.changeColor("blue");
        sky.makeVisible();
        
        walkway = new Triangle();
        walkway.moveHorizontal(100);
        walkway.moveVertical(140);
        walkway.changeSize(200, 80);
        walkway.changeColor("yellow");
        walkway.makeVisible();
        
        wall = new Square();
        wall.moveHorizontal(40);
        wall.moveVertical(60);
        wall.changeSize(100);
        wall.changeColor("black");
        wall.makeVisible();
        
        door = new Square();
        door.moveHorizontal(75);
        door.moveVertical(130);
        door.changeSize(30);
        door.changeColor("red");
        door.makeVisible();
        
        window = new Square();
        window.changeSize(20);
        window.changeColor("blue");
        window.moveHorizontal(50);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 120);
        roof.changeColor("red");
        roof.moveHorizontal(100);
        roof.moveVertical(50);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
