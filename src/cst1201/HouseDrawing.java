/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

/**
 *
 * @author class
 */
public class HouseDrawing {


        public void draw() {
	
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
