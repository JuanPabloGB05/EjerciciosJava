package swing.ejemplojava2d;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;

	public Main() {
		super("Ejemplo Java 2D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lienzo lienzo = new Lienzo();
		lienzo.setPreferredSize(new Dimension(900, 900));
		setContentPane(lienzo);
		pack();
		setLocationRelativeTo(null);
	}
	
	private static void mostrar() {
		new Main().setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(Main::mostrar);
	}

}
