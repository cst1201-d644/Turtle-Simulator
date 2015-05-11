package cst1201;

/**
 * A class representing a Bowtie drawn by a Turtle object.
 *
 * @author (Razia Laboni)
 */
public class Bowtie {

    /**
     * (Fill in a brief description of what method does)
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
  // This method will make tedious tasks like drawing a bowtie faster.

}
