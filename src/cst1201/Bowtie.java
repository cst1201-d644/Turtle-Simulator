package cst1201;

/**
 * A class representing a bowtie drawn by a Turtle object.
 *
 * @author Winnie Wu & Kenny Tsang
 */
public class Bowtie {

    /**
     * This method will draw a bowtie.
     */
    public void draw() {
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
