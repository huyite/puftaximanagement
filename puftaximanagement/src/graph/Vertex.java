package graph;


import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

public class Vertex {
	int id;
	RectangularShape shape;
	String label;
	private static final Point2D DELTA_LABEL = new Point(1, -1);
	private RectangularShape boder;
  	Vertex(RectangularShape rs, String label) {
		this.shape = rs;
		this.label = label;
		boder= new Ellipse2D.Double(0, 0, 40, 40);
	}
	public boolean contains(int x, int y) {
		return shape.contains(x, y);
	}

	void draw(Graphics2D g2) {
		 g2.fill(shape);
	     g2.draw(boder);
		
		if (label != null)
			g2.drawString(label, (int) (shape.getMaxX() + DELTA_LABEL.getX()),
					(int) (shape.getMinY() + DELTA_LABEL.getY()));
	}
	
}
