package cst1201;

/**
 * A class representing a house with a roof sloped at 45 degrees
 * drawn by a turtle object.
 *
 * @author Winnie Wu & Kenny Tsang
 */
public class HouseDrawing {
    /**
     * This method will draw a house with a roof sloped at 45 degrees.
     */
    public void draw(){
        double roofDistance = Math.sqrt(20000.0);
        
        Turtle myTurtle = new Turtle();
        myTurtle.forward(200);
        myTurtle.left(90);
        myTurtle.forward(200);
        myTurtle.left(90);
        myTurtle.forward(200);
        myTurtle.left(90);
        myTurtle.forward(200);
        
        myTurtle.left(180);
        myTurtle.penUp();
        myTurtle.forward(200);
        myTurtle.right(45);
        myTurtle.penDown();
        myTurtle.forward(roofDistance);
        myTurtle.right(90);
        myTurtle.forward(roofDistance);
        
        
    }
    
}
