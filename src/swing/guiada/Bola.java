package swing.guiada;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bola {
	private Lienzo lienzo;
	private double x;
	private double y;
	private int diametro;
	private double vx;
	private double vy;

	public Bola(Lienzo lienzo, double x, double y, int diámetro, double dirección, double velocidad) {
		this.x = x;
		this.y = y;
		this.diametro = diámetro;
		vx = Math.cos(dirección) * velocidad;
		vy = Math.sin(dirección) * velocidad;
		this.lienzo = lienzo;
	}

	public void paint(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillOval((int) x, (int) y, diametro, diametro);
	}

	public void mover(long lapso) {
		x += (lapso * vx) / 1000000000L;
		y += (lapso * vy) / 1000000000L;
		if (x + diametro >= lienzo.getWidth()) {
			x = 2 * lienzo.getWidth() - x - 2 * diametro;
			vx *= -1;
		} else if (x < 0) {
			x = -x;
			vx *= -1;
		} else if (y + diametro >= lienzo.getHeight()) {
			y = 2 * lienzo.getHeight() - y - 2 * diametro;
			vy *= -1;
		} else if (y < 0) {
			y = -y;
			vy *= -1;
		}
	}
}
