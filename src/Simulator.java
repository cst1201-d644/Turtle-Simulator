import cst1201.Turtle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author general
 */
public class Simulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Turtle();

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
