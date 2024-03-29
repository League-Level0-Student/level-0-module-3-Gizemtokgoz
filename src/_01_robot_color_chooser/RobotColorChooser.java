//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot();
		rob.setSpeed(100);
		//3. Ask the user what color they would like the robot to draw
		for (int i =0; i<4;i++) {
		
		String color = JOptionPane.showInputDialog("What color do you want to draw with, red, blue, green, yellow ?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("red")) {
			rob.setPenColor(Color.red);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(Color.cyan);
		}
		else if(color.equals("green")) {
			rob.setPenColor(Color.green);
		}
		else if(color.equals("yellow")) {
			rob.setPenColor(Color.yellow);
		}
        //6. If the user doesn’t enter anything, choose a random color

		else {
			
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
				
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		}
	}
}
