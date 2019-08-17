import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.setSpeed(25);
		rob.penDown();

		String number = JOptionPane.showInputDialog("Which shape do you want, square, triangle, or circle?");

		String color = JOptionPane.showInputDialog("What color would you like, blue, red, green, or yellow?");
		if (color.equalsIgnoreCase("blue")) {
			rob.setPenColor(153, 209, 229);
		}

		else if (color.equalsIgnoreCase("red")) {
			rob.setPenColor(242, 108, 108);
		}

		else if (color.equalsIgnoreCase("green")) {
			rob.setPenColor(117, 211, 132);
		} else if (color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(245, 241, 161);
		}

		if (number.equalsIgnoreCase("square")) {
			drawSquare();
		}

		else if (number.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}

		else if (number.equalsIgnoreCase("circle")) {
			drawCircle();
		}

	}

	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
		}
	}

	static void drawTriangle() {
		rob.turn(120);
		rob.move(200);
		rob.turn(120);
		rob.move(200);
		rob.turn(120);
		rob.move(200);
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}

	}
}
