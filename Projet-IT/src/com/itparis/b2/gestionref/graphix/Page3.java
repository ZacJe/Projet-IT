package com.itparis.b2.gestionref.graphix;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Page3 extends JFrame implements ActionListener{
	private JPanel pan;
	private JScrollPane span;
	private JTextField txtNom;
	private JTextField txtNumroDeCarte;
	private JTextField txtCryptogramme;
	public Page3(){
		this.setBounds(0,0,657,380);
		pan = new JPanel();
		pan.setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pan.setBackground(Color.WHITE);
		span = new JScrollPane(pan);
		
		JLabel lblNewLabel_1 = new JLabel("<html><u>Saisissez les informations relatives à votre inscription</u></html>");
		lblNewLabel_1.setBounds(148, 6, 377, 16);
		lblNewLabel_1.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 14));
		pan.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox(" J'ai lu et j'accepte les conditions générales de participation ");
	    chckbxNewCheckBox.setForeground(Color.BLACK);
	    chckbxNewCheckBox.setBounds(21, 214, 409, 23);
	    pan.add(chckbxNewCheckBox);
	    
	    JLabel label = new JLabel("*");
	    label.setForeground(Color.RED);
	    label.setBounds(422, 214, 12, 16);
	    pan.add(label);
	    
	    JLabel lblNewLabel_3 = new JLabel("<html><u>Cliquez ici pour afficher les conditions générales de participation</u></html>");
	    lblNewLabel_3.setForeground(UIManager.getColor("Button.light"));
	    lblNewLabel_3.setBounds(27, 241, 418, 16);
	    pan.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("<html>Mode de paiement<FONT clor=\"red\">*</FONT> :</html>");
		lblNewLabel.setBounds(33, 50, 132, 16);
		pan.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setForeground(Color.BLACK);
		comboBox.setBounds(177, 46, 181, 27);
		pan.add(comboBox);
		
		JLabel lblnomDuTitulaire = new JLabel("<html>Nom du titulaire de la carte<FONT clor=\"red\">*</FONT> :</html>");
		lblnomDuTitulaire.setBounds(33, 83, 192, 16);
		pan.add(lblnomDuTitulaire);
		
		JLabel lblnumroDeLa = new JLabel("<html>Numéro de carte<FONT clor=\"red\">*</FONT> :</html>");
		lblnumroDeLa.setBounds(33, 115, 132, 16);
		pan.add(lblnumroDeLa);
		
		JLabel lblcryptogramme = new JLabel("<html>Cryptogramme<FONT clor=\"red\">*</FONT> :</html>");
		lblcryptogramme.setBounds(33, 146, 132, 16);
		pan.add(lblcryptogramme);
		
		JLabel lbldateDeFin = new JLabel("<html>Date de fin de validité<FONT clor=\"red\">*</FONT> :</html>");
		lbldateDeFin.setBounds(33, 178, 160, 16);
		pan.add(lbldateDeFin);
		
		txtNom = new JTextField();
		txtNom.setForeground(Color.GRAY);
		txtNom.setText("Nom");
		txtNom.setBounds(237, 77, 193, 28);
		pan.add(txtNom);
		txtNom.setColumns(10);
		
		txtNumroDeCarte = new JTextField();
		txtNumroDeCarte.setText("Numéro de carte");
		txtNumroDeCarte.setForeground(Color.GRAY);
		txtNumroDeCarte.setColumns(10);
		txtNumroDeCarte.setBounds(170, 109, 188, 28);
		pan.add(txtNumroDeCarte);
		
		txtCryptogramme = new JTextField();
		txtCryptogramme.setText("Cryptogramme");
		txtCryptogramme.setForeground(Color.GRAY);
		txtCryptogramme.setColumns(10);
		txtCryptogramme.setBounds(159, 140, 181, 28);
		pan.add(txtCryptogramme);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("");
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBounds(205, 174, 181, 27);
		pan.add(comboBox_1);
		
		JButton btnNewButton = new JButton(new ImageIcon("src/com/itparis/b2/gestionref/graphix/Precedent.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(28, 277, 181, 52);
		pan.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton(new ImageIcon("src/com/itparis/b2/gestionref/graphix/Valider.jpg"));
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton2.setBounds(421, 277, 181, 52);
		pan.add(btnNewButton2);
		getContentPane().add(span);

		getContentPane().add(span);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
