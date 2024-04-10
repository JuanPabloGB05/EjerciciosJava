package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MyApp3 extends JFrame {
	
	private static final long serialVersionUID = 1L;
		
    MyApp3() {
    	super("Mi Primera Aplicación GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) getContentPane();
        panel.setPreferredSize(new Dimension(900, 700));
        JLabel label = new JLabel("ARRIBA");
        label.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        panel.add(new JButton("Pulsa aquí"), BorderLayout.CENTER);
        panel.add(label, BorderLayout.NORTH);
        panel.add(new JLabel("ABAJO"), BorderLayout.SOUTH);
        panel.add(new JLabel("IZQUIERDA"), BorderLayout.WEST);
        panel.add(new JLabel("DERECHA"), BorderLayout.EAST);
        pack();
        setLocationRelativeTo(null);
    }

    static void iniciar() {
    	new MyApp3().setVisible(true);
    }
    
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(MyApp3::iniciar);
    }
}