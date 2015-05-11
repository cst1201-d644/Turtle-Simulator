/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

/**
 *
 * @author Mingjie Huang
 */
public class InitialDrawing {

    public void draw() {

        Turtle myturtle = new Turtle();
        myturtle.setPenColor("cyan");
        myturtle.forward(60);
        myturtle.left(90);
        myturtle.forward(180);
        myturtle.left(90);
        myturtle.forward(60);
        myturtle.left(180);
        myturtle.forward(120);
        myturtle.right(90);
        myturtle.penUp();
        myturtle.forward(90);
        myturtle.left(90);
        myturtle.penDown();
        myturtle.forward(90);
        myturtle.left(180);
        myturtle.forward(45);
        myturtle.right(90);
        myturtle.forward(45);
        myturtle.right(180);
        myturtle.forward(90);
        myturtle.penUp();
        myturtle.forward(45);
        myturtle.left(90);
        myturtle.forward(180);
        myturtle.left(180);
        myturtle.penDown();
        myturtle.forward(120);
        myturtle.right(130);
        myturtle.forward(190);
        myturtle.left(130);
        myturtle.forward(120);

    }
}
