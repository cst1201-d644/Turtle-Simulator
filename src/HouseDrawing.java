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
public class HouseDrawing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HouseDrawing H = new HouseDrawing();
        H.draw();

    }

    public void draw() {
        //this is the *body* of the draw() method
        Turtle myTurtle = new Turtle();
        myTurtle.setPenColor("black");
        myTurtle.penUp();
        myTurtle.right(100);
        myTurtle.forward(70);
        myTurtle.left(100);
        myTurtle.forward(100);

        myTurtle.penDown();
        myTurtle.left(90);
        myTurtle.forward(280);
        myTurtle.right(90);
        myTurtle.forward(280);
        myTurtle.right(90);
        myTurtle.forward(280);
        myTurtle.right(90);
        myTurtle.forward(280);
        myTurtle.right(90);

        myTurtle.penUp();
        myTurtle.forward(280);

        myTurtle.setPenColor("red");
        myTurtle.penDown();
        myTurtle.right(45);
        myTurtle.forward(Math.sqrt((140 * 140 + 140 * 140)));
        myTurtle.right(90);
        myTurtle.forward(Math.sqrt((140 * 140 + 140 * 140)));

        myTurtle.penUp();
        myTurtle.forward(50);

    }
}
