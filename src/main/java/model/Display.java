package model;
import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;

public class Display{
	Integer xLoc;
	Integer yLoc;
	Integer x2Loc;
	Integer y2Loc;
	double width;
	double height;
	List<Clock> clocks;

	PApplet parr;
	
	public Display() {
		
	}
	
	public Display(PApplet parr, Integer xLoc, Integer yLoc, Integer x2Loc, Integer y2Loc) {
		this.parr = parr;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.x2Loc = x2Loc;
		this.y2Loc = y2Loc;
		width = (double) Math.abs(x2Loc - xLoc);
		height = width*3/2;
		clocks = new ArrayList<Clock>();
		
		for(int i=0; i<2; i++) {
			for(int y=0; y<3; y++) {
				clocks.add(new Clock(parr, xLoc + width/4 + width/2*i, yLoc + height/6 + height/3*y, width/2));
			}
		}
	}
	
	public void display() {
		
		parr.rect((float) xLoc, (float) yLoc, (float) width, (float)height);
		for(Clock clock: clocks) {
			clock.display();
		}
	}
	
	public void onClick() {
		for(Clock clock: clocks) {
			clock.onClick();
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
	
	public void setNum(int input) {
		switch(input) {
			case 0:
				clocks.get(0).getLittleHand().setGoToDegree(360.0);
				clocks.get(0).getBigHand().setGoToDegree(270.0);
				clocks.get(1).getLittleHand().setGoToDegree(90.0);
				clocks.get(1).getBigHand().setGoToDegree(270.0);
				clocks.get(2).getLittleHand().setGoToDegree(90.0);
				clocks.get(2).getBigHand().setGoToDegree(0.0);
				clocks.get(3).getLittleHand().setGoToDegree(180.0);
				clocks.get(3).getBigHand().setGoToDegree(270.0);
				clocks.get(4).getLittleHand().setGoToDegree(90.0);
				clocks.get(4).getBigHand().setGoToDegree(270.0);
				clocks.get(5).getLittleHand().setGoToDegree(90.0);
				clocks.get(5).getBigHand().setGoToDegree(180.0);
				break;
			case 1:
				clocks.get(0).getLittleHand().hide();
				clocks.get(0).getBigHand().hide();
				clocks.get(1).getLittleHand().hide();
				clocks.get(1).getBigHand().hide();
				clocks.get(2).getLittleHand().hide();
				clocks.get(2).getBigHand().hide();
				clocks.get(3).getLittleHand().setGoToDegree(270.0);
				clocks.get(3).getBigHand().setGoToDegree(270.0);
				clocks.get(4).getLittleHand().setGoToDegree(90.0);
				clocks.get(4).getBigHand().setGoToDegree(270.0);
				clocks.get(5).getLittleHand().setGoToDegree(90.0);
				clocks.get(5).getBigHand().setGoToDegree(90.0);
				break;
			case 2:
				clocks.get(0).getLittleHand().setGoToDegree(360.0);
				clocks.get(0).getBigHand().setGoToDegree(360.0);
				clocks.get(1).getLittleHand().setGoToDegree(360.0);
				clocks.get(1).getBigHand().setGoToDegree(270.0);
				clocks.get(2).getLittleHand().setGoToDegree(90.0);
				clocks.get(2).getBigHand().setGoToDegree(360.0);
				clocks.get(3).getLittleHand().setGoToDegree(180.0);
				clocks.get(3).getBigHand().setGoToDegree(270.0);
				clocks.get(4).getLittleHand().setGoToDegree(90.0);
				clocks.get(4).getBigHand().setGoToDegree(180.0);
				clocks.get(5).getLittleHand().setGoToDegree(180.0);
				clocks.get(5).getBigHand().setGoToDegree(180.0);
				break;
			case 3:
				clocks.get(0).getLittleHand().setGoToDegree(360.0);
				clocks.get(0).getBigHand().setGoToDegree(360.0);
				clocks.get(1).getLittleHand().setGoToDegree(360.0);
				clocks.get(1).getBigHand().setGoToDegree(360.0);
				clocks.get(2).getLittleHand().setGoToDegree(360.0);
				clocks.get(2).getBigHand().setGoToDegree(360.0);
				clocks.get(3).getLittleHand().setGoToDegree(180.0);
				clocks.get(3).getBigHand().setGoToDegree(270.0);
				clocks.get(4).getLittleHand().setGoToDegree(90.0);
				clocks.get(4).getBigHand().setGoToDegree(180.0);
				clocks.get(5).getLittleHand().setGoToDegree(180.0);
				clocks.get(5).getBigHand().setGoToDegree(90.0);
				break;
			case 4:
				clocks.get(0).getLittleHand().setGoToDegree(270.0);
				clocks.get(0).getBigHand().setGoToDegree(270.0);
				clocks.get(1).getLittleHand().setGoToDegree(90.0);
				clocks.get(1).getBigHand().setGoToDegree(360.0);
				clocks.get(2).getLittleHand().hide();
				clocks.get(2).getBigHand().hide();
				clocks.get(3).getLittleHand().setGoToDegree(270.0);
				clocks.get(3).getBigHand().setGoToDegree(270.0);
				clocks.get(4).getLittleHand().setGoToDegree(90.0);
				clocks.get(4).getBigHand().setGoToDegree(180.0);
				clocks.get(5).getLittleHand().setGoToDegree(90.0);
				clocks.get(5).getBigHand().setGoToDegree(90.0);
				break;
			case 5:
				clocks.get(0).getLittleHand().setGoToDegree(360.0);
				clocks.get(0).getBigHand().setGoToDegree(270.0);
				clocks.get(1).getLittleHand().setGoToDegree(90.0);
				clocks.get(1).getBigHand().setGoToDegree(360.0);
				clocks.get(2).getLittleHand().setGoToDegree(360.0);
				clocks.get(2).getBigHand().setGoToDegree(360.0);
				clocks.get(3).getLittleHand().setGoToDegree(180.0);
				clocks.get(3).getBigHand().setGoToDegree(180.0);
				clocks.get(4).getLittleHand().setGoToDegree(270.0);
				clocks.get(4).getBigHand().setGoToDegree(180.0);
				clocks.get(5).getLittleHand().setGoToDegree(180.0);
				clocks.get(5).getBigHand().setGoToDegree(90.0);
				break;
			case 6:
				clocks.get(0).getLittleHand().setGoToDegree(360.0);
				clocks.get(0).getBigHand().setGoToDegree(270.0);
				clocks.get(1).getLittleHand().setGoToDegree(270.0);
				clocks.get(1).getBigHand().setGoToDegree(90.0);
				clocks.get(2).getLittleHand().setGoToDegree(90.0);
				clocks.get(2).getBigHand().setGoToDegree(360.0);
				clocks.get(3).getLittleHand().setGoToDegree(180.0);
				clocks.get(3).getBigHand().setGoToDegree(180.0);
				clocks.get(4).getLittleHand().setGoToDegree(270.0);
				clocks.get(4).getBigHand().setGoToDegree(180.0);
				clocks.get(5).getLittleHand().setGoToDegree(180.0);
				clocks.get(5).getBigHand().setGoToDegree(90.0);
				break;
			case 7:
				clocks.get(0).getLittleHand().setGoToDegree(360.0);
				clocks.get(0).getBigHand().setGoToDegree(270.0);
				clocks.get(1).getLittleHand().hide();
				clocks.get(1).getBigHand().hide();
				clocks.get(2).getLittleHand().hide();
				clocks.get(2).getBigHand().hide();
				clocks.get(3).getLittleHand().setGoToDegree(180.0);
				clocks.get(3).getBigHand().setGoToDegree(270.0);
				clocks.get(4).getLittleHand().setGoToDegree(90.0);
				clocks.get(4).getBigHand().setGoToDegree(270.0);
				clocks.get(5).getLittleHand().setGoToDegree(90.0);
				clocks.get(5).getBigHand().setGoToDegree(90.0);
				break;
			case 8:
				clocks.get(0).getLittleHand().setGoToDegree(360.0);
				clocks.get(0).getBigHand().setGoToDegree(270.0);
				clocks.get(1).getLittleHand().setGoToDegree(360.0);
				clocks.get(1).getBigHand().setGoToDegree(90.0);
				clocks.get(2).getLittleHand().setGoToDegree(90.0);
				clocks.get(2).getBigHand().setGoToDegree(360.0);
				clocks.get(3).getLittleHand().setGoToDegree(180.0);
				clocks.get(3).getBigHand().setGoToDegree(270.0);
				clocks.get(4).getLittleHand().setGoToDegree(90.0);
				clocks.get(4).getBigHand().setGoToDegree(180.0);
				clocks.get(5).getLittleHand().setGoToDegree(90.0);
				clocks.get(5).getBigHand().setGoToDegree(180.0);
				break;
			case 9:
				clocks.get(0).getLittleHand().setGoToDegree(360.0);
				clocks.get(0).getBigHand().setGoToDegree(270.0);
				clocks.get(1).getLittleHand().setGoToDegree(90.0);
				clocks.get(1).getBigHand().setGoToDegree(360.0);
				clocks.get(2).getLittleHand().setGoToDegree(360.0);
				clocks.get(2).getBigHand().setGoToDegree(360.0);
				clocks.get(3).getLittleHand().setGoToDegree(180.0);
				clocks.get(3).getBigHand().setGoToDegree(270.0);
				clocks.get(4).getLittleHand().setGoToDegree(90.0);
				clocks.get(4).getBigHand().setGoToDegree(270.0);
				clocks.get(5).getLittleHand().setGoToDegree(180.0);
				clocks.get(5).getBigHand().setGoToDegree(90.0);
				break;
		}
	}
}
