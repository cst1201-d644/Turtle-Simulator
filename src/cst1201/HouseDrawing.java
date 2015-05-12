/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

/**
 *
 * @author Evan Chin
 */
public class HouseDrawing {

    /**
     * This method draws a house with a 45 degree angle roof.
     */
    public void draw() {

        //a^2 + b^2 = c^2, if a was 100, b was 100, then c^2 equals 20000
        double roofDistance = Math.sqrt(20000.0);

        Turtle myTurtle = new Turtle();
        myTurtle.setPenColor("black");

        myTurtle.forward(200);
        myTurtle.left(90);
        myTurtle.forward(200);
        myTurtle.left(90);
        myTurtle.forward(200);
        myTurtle.left(90);
        myTurtle.forward(200);
        myTurtle.left(180);
        myTurtle.penUp();
        
        myTurtle.setPenColor("red");
        myTurtle.forward(200);
        myTurtle.penDown();
        myTurtle.right(45);
        myTurtle.forward(roofDistance);
        myTurtle.right(90);
        myTurtle.forward(roofDistance);

    }
}
