package testWindowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.DropMode;

public class Test extends JFrame{
	private JTextField txtNom;
	private JTextField txtPrnom;
	public Test() {
		this.setBounds(0,0,1000,5000);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(49, 45, 61, 16);
		getContentPane().add(lblNom);
		
		txtNom = new JTextField();
		txtNom.setForeground(Color.GRAY);
		txtNom.setText("Nom");
		txtNom.setBounds(105, 39, 134, 28);
		getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prénom");
		lblNewLabel.setBounds(49, 102, 61, 16);
		getContentPane().add(lblNewLabel);
		
		txtPrnom = new JTextField();
		txtPrnom.setText("Prénom");
		txtPrnom.setForeground(Color.GRAY);
		txtPrnom.setColumns(10);
		txtPrnom.setBounds(105, 96, 134, 28);
		getContentPane().add(txtPrnom);
	}
}
