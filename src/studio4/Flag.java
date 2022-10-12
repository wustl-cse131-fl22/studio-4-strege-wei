package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	//flag boarder
	Color wei = new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
	StdDraw.setPenColor(wei);
	StdDraw.filledRectangle(.5, .5, .35, .23);
	
	
	StdDraw.setPenColor(Color.YELLOW);
	StdDraw.filledCircle(0.5, 0.5, 0.2);
	
	StdDraw.setPenColor(Color.GREEN);
	StdDraw.filledEllipse(0.47, 0.5, 0.08, 0.1);
	
	StdDraw.setPenColor(Color.GREEN);
	StdDraw.filledEllipse(0.53, 0.5, 0.08, 0.1);
	
	StdDraw.setPenColor(Color.YELLOW);
	StdDraw.filledCircle(0.6, 0.53, 0.05);
	
	StdDraw.setPenColor(Color.GREEN);
	StdDraw.filledEllipse(0.5, 0.65, 0.01, 0.04);
	}
}