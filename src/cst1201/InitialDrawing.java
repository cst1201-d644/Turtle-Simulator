/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

/**
 *
 * @author Winnie Wu & Kenny Tsang
 */
public class InitialDrawing {
    public void draw(){
        Turtle myTurtle = new Turtle();
        myTurtle.setPenColor("magenta");
        myTurtle.left(90);
        myTurtle.penUp();
        myTurtle.forward(300);
        myTurtle.penDown();
        myTurtle.right(180);
        myTurtle.forward(300);
        myTurtle.left(155);
        myTurtle.forward(260);
        myTurtle.right(130);
        myTurtle.forward(260);
        myTurtle.left(155);
        myTurtle.forward(300);
        
        myTurtle.setPenColor("black");
        myTurtle.right(90);
        myTurtle.penUp();
        myTurtle.forward(40);
        myTurtle.right(90);
        myTurtle.forward(150);
        myTurtle.left(90);
        myTurtle.penDown();
        myTurtle.forward(70);
        myTurtle.left(180);
        myTurtle.penUp();
        myTurtle.forward(35);
        myTurtle.right(90);
        myTurtle.forward(35);
        myTurtle.right(180);
        myTurtle.penDown();
        myTurtle.forward(70);
        
        myTurtle.setPenColor("blue");
        myTurtle.left(90);
        myTurtle.penUp();
        myTurtle.forward(95);
        myTurtle.left(90);
        myTurtle.forward(190);
        myTurtle.right(180);
        myTurtle.penDown();
        myTurtle.forward(300);
        myTurtle.left(180);
        myTurtle.penUp();
        myTurtle.forward(150);
        myTurtle.right(45);
        myTurtle.penDown();
        myTurtle.forward(190);
        myTurtle.left(180);
        myTurtle.penUp();
        myTurtle.forward(190);
        myTurtle.left(90); 
        myTurtle.penDown();
        myTurtle.forward(190);
        
    }
}
