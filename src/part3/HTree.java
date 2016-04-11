package part3;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Point2D;
import draw.UltraDraw;



public class HTree implements KeyListener {
	
	private Point2D.Double center;
	private H start;
	private Color background = new Color(34, 129, 34);
	private Color foreground = UltraDraw.YELLOW;
	private int size = 50;
	
	public static void main(String[] args) {
		HTree htree = new HTree();
		htree.draw(3);
	}

	
	public HTree() {
		
		center = new Point2D.Double(75,75);
		start = new H(center,size);
		UltraDraw.setXscale(0,150);
		UltraDraw.setYscale(0,150);
		UltraDraw.clear(UltraDraw.GRAY);
		
		
		
	}
	
	
	public void drawH(H a, int n){
		if( n==0) {
			return;
		}
		 H topRight,topLeft,botRight, botLeft;
		 topRight = new H(a.getTopRight(),a.getSize()/2);
			topLeft = new H(a.getTopLeft(),a.getSize()/2);
			botRight = new H(a.getBottomRight(),a.getSize()/2);
			botLeft = new H(a.getBottomLeft(),a.getSize()/2);
			drawH(topLeft,n-1);
			drawH(topRight,n-1);
			drawH(botLeft,n-1);
			drawH(botRight,n-1);
			
			topLeft.draw();
			botLeft.draw();
			topRight.draw();
			botRight.draw();
			
	}
	
	
	public void draw(int n) {
	start.draw();
	drawH(start,n);
	
	
	}


	


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
