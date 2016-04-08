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
	
	public static void main(String[] args) {
		HTree htree = new HTree();
		htree.draw(3);
	}

	
	public HTree() {
		center = new Point2D.Double(75,75);
		start = new H(center,50);
		UltraDraw.setXscale(0,150);
		UltraDraw.setYscale(0,150);
		UltraDraw.clear(UltraDraw.GRAY);
		
		
	}
	
	
	
	public void draw(int n) {
	if( n==0) return;
	
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
