package cst1201;

/**
 * A class representing a Bowtie drawn by a Turtle object.
 *
 * @author Danish Khan and Dheyazen Alseelwe
 */
public class Bowtie {

    /**
     * (Fill in a brief description of what method does)
     */
    public void draw() {
        //this is the *body* of the draw() method
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
        //implement the algorithm to draw a bowtie below
    }

}
