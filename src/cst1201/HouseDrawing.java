package cst1201;

/**
 *
 * @author class
 */
public class HouseDrawing {

    public void draw() {

        Turtle myTurtle = new Turtle();

        myTurtle.setPenColor("blue");

        myTurtle.forward(500);

        myTurtle.left(90);

        myTurtle.setPenColor("black");

        myTurtle.forward(400);

        myTurtle.left(90);

        myTurtle.forward(500);

        myTurtle.left(90);

        myTurtle.forward(400);

        myTurtle.setPenColor("orange");

        myTurtle.left(45);

        myTurtle.forward(Math.sqrt(125000));

        myTurtle.left(90);

        myTurtle.forward(Math.sqrt(125000));

    }

}

