package cst1201;

/**
 * A class representing a Bowtie drawn by a Turtle object.
 *
 * @author (Razia Laboni and jean)
 */
public class Bowtie {

    /**
     * (This method draws a bow tie following these particular directions.)
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
