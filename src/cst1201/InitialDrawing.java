/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

/**
 *
 * @author Goutam & Francisco
 */
public class InitialDrawing {

    public void draw() {

        Turtle myTurtle = new Turtle();

        myTurtle.setPenColor("blue");
        myTurtle.left(90);
        myTurtle.forward(200);
        myTurtle.right(90);
        myTurtle.forward(100);
        myTurtle.left(180);
        myTurtle.penUp();
        myTurtle.forward(100);
        myTurtle.left(90);
        myTurtle.forward(200);
        myTurtle.left(90);
        myTurtle.penDown();

        myTurtle.setPenColor("blue");
        myTurtle.forward(100);
        myTurtle.left(90);
        myTurtle.forward(100);
        myTurtle.right(90);
        myTurtle.forward(50);
        myTurtle.penUp();
        myTurtle.forward(100);
        myTurtle.penDown();

        myTurtle.setPenColor("red");
        myTurtle.forward(100);
        myTurtle.penUp();
        myTurtle.left(90);
        myTurtle.forward(50);
        myTurtle.left(90);
        myTurtle.forward(50);
        myTurtle.left(90);
        myTurtle.penDown();

        myTurtle.setPenColor("red");
        myTurtle.forward(100);
        myTurtle.penUp();
        myTurtle.forward(50);
        myTurtle.left(90);
        myTurtle.forward(150);
        myTurtle.left(90);
        myTurtle.penDown();

        myTurtle.setPenColor("blue");
        myTurtle.forward(100);
        myTurtle.right(90);
        myTurtle.forward(100);
        myTurtle.left(90);
        myTurtle.penUp();
        myTurtle.forward(100);
        myTurtle.left(90);
        myTurtle.penDown();

        myTurtle.setPenColor("blue");
        myTurtle.forward(100);
        myTurtle.left(90);
        myTurtle.forward(100);

    }
}
