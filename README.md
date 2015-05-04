# Turtle-Simulator

## Overview

In the late 1960s, Prof. Seymour Papert developed a robot turtle to help teach young children to program. This robot has a small pen attached to the bottom of it, which would draw a trail on a piece of paper as the robot moved and turned. Children could then program the robot's movement in order to have it draw a particular picture. This method of producing drawings is known as turtle graphics, versions of which can be found in pretty much every programming language.

![Paper Turtle](http://cs.pugetsound.edu/~dchiu/CS161/lab2/figures/papert_turtle.png)

In this lab, we have provided you with a Java-based simulation of this turtle, with basic functionalities. Your task is to boss this turtle around to draw some simple images. This will give you a chance to continue practice writing code and calling methods on Java objects.

This assignment should be completed in pairs.

## Objectives

- To practice writing Java code.
- To practice calling methods on objects, and passing parameters to those methods.
- To practice working with numbers and variables.
- To practice writing methods

## Instructions

Below are detailed instructions for completing this lab. There are a lot of details; be sure and read the instructions carefully, and let me know if anything is unclear!

### Part 1: Drawing a Simple Bowtie

1. Clone this [repository](https://github.com/cst1201-d644/Turtle-Simulator) from GitHub in NetBeans.

1. After you open this project, create a new class called `Simulator` and add a `main` method. In the method, instantiate a new `Turtle` object. Recall to do this, you simply call `new Turtle()`. Once it is created, you should get a new window with a turtle appearing near the canvas' bottom right-hand corner, shown below.

![New Turtle](http://cs.pugetsound.edu/~dchiu/CS161/lab2/figures/turtle_blank.png)

1. Play with the Turtle object's methods from the workbench to get familiar with all its methods. For instance, you can tell the turtle to move forward with the `forward()` method, and you can tell it to turn with the `right()` and `left()` methods. If you don't want the turtle to draw a line when it moves, use the `penUp()` method to raise the pen (and remember to use `penDown()` to put it down again).

1. Now let's draw something by following the instructions below:
  1. Create a Turtle object named `myTurtle`
  1. Set `myTurtle`'s pen color to "blue"
  1. Turn `myTurtle` left by 90 degrees
  1. Move `myTurtle` forward by 300
  1. Turn `myTurtle` right by 135 degrees
  1. Move `myTurtle` forward by 425
  1. Turn `myTurtle` left by 135
  1. Move `myTurtle` forward by 300
  1. Turn `myTurtle` left by 135
  1. Move `myTurtle` forward by 425

1. Wow, that was tedious to do by hand, and I can't imagine how long it would take us to draw something more sophisticated than a bowtie! The good news is that we can program the computer to do all that work for us. In this section, we'll run you through how it's done.

Open the `Bowtie` class. As you can see, besides the class header and a few comments, not much else has been provided to you.

1. First, fill in your names next to `@author` in the block comment at the top of the file.

Now notice how the class header `public class Bowtie` is followed by an open-curly brace `{` and a close-curly brace `}`. These curly braces group together related Java statements. It's saying that anything that goes inside these curly braces belong to the `Bowtie` class.

1. We want to create a method called `draw()` for this `Bowtie` class. Take a look at the snippet of code I've provided for you below. Copy and paste all 9 lines (but delete the line numbers to the left) in between Bowtie's curly braces. Once you've done that, let's re-organize the code by clicking on "Source" > "Format". Let's now learn a little bit more about this code snippet:
```java
  /**
   * (Fill in a brief bescription of what method does)
   */
  public void draw()
  {
    //this is the *body* of the draw() method
    //implement the algorithm to draw a bowtie below
  }
```
- Lines 1-3 is a block comment that describes the method. Recall that comments are completely ignored by the Java compiler, so they only serve the purpose of informing people reading the code. Go ahead and fill in a brief sentence about what this method will perform when it is called.
- Line 4 is the all-important method signature. Here's what it says:
  - The `public` keyword makes the method visible to users.
  - The `void` keyword means this method will not return any values.
  - `draw()` is the method's name, followed by a list of parameters it inputs inside the parentheses. In this case, there are no parameters required.
- Lines 5-8: Notice that we've begun another set of open- and close-curly braces. Now remember what they do: They group together related Java statements, but this time, in the context of the draw() method. The code that goes between the curlies is known as the **method's body**. This is where the draw() method's algorithm will go, instructing a turtle to draw a bowtie.

1. We want the body of the void `draw()` method to run the algorithm we just executed. This means we need to translate the natural language algorithm we've been following to the Java programming language. To get a feel for the translation process, I've gotten things started for you by providing the code to create the head and getting it into position.

| Algorithm in Natural Language	| Java Algorithm (Unfinished) |
| ----------------------------- | ----------------------------|
1. Create a Turtle object named myTurtle | `Turtle myTurtle = new Turtle();`
1. Set myTurtle's pen color to "blue" | `myTurtle.setPenColor("blue");`
1. Turn myTurtle left by 90 degrees | `myTurtle.left(90);`
1. Move myTurtle forward by 300 | 
1. Turn myTurtle right by 135 degrees |
1. Move myTurtle forward by 425 |
1. Turn myTurtle left by 135 |
1. Move myTurtle forward by 300 |
1. Turn myTurtle left by 135 |
1. Move myTurtle forward by 425 |

**Your job** is to complete the remaining translation, and place the code you write directly within the `void draw()` method's **body**.

1. To help with the rest of the translation, recall the following Java syntax:
- To call an instance method, `method()`, on the object referred to as `objectName`, we write:
```java
objectName.method(val1, val2, ...);
```
where `val1, val2, ...` are the values for the method's parameters (i.e., arguments). Note that the parameter list may be empty.
- Finally, notice that there is a semi-colon at the end of each statement you write.

So that you know how to call the rest of the methods, below is a list of methods' signatures that the turtle supports:
```java
/**
 * Move the turtle forward the specified distance (in pixels)
 */
public void forward(double distance)

/**
 * Lowers the pen, so that the turtle will draw when it moves.
 * Note that the pen is down by default.
 */
public void penDown()

/**
 * Raises the pen, so that the turtle won't draw when it moves
 */
public void penUp()

/**
 * Sets the color of the turtle's pen. Possible values are:
 * "blue", "cyan", "gray", "magenta", "orange", "pink", "red",
 * "yellow", and "black"
 */
public void setPenColor(String color)

/**
 * Rotates the turtle to the left the specified number of degrees
 */
public void left(int angle)

/**
 * Rotates the turtle to the right the specified number of degrees
 */
public void right(int angle)
```

1. Helpful hint! Try writing only a few method calls at a time, and then compile and test your method. Get used to this "write a little; test it; write a little more" workflow---it will make your life much easier in the future.

After void `draw()` has been implemented, compile the project again from the Project window. If you cannot get it to compile, then it's probably something minor you mistyped. Let me know if this happens, and I'll help you out. After compiling, instantiate a `Bowtie` object, and call void `draw()`. This time, the drawing should automatically appear.

### Part 2: Your Initials

You should program the turtle to draw out the first initials of you and your partner. So if Joel and David were working together, we'd program the turtle to draw J + D (Yes, you must draw the plus sign).

You need to create a new class, called InitialDrawing. Delete everything but the class header, and create a new draw() method. You can refer back to the Bowtie class for help with syntax.

Inside this method, you should program your turtle using the same tricks and techniques you worked on to draw that bowtie. Be sure to write a bit of your code, then compile and run your program. Using the write/compile/debug cycle!

You are welcome to get creative with this--using different colors, decorations, etc.

###Part 3: House Drawing

Your objective is to create a new class, called HouseDrawing. This class should contain a single draw() method to create and boss around a turtle to draw a house. Upon successful implementation, your drawing will look similar to the following:

Drawing the roof: The pitch (or angle) of the roof should be 45 degrees, with the tallest point being lined up to the center of the house. Turning the turtle in the right directions should not be a problem, but calculating the distance that needs to be drawn can present some challenges. If you go too far or stop too short (see below), the pitch will be skewed to one side:
  
The trick to solving this problem is to observe that the side of the roof is the hypoteneuse, or the longest side (C), of a right triangle, where the other two sides (A) and (B) have equal length:


Luckily, we know the Pythagorean Theorem. Can you use it to solve for the hypotenuse? You will need to get the square root of a number, and Java provides this useful method:

Math.sqrt(???)
where ??? is some mathematical expression. Finally, you can plug the equation to find the hypotenuse right into the forward() method's distance parameter as follows:
myTurtle.forward(Math.sqrt(???));
Alternatively, you might prefer to store the roof's distance in a local variable for better code readability.
double roofDistance = Math.sqrt(???);  //why double?
myTurtle.forward(roofDistance);

Grading

This assignment will be graded out of 10 points.

[2pt] Your Bowtie class has a draw() method that draws a Bowtie
[1pt] You have created a new InitialDrawing class with a draw() method
[2pt] Your InitialDrawing class can draw your initials wth a plus sign
[1pt] You have created a new HouseDrawing class with a draw() method
[1pt] Your HouseDrawing class draws a picture of a house
[1pt] Your house drawing has a roof sloped at 45 degrees
[1pt] All classes have class comments (and author names!) filled in
[1pt] Good programming style -- including proper indentation is expected
Submitting Your Lab

After you have completed the lab, use the following to submit your work on moodle.
Exit BlueJ, and navigate to the project folder you extracted in the beginning of this lab.

Right-click on the project folder, then:

If using Linux, select Compress...
If using Windows, select Send to then Zip file
If using MacOS, select Compress ... items
This step takes your selected files and generates a .zip file.
Right-click on your .zip file and select "Rename". Rename the file to LastName1_LastName2_Lab2.zip, where the LastNames are the respective last names of the authors.

Now navigate to our course on Moodle. You should see the Lab 2 Dropbox. Click on this link, and you should be able to drag your project folder right into the submission box. Click "Save Changes". You may submit as often as you'd like before the deadline. I will grade the most recent copy.

Credits

Adapted for use from a previous assignment by Joel Ross.
Lab Attendance Policies

Attendance is required for lab. Because you work in pairs, your partner is counting on you to be present. I do not require you to use the lab machines if you and your partner would prefer using your laptops. You can download and install BlueJ free from http://www.bluej.org/. (Get the version including the Java SDK).

