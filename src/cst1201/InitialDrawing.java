/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

/**
 *
 * @author Niaz Morshed and Devaya Gurung
 */
public class InitialDrawing {

    // The draw method draw the initial of the name
    public void draw() {
        Turtle myTurtle = new Turtle();
        myTurtle.setPenColor("red");
        myTurtle.left(90);
        myTurtle.forward(300);
        myTurtle.right(145);
        myTurtle.forward(355);
        myTurtle.left(145);
        myTurtle.forward(300);

        myTurtle.right(90);
        myTurtle.penUp();
        myTurtle.forward(100);
        myTurtle.right(90);
        myTurtle.forward(100);
        myTurtle.penDown();
        myTurtle.setPenColor("blue");
        myTurtle.forward(100);
        myTurtle.right(90);
        myTurtle.penUp();
        myTurtle.forward(45);
        myTurtle.right(90);
        myTurtle.forward(45);
        myTurtle.right(90);
        myTurtle.penDown();
        myTurtle.forward(90);

        myTurtle.penUp();
        myTurtle.forward(45);
        myTurtle.right(90);
        myTurtle.forward(150);
        myTurtle.right(180);
        myTurtle.penDown();
        myTurtle.setPenColor("orange");
        myTurtle.forward(300);
        myTurtle.right(135);

        myTurtle.penDown();
        myTurtle.forward(Math.sqrt(45000));
        myTurtle.right(90);
        myTurtle.forward(Math.sqrt(45000));
    }
}
