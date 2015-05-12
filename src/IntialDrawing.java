import cst1201.Turtle;

public class IntialDrawing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntialDrawing I = new IntialDrawing();
        I.draw();
    }

    public void draw() {
        //this is the *body* of the draw() method
        Turtle myTurtle = new Turtle();
        myTurtle.setPenColor("blue");
        myTurtle.left(90);
        myTurtle.forward(300);
        myTurtle.right(100);
        myTurtle.forward(200);
        myTurtle.right(80);
        myTurtle.forward(232);
        myTurtle.right(80);
        myTurtle.forward(200);

        myTurtle.penUp();
        myTurtle.right(170);
        myTurtle.forward(300);

        myTurtle.penDown();
        myTurtle.left(70);
        myTurtle.forward(100);
        
        myTurtle.penUp();
        myTurtle.left(100);
        myTurtle.forward(50);
        myTurtle.left(80);
        myTurtle.forward(40);
        
        myTurtle.penDown();
        myTurtle.left(90);
        myTurtle.forward(100);
        
        myTurtle.penUp();
        myTurtle.forward(70);
        myTurtle.right((100));
        myTurtle.forward(160);
        myTurtle.right(170);
        
        myTurtle.penDown();
        myTurtle.forward(300);
        myTurtle.right(100);
        myTurtle.forward(200);
        myTurtle.right(80);
        myTurtle.forward(232);
        myTurtle.right(80);
        myTurtle.forward(200);
        
        

    }
}
