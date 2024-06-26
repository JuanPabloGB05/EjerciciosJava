package swing.ejemplojava2d;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Lienzo extends JPanel {

	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.drawLine(0, 0, 800, 800);
		g2d.setColor(Color.YELLOW);
		g2d.fillOval(100, 100, 300, 300);
		g2d.setColor(Color.BLUE);
		g2d.drawOval(100, 100, 300, 300);
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.YELLOW);
		g2d.fillOval(400, 400, 300, 300);
		g2d.setColor(Color.BLUE);
		g2d.drawOval(400, 400, 300, 300);
		
	}
	
}
