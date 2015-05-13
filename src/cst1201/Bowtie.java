package cst1201;

/**
 * A class representing a Bowtie drawn by a Turtle object.
 *
 * @author Aleksandra M. and Rehab E.
 */
public class Bowtie {

    public void draw() {
        Turtle myturtle = new Turtle();
        myturtle.setPenColor("blue");
        myturtle.left(90);
        myturtle.forward(300);
        myturtle.right(135);
        myturtle.forward(425);
        myturtle.left(135);
        myturtle.forward(300);
        myturtle.left(135);
        myturtle.forward(425);
    }
}
