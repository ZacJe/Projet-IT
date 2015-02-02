package testWindowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.DropMode;

public class Test extends JFrame{
	private JTextField txtNom;
	public Test() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JPanel Monpanel = new JPanel();
		Monpanel.setBounds(6, 6, 493, 288);
		getContentPane().add(Monpanel);
		Monpanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(35, 11, 61, 16);
		Monpanel.add(lblNewLabel);
		
		txtNom = new JTextField();
		txtNom.setDropMode(DropMode.ON);
		txtNom.setForeground(Color.GRAY);
		txtNom.setText("nom");
		txtNom.setBounds(187, 5, 134, 28);
		Monpanel.add(txtNom);
		txtNom.setColumns(10);
	}
}
