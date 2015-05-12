package cst1201;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

/**
 * A class representing a Papert-style Turtle that can be moved about a canvas.
 * This class acts as an initializer and wrapper for the JTF Turtle, so that it
 * can be controlled through the BlueJ interface
 *
 * Note that this class uses a singleton canvas (run as an apple
 *
 * @author Joel // Goutam & Francisco
 * @version Aug 2013
 */
public class Turtle {

    private GTurtle turtle; //the underlying turtle object

    private static TurtleCanvas canvas = null; //another singleton canvas

    /**
     * Constructor for objects of class Turtle
     */
    public Turtle() {
        turtle = new GTurtle(); //our turtle object is created here!
        turtle.setSpeed(0.75);
        turtle.setSize(30); //make the turtle not too big
        turtle.penDown(); //start with pen down

        if (canvas == null) {
            canvas = new TurtleCanvas();
            canvas.start();
        }
        canvas.addTurtle(turtle);
    }

    /**
     * Moves the turtle forward the specified distance (in pixels)
     */
    public void forward(double distance) {
        turtle.forward(distance);
        turtle.setColor(turtle.getColor()); //fix for lines not showing up via BlueJ...
    }

    /**
     * Puts the turtle's pen down.
     */
    public void penDown() {
        turtle.penDown();
    }

    /**
     * Lifts the turtle's pen up.
     */
    public void penUp() {
        turtle.penUp();
    }

    /**
     * Turns the turtle to the left the specified number of degrees
     */
    public void left(int angle) {
        turtle.left(angle);
    }

    /**
     * Turns the turtle to the right the specified number of degrees
     */
    public void right(int angle) {
        turtle.right(angle);
    }

    /**
     * Sets the color of the turtle's pen. Possible values are: "blue", "cyan",
     * "gray", "magenta", "orange", "pink", "red", "yellow", and "black"
     */
    public void setPenColor(String color) {
        turtle.setColor(this.getColorFromString(color));
    }

    /**
     * Helper method for converting Strings to colors
     */
    private Color getColorFromString(String c) {
        if (c.equals("blue")) {
            return Color.BLUE;
        }
        if (c.equals("cyan")) {
            return Color.CYAN;
        }
        if (c.equals("gray")) {
            return Color.GRAY;
        }
        if (c.equals("green")) {
            return Color.GREEN;
        }
        if (c.equals("magenta")) {
            return Color.MAGENTA;
        }
        if (c.equals("orange")) {
            return Color.ORANGE;
        }
        if (c.equals("pink")) {
            return Color.PINK;
        }
        if (c.equals("red")) {
            return Color.RED;
        }
        if (c.equals("white")) {
            return Color.WHITE;
        }
        if (c.equals("yellow")) {
            return Color.YELLOW;
        }
        return Color.BLACK; //return black otherwise
    }

    /**
     * A private class that controls the window; basically just adds the turtle
     */
    private class TurtleCanvas extends GraphicsProgram {

        public void run() {
            this.setTitle("Turtle Drawing");
        }

        public void addTurtle(GTurtle turtle) {
            this.add(turtle, 100, getHeight() - 100);
        }

        public void erase() {
            this.removeAll();
            this.repaint();
        }
    }
}
