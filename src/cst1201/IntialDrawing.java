/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

/**
 *
 * @author anualli
 */


public class IntialDrawing {
    
    
     public static void main (String[] args) {
         
         IntialDrawing a = new IntialDrawing();
         a.draw();
     }
   
     public void draw(){
   
       
       Turtle myTurtle = new Turtle();
  
     myTurtle.setPenColor("black");
     
     
          myTurtle.left(60);
         
         myTurtle.forward(300);
         
         myTurtle.left(230);
         
         myTurtle.forward(300);
         
         myTurtle.left(180);
         
         myTurtle.forward(150);
         
         myTurtle.left(70);
         
         myTurtle.forward(150);
         
         
         myTurtle.forward(305);
   }
   
}
