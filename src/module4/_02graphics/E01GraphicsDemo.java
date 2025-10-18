package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class E01GraphicsDemo {

	/*
	 * Exercise: use the StdDraw API to draw the requested
	 * items below.
	 */
	public static void main(String[] args) {
		//Using a built-in color
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(0.5, 0.5, .2);
		
		//Using a custom color
		Color purply = new Color(255, 0, 150);
		StdDraw.setPenColor(purply);
		StdDraw.filledCircle(.75, .75, .1);
		
		//Use the StdDraw API to do the following:
		 StdDraw.setXscale(0, 10);
        StdDraw.setYscale(0, 10);

        // Draw a blue point anywhere
        StdDraw.setPenColor(Color.BLUE);
        StdDraw.point(2, 8);

        // Draw a larger green point someplace else
        StdDraw.setPenColor(Color.GREEN);
        StdDraw.setPenRadius(0.2);  // increase pen radius
        StdDraw.point(7, 8);
        StdDraw.setPenRadius();      // reset back to default

        // Draw an unfilled red triangle
        StdDraw.setPenColor(Color.RED);
        double[] x = {2, 4, 3};
        double[] y = {2, 2, 4};
        StdDraw.polygon(x, y);

        // Draw a filled yellow circle
        StdDraw.setPenColor(Color.YELLOW);
        StdDraw.filledCircle(6, 3, 1);

        // Draw a filled blue rectangle
        StdDraw.setPenColor(Color.BLUE);
        StdDraw.filledRectangle(8, 1, 1.5, 0.5); // center=(8,1), halfWidth=1.5, halfHeight=0.5
    
		
	}
}
