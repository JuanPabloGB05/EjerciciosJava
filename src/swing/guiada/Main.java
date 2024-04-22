package swing.guiada;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;

	Lienzo lienzo;
	
	public Main() {
		super("Bola Rebotando");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lienzo = new Lienzo(1200, 900, 60L);
		setContentPane(lienzo);
		pack();
		setLocationRelativeTo(null);
	}

	public void iniciar() {
		setVisible(true);
		lienzo.iniciar();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Main()::iniciar);
	}
}
