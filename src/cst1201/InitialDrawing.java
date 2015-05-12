package cst1201;

/**
 *
 * @author Evan Chin
 */
public class InitialDrawing {
    /**
     * This will draw my first two initials E + C.
     */
    
    public void draw(){
        Turtle myTurtle = new Turtle();
        
        myTurtle.setPenColor("orange");
        
        myTurtle.left(90);
        myTurtle.forward(300);
        myTurtle.right(90);
        
        myTurtle.setPenColor("pink");
        myTurtle.forward(150);
        myTurtle.penUp();
        
        myTurtle.right(180);
        myTurtle.forward(150);
        myTurtle.left(90);
        myTurtle.forward(150);
        myTurtle.penDown();
        myTurtle.left(90);
        
        myTurtle.setPenColor("magenta");
        myTurtle.forward(75);
        myTurtle.penUp();
        myTurtle.right(180);
        myTurtle.forward(75);
        myTurtle.left(90);
        myTurtle.forward(150);
        myTurtle.left(90);
        
        myTurtle.setPenColor("blue");
        myTurtle.penDown();
        myTurtle.forward(150);
        
        myTurtle.penUp();
        myTurtle.forward(100);
        myTurtle.left(90);
        myTurtle.forward(150);
        myTurtle.right(90);
        myTurtle.penDown();
        
        myTurtle.setPenColor("black");
        myTurtle.forward(100);
        myTurtle.left(180);
        myTurtle.forward(50);
        myTurtle.right(90);
        myTurtle.forward(50);
        myTurtle.right(180);
        myTurtle.forward(100);
        myTurtle.penUp();
        
        myTurtle.forward(100);
        myTurtle.left(90);
        myTurtle.forward(300);
        
        myTurtle.penDown();
        myTurtle.setPenColor("cyan");
        myTurtle.left(180);
        myTurtle.forward(150);
        
        myTurtle.setPenColor("yellow");
        myTurtle.right(90);
        myTurtle.forward(300);
        myTurtle.right(90);
        
        myTurtle.setPenColor("green");
        myTurtle.forward(150);
        myTurtle.penUp();
        
                
               
        
        
        
    }
}
