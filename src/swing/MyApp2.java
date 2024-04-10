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

public class MyApp2 {
	
	JFrame frame;
	
    MyApp2(String[] args) {
    	frame = new JFrame("Mi Primera Aplicación GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setPreferredSize(new Dimension(900, 700));
        JLabel label = new JLabel("ARRIBA");
        label.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        panel.add(new JButton("Pulsa aquí"), BorderLayout.CENTER);
        panel.add(label, BorderLayout.NORTH);
        panel.add(new JLabel("ABAJO"), BorderLayout.SOUTH);
        panel.add(new JLabel("IZQUIERDA"), BorderLayout.WEST);
        panel.add(new JLabel("DERECHA"), BorderLayout.EAST);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void show() {
    	frame.setVisible(true);
    }

    public static void main(final String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyApp2(args).show();
            }
        });
    }
}