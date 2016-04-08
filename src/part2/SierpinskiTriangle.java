package part2;
import java.awt.Color;
import java.awt.geom.Point2D;
import draw.UltraDraw;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;



public class SierpinskiTriangle implements MouseListener, MouseMotionListener { 
	
	
	
	 public static int recursion = 0;
	private Point2D.Double top, right, left;
	private Color background = new Color(34, 129, 34);
	private Color foreground = UltraDraw.YELLOW;
	
	public SierpinskiTriangle() {
		
		
		UltraDraw.addMouseMotionListener(this);
		UltraDraw.addMouseListener(this);
		
		UltraDraw.setXscale(0, 150); 
		UltraDraw.setYscale(75, 150); 
		
		top = new Point2D.Double(75,150);
		right = new Point2D.Double(150, 75);
		left = new Point2D.Double(0, 75);
		 
		UltraDraw.clear(UltraDraw.GRAY); 
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
		
		drawTriangle(bottom,newRight,newLeft,UltraDraw.BLACK);
		
		
	 
	
	 
	
	 
    
	}
	public void drawTriangle(Point2D.Double a, Point2D.Double b, Point2D.Double c, Color color) {
	   double[] x = {a.x, b.x, c.x};
	   double[] y = {a.y, b.y, c.y};
	   UltraDraw.setPenColor(color);
	   UltraDraw.filledPolygon(x, y);
	}
	
	public void draw(int n) {
		drawTriangle(top,right,left,UltraDraw.WHITE);
		sierpinski(top, right, left, n);
	}
	
	
	
	public static void main(String[] args) { 
		
		SierpinskiTriangle triangle = new SierpinskiTriangle();
		triangle.draw(recursion);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e);
		recursion++;
		
		SierpinskiTriangle triangle = new SierpinskiTriangle();
		triangle.draw(recursion);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
