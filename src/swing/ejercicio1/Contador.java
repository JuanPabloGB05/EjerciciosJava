package swing.ejercicio1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Contador extends JPanel {

	private static final long serialVersionUID = 1L;
	
	int contador;
	JTextField textField;
	
	public Contador(boolean botonInc, int top, int left, int bottom, int right) {
		setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(top, left,  bottom, right),
				BorderFactory.createLineBorder(Color.BLACK)
		));
		JButton reset = new JButton("RESET");
		reset.addActionListener(this::reset);
		add(reset);
		textField = new JTextField("0");
		textField.setColumns(20);
		add(textField);
		if (botonInc) {
			JButton inc = new JButton("+");
			inc.addActionListener(this::inc);
			add(inc);
		}
		else
			((FlowLayout) getLayout()).setAlignment(FlowLayout.LEFT);
	}
	
	public void reset(ActionEvent e) {
		contador = 0;
		textField.setText("0");
	}
	
	public void inc(ActionEvent e) {
		textField.setText(String.valueOf(++contador));
	}
	
	public void inc(int cantidad) {
		textField.setText(String.valueOf(contador += cantidad));
	}

}
