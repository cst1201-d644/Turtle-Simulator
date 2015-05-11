/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

/**
 *
 * @author MingjieHuang
 */
public class HouseDrawing {

    public void draw() {
        double roofDistance = Math.sqrt(20000);//a=100,b=100,a^2=10000,b^2=10000 and c equal to squareroot of a^2+b^2
        Turtle turtle = new Turtle();
        turtle.forward(200);
        turtle.left(90);
        turtle.forward(200);
        turtle.left(90);
        turtle.forward(200);
        turtle.left(90);
        turtle.forward(200);
        turtle.left(180);
        turtle.penUp();
        turtle.forward(200);
        turtle.penDown();
        turtle.right(45);
        turtle.forward(roofDistance);
        turtle.right(90);
        turtle.forward(roofDistance);
    }
}
