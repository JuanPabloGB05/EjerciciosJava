package swing.ejercicio1;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;

	public Main() {
		super("Multi-Contador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container content = getContentPane();
		content.setLayout(new GridLayout(4,1));
		add(new Contador(true, 10, 10, 0, 10));
		add(new Contador(true, 10, 10, 0, 10));
		add(new Contador(true, 10, 10, 0, 10));
		add(new Contador(false, 10, 10, 10, 10));
		pack();
		setLocationRelativeTo(null);
	}
	
	static void iniciar() {
		new Main().setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(Main::iniciar);
	}

}
