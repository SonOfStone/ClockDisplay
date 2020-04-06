package model;

import processing.core.PApplet;

public class Hand extends Clock{
	Clock clock;
	PApplet parr;
	
	//bigger number means smaller hand
	Float widthMulti;
	Float lengthMulti;
	
	double tolerance = .03;
	
	//radians
	Double degree;
	Double goToDegree = -1.0;

	public Hand(PApplet parr, Clock clock, Float widthMulti, Float lengthMulti, Double degree) {
		super();
		this.parr = parr;
		this.clock = clock;
		this.widthMulti = widthMulti;
		this.lengthMulti = lengthMulti;
		this.degree = degree;
	}
	
	public void display() {
		parr.rotate((float) (1*degree));
		parr.rect(0, 0 - clock.getRadius()/(widthMulti*2), clock.getRadius()/lengthMulti, clock .getRadius()/widthMulti);
		parr.rotate((float) (-1*degree));
	}
	
	public void rotate(Double degree) {
		//check for Pi*2 and 0
		if(goToDegree == Math.PI*2) {
			if(Math.abs(goToDegree - this.degree) >= tolerance && Math.abs(0 - this.degree) >= tolerance) {
				System.out.println("----------------------------------");
				System.out.println("Stop at :" + this.goToDegree);
				System.out.println("Currently at: " + this.degree);
				System.out.println("----------------------------------");
				Double radian = degree * Math.PI*2/360;
				this.degree = (this.degree + radian + Math.PI*2)%(Math.PI*2);
			}
		//otherwise check normally
		}else if(Math.abs(goToDegree - this.degree) >= tolerance) {
			System.out.println("----------------------------------");
			System.out.println("Stop at :" + this.goToDegree);
			System.out.println("Currently at: " + this.degree);
			System.out.println("----------------------------------");
			Double radian = degree * Math.PI*2/360;
			this.degree = (this.degree + radian + Math.PI*2)%(Math.PI*2);
		}
	}

	public Double getGoToDegree() {
		return goToDegree;
	}

	public void setGoToDegree(Double goToDegree) {
		if(goToDegree == 360) {
			this.goToDegree = Math.PI *2;
		}else if(goToDegree > 0) {
			this.goToDegree = Math.abs(((goToDegree-360)/360)*2*Math.PI);
		}else{
			this.goToDegree = -1.0;
		}
	}
	
	public void hide() {
		setGoToDegree(135.0);
	}
}
