package model;
import processing.core.*;

public class Clock{
	Integer xLoc;
	Integer yLoc;
	Integer radius;
	Hand big;
	Hand little;
	Boolean clicked = false;
	
	PApplet parr;
	
	public Clock() {
		
	}
	
	public Clock(PApplet parr, double xLoc, double yLoc, double radius) {
		this.parr = parr;
		this.xLoc = (int) xLoc;
		this.yLoc = (int) yLoc;
		this.radius = (int) radius;
		
		big = new Hand(parr, this, (float) 12, (float) 2.1, 0.0);
		little = new Hand(parr, this, (float) 12, (float) 2.1, 0.0);
	}
	
	public void display() {
		parr.stroke(0);
		parr.translate(xLoc, yLoc);
		parr.ellipse(0, 0, radius, radius);
		little.display();
		little.rotate(-2.0);
		big.display();
		big.rotate(2.0);
		parr.ellipse(0, 0, radius/8, radius/8);
		parr.translate(-xLoc, -yLoc);
	}
	
	public void onClick() {
		if(!clicked) {
			big.setGoToDegree(Math.abs(((270.0-360)/360)*2*Math.PI));
			little.setGoToDegree(Math.abs(((270.0-360)/360)*2*Math.PI));
			clicked = true;
		}else {
			big.setGoToDegree(-1.0);
			little.setGoToDegree(-1.0);
			clicked = false;
		}
	}

	public Integer getxLoc() {
		return xLoc;
	}

	public void setxLoc(Integer xLoc) {
		this.xLoc = xLoc;
	}

	public Integer getyLoc() {
		return yLoc;
	}

	public void setyLoc(Integer yLoc) {
		this.yLoc = yLoc;
	}

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	public PApplet getParr() {
		return parr;
	}

	public void setParr(PApplet parr) {
		this.parr = parr;
	}

	public void changePos(int mouseX, int mouseY) {
		setxLoc(mouseX);
		setyLoc(mouseY);
	}
	
	public Hand getLittleHand() {
		return this.little;
	}
	
	public Hand getBigHand() {
		return this.big;
	}
}
