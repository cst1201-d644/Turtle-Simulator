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
public class HouseDrawing {
    
     public static void main (String[] args) {
         
         HouseDrawing a = new HouseDrawing();
         a.draw();
     }
       
     public void draw(){
         
         Turtle myTurtle = new Turtle();
  
     myTurtle.setPenColor("black");
    
         myTurtle.left(90);
         
         myTurtle.forward(100);
         
         myTurtle.right(90);
         
         myTurtle.forward(100);
         
         myTurtle.right(90);
         
         myTurtle.forward(100);
         
         myTurtle.right(90);
         
         myTurtle.forward(100); 
         
          myTurtle.right(90);
         
          
          myTurtle.forward(100);
          
          
           myTurtle.right(30);
           
           
           myTurtle.forward(100);
           
           
            myTurtle.right(120);
           
            myTurtle.forward(100);
           
         
          
          
         
       
}

}