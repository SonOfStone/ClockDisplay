package runner;
import model.Clock;
import model.Display;
import processing.core.PApplet;

public class App extends PApplet{
	Clock clock;
	Clock clock2;
	Display displayObject;
	Display displayObject2;

	
	public static void main (String args[]) {
		PApplet.main(new String[] {runner.App.class.getName()});
	}
	
	public void settings() {
		size(1920, 1080);
		
		Integer xLoc = 1000;
		Integer yLoc = 500;
		Integer radius = 80;
		clock = new Clock(this, xLoc, yLoc, radius);
		clock2 = new Clock(this, xLoc, yLoc, 250);
		displayObject = new Display(this, 0, 0, 500, 500);
		displayObject2 = new Display(this, 500, 0, 1000, 500);
	}
	
	public void mouseClicked() {
		clock.onClick();
		clock2.onClick();
//		displayObject.onClick();
		displayObject.setNum(5);
		displayObject2.setNum(6);
	}
	
	public void draw() {
		background(255);
//		clock.changePos(mouseX, mouseY);
//		clock.display();
//		clock2.display();
		displayObject.display();
		displayObject2.display();
	}
}
