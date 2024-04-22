package swing.guiada;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Lienzo extends JPanel {
	private static final long serialVersionUID = 1L;
	private long fps;
	private Thread t;
	private boolean pausado;
	private Bola bola;
	private BufferedImage buffer;
	private Graphics2D g;

	public Lienzo(int w, int h, long fps) {
		setPreferredSize(new Dimension(w, h));
		this.fps = fps;
		bola = new Bola(this, (w - 31) / 2d, (h - 31) / 2d, 31, 45d, 200l);
		buffer = new BufferedImage((int) w, (int) h, BufferedImage.TYPE_INT_ARGB);
		g = (Graphics2D) buffer.getGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	}

	private void ejecutarAnimación() {
		long t0 = System.nanoTime();
		long t1;
		long lapso = 0;
		long nanosXframe = 1000000000L / fps;
		while (!Thread.currentThread().isInterrupted()) {
			synchronized (this) {
				if (pausado) {
					try {
						wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
					t0 = System.nanoTime();
				}
			}
			t1 = System.nanoTime();
			lapso += t1 - t0;
			t0 = t1;
			if (lapso >= nanosXframe) {
				lapso -= nanosXframe;
				siguiente(nanosXframe);
				dibujarFrame();
			}
		}
	}

	public void detener() {
		t.interrupt();
	}

	public synchronized void pausar() {
		pausado = true;
	}

	public synchronized void reanudar() {
		if (pausado) {
			pausado = false;
			notify();
		}
	}

	public synchronized boolean pausado() {
		return pausado;
	}

	private void siguiente(long lapse) {
		bola.mover(lapse);
	}

	private void dibujarFrame() {
		Graphics2D g = (Graphics2D) getGraphics();
		dibujarFrame(g);
		g.dispose();
	}

	private void dibujarFrame(Graphics2D gp) {
		// se dibuja el frame en el buffer
		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());
		bola.paint(g);
		// se vuelca el buffer al panel
		gp.drawImage(buffer, 0, 0, this);
	}

	public void iniciar() {
		t = new Thread(this::ejecutarAnimación);
		t.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		dibujarFrame((Graphics2D) g);
	}

}
