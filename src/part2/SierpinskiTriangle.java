package part2;
import java.awt.Color;
import java.awt.geom.Point2D;
import draw.StdDraw;


public class SierpinskiTriangle { 
   
	private Point2D.Double top, right, left;
	private Color background = new Color(34, 129, 34);
	private Color foreground = StdDraw.YELLOW;
	
	public SierpinskiTriangle() {
		StdDraw.setXscale(0, 150); 
		StdDraw.setYscale(75, 150); 
		
		top = new Point2D.Double(75,150);
		right = new Point2D.Double(150, 75);
		left = new Point2D.Double(0, 75);
		 
		StdDraw.clear(StdDraw.GRAY); 
	}
   
	public void sierpinski(Point2D.Double a, Point2D.Double b, Point2D.Double c, int n) {
		if (n <= 0 ){
			return;
		}
	   Point2D.Double bottom, newRight, newLeft;
		bottom  = new Point2D.Double((b.x+c.x)/2, b.y);
		newRight = new Point2D.Double((a.x+b.x) / 2, (a.y+b.y)/2);
		newLeft = new Point2D.Double((a.x+c.x)/2,(a.y+c.y)/2);
		
		
		sierpinski(a,newRight,newLeft,n-1);
		sierpinski(newRight,b,bottom,n-1);
		sierpinski(newLeft,bottom,c,n-1);
		
		drawTriangle(bottom,newRight,newLeft,StdDraw.BLACK);
		
		
	 
	
	 
	
	 
    
	}
	public void drawTriangle(Point2D.Double a, Point2D.Double b, Point2D.Double c, Color color) {
	   double[] x = {a.x, b.x, c.x};
	   double[] y = {a.y, b.y, c.y};
	   StdDraw.setPenColor(color);
	   StdDraw.filledPolygon(x, y);
	}
	
	public void draw(int n) {
		drawTriangle(top,right,left,StdDraw.WHITE);
		sierpinski(top, right, left, n);
	}
	
	
	
	public static void main(String[] args) { 
		SierpinskiTriangle triangle = new SierpinskiTriangle();
		triangle.draw(3);
	}
}
