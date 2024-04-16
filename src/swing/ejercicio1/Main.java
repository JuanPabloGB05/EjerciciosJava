package swing.ejercicio1;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main extends JFrame implements WindowListener {

	private static final long serialVersionUID = 1L;

	public Main() {
		super("Multi-Contador");
		addWindowListener(this);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
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

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosing(WindowEvent e) {
		int opcion = JOptionPane.showConfirmDialog(this, "¿Esta seguro de que desea salir?");
		if (opcion == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
	}

}
