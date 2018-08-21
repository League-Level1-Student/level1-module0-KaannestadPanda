import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class House {
	static Robot rob=new Robot();
	static int y=10;
	public static void main(String[] args) {
		rob.setX(50);
		Robot.setWindowColor(0, 0, 0);
		rob.setY(550);
		rob.setSpeed(10);
		for(int i=0;i<10;i++) {
			drawHouseo();
		}
	}
	
	
	
	static void drawHouseo() {
		String talles = JOptionPane.showInputDialog("HOW TALL>>>?????");
		
		if(talles.equals("small")) {
			 y=60;
		}
		else if(talles.equals("medium")) {
			 y=120;
		}
		else if(talles.equals("large")) {
			 y=250;
		}
		else {
			y=30;
		}
		String color = JOptionPane.showInputDialog("What colorrrr?");
		if(color.equals("red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if(color.equals("green")) {
			rob.setPenColor(0, 255, 0);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(0, 0, 255);
		}
		else if(color.equals("black")) {
			rob.setPenColor(0, 0, 0);
		}
		else if(color.equals("white")) {
			rob.setPenColor(255,255,255);
		}
		else {
			rob.setRandomPenColor();
		}
		
		
		
		
		rob.penDown();
		rob.move(y);
		if(y==250) {
			drawFlatRoof();
		}
		else {
			drawPointyRoof();
		}
		rob.move(y);
		rob.turn(-90);
		rob.setPenColor(0, 150, 0);
		rob.move(20);
		rob.turn(-90);
	}
	
	static void drawFlatRoof() {
		rob.turn(90);
		rob.move(40);
		rob.turn(90);
	}
	
	static void drawPointyRoof() {
		rob.turn(45);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(45);
	}
	
}
