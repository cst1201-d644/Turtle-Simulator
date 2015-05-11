package cst1201;

/**
 * A class representing a Bowtie drawn by a Turtle object.
 *
 * @author (Niaz Morshed and Devaya Gurung)
 */
public class Bowtie {
    
   // The draw method draw a bowtie
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
