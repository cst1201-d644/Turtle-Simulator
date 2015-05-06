package cst1201;

/**
 * A class representing a Bowtie drawn by a Turtle object.
 *
 * @author Evan Chin
 */
public class Bowtie {

    /**
     * This method will guide the rest of the program to draw a bowtie.
     */
    public void draw() {
        //this is the *body* of the draw() method
        //implement the algorithm to draw a bowtie below
        Turtle myTurtle = new Turtle();

        myTurtle.setPenColor("blue");
        myTurtle.left(90);
        myTurtle.forward(300);
        myTurtle.right(135);
        myTurtle.forward(425);
        myTurtle.left(135);
        myTurtle.forward(300);
        myTurtle.left(135);
        myTurtle.forward(425);

    }
}
