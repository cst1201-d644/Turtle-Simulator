package cst1201;

/**
 *
 * @author Goutam & Francisco
 */
public class HouseDrawing {

    public void draw() {

        Turtle myTurtle = new Turtle();
        myTurtle.setPenColor("blue");
        myTurtle.forward(250);
        myTurtle.left(90);
        myTurtle.forward(200);
        myTurtle.left(90);
        myTurtle.forward(250);
        myTurtle.left(90);
        myTurtle.forward(200);
        myTurtle.left(180);
        myTurtle.penUp();
        myTurtle.forward(200);
        myTurtle.penDown();
        myTurtle.setPenColor("orange");
        myTurtle.right(45);
        myTurtle.forward(Math.sqrt(31250));
        myTurtle.right(90);
        myTurtle.forward(Math.sqrt(31250));

    }
}
