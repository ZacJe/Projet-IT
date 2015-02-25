package com.itparis.b2.gestionref.graphix;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.DropMode;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page1 extends JFrame{
	private JTextField txtNom;
	private JTextField txtPrnom;
	private JTextField txtFonction;
	private JTextField txtAdresse;
	private JTextField txtSocit;
	private JTextField txtCodePostal;
	private JTextField txtVille;
	private JTextField txtPortable;
	private JTextField txtFax;
	private JPanel pan;
	private JScrollPane span;
	private JTextField txtVille_1;
	private JTextField txtSiteWeb;
	
	public Page1() {
		this.setBounds(0,0,657,728);
		pan = new JPanel();
		pan.setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pan.setBackground(Color.WHITE);
		span = new JScrollPane(pan);
		
		JLabel lblNom = new JLabel("<html>Nom<FONT color = \"red\">*</FONT> :</html>");
		lblNom.setBounds(49, 141, 61, 16);
		pan.add(lblNom);
		
		txtNom = new JTextField();
		txtNom.setBounds(122, 135, 170, 28);
		txtNom.setForeground(Color.GRAY);
		txtNom.setText("Nom");
		pan.add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("<html>Prénom<FONT color = \"red\">*</FONT> :</html>");
		lblNewLabel.setBounds(49, 174, 61, 16);
		pan.add(lblNewLabel);
		
		txtPrnom = new JTextField();
		txtPrnom.setBounds(122, 168, 170, 28);
		txtPrnom.setText("Prénom");
		txtPrnom.setForeground(Color.GRAY);
		txtPrnom.setColumns(10);
		pan.add(txtPrnom);
		
		JLabel lblNewLabel_1 = new JLabel("<html><u>Saisissez les informations relatives à votre inscription</u></html>");
		lblNewLabel_1.setBounds(148, 6, 376, 21);
		lblNewLabel_1.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 14));
		pan.add(lblNewLabel_1);
		
		JLabel lblCesInformationsVous = new JLabel("<html>Ces informations vous permettront de réserver un badge que vous pourrez retirer à votre <br> arrivée à la conférence.</html>");
		lblCesInformationsVous.setBounds(49, 34, 553, 33);
		lblCesInformationsVous.setForeground(new Color(0, 102, 0));
		lblCesInformationsVous.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 13));
		pan.add(lblCesInformationsVous);
		
		JLabel lblRenseignements = new JLabel("<html><u>Renseignements</u></html>");
		lblRenseignements.setBounds(49, 79, 110, 16);
		lblRenseignements.setFont(new Font("Helvetica", Font.BOLD, 13));
		pan.add(lblRenseignements);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(120, 103, 175, 27);
		comboBox.setToolTipText("");
		pan.add(comboBox);
		
		JLabel lblCivilit = new JLabel("<html>Civilité<FONT color = \"red\">*</FONT> :</html>");
		lblCivilit.setBounds(49, 107, 61, 16);
		lblCivilit.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		pan.add(lblCivilit);
		
		JLabel lblprnom = new JLabel("<html>Fonction<FONT color=\"red\">*</FONT> :</html>");
		lblprnom.setBounds(49, 208, 84, 16);
		pan.add(lblprnom);
		
		txtFonction = new JTextField();
		txtFonction.setBounds(122, 202, 170, 28);
		txtFonction.setText("Fonction");
		txtFonction.setForeground(Color.GRAY);
		txtFonction.setColumns(10);
		pan.add(txtFonction);
		
		JLabel lblLieuDeRsidence = new JLabel("<html><u>Lieu de résidence</u></html>");
		lblLieuDeRsidence.setBounds(49, 282, 110, 16);
		lblLieuDeRsidence.setFont(new Font("Helvetica", Font.BOLD, 13));
		pan.add(lblLieuDeRsidence);
		
		JLabel lbladresse = new JLabel("<html>Adresse<FONT color = \"red\">*</FONT> :</html>");
		lbladresse.setBounds(49, 316, 73, 16);
		pan.add(lbladresse);
		
		txtAdresse = new JTextField();
		txtAdresse.setBounds(122, 310, 170, 28);
		txtAdresse.setText("Adresse");
		txtAdresse.setForeground(Color.GRAY);
		txtAdresse.setColumns(10);
		pan.add(txtAdresse);
		
		JLabel lblsocit = new JLabel("<html>Société<FONT color=\"red\">*</FONT> :</html>");
		lblsocit.setBounds(49, 242, 84, 16);
		pan.add(lblsocit);
		
		txtSocit = new JTextField();
		txtSocit.setBounds(122, 236, 170, 28);
		txtSocit.setText("Société");
		txtSocit.setForeground(Color.GRAY);
		txtSocit.setColumns(10);
		pan.add(txtSocit);
		
		JLabel lblcp = new JLabel("<html>CP<FONT color = \"red\">*</FONT> :</html>");
		lblcp.setBounds(49, 354, 61, 16);
		pan.add(lblcp);
		
		JLabel lblville = new JLabel("<html>Ville<FONT color = \"red\">*</FONT> :</html>");
		lblville.setBounds(49, 392, 61, 16);
		pan.add(lblville);
		
		JLabel lblpays = new JLabel("<html>Pays<FONT color = \"red\">*</FONT> :</html>");
		lblpays.setBounds(49, 430, 61, 16);
		pan.add(lblpays);
		
		txtCodePostal = new JTextField();
		txtCodePostal.setBounds(122, 348, 170, 28);
		txtCodePostal.setText("Code Postal");
		txtCodePostal.setForeground(Color.GRAY);
		txtCodePostal.setColumns(10);
		pan.add(txtCodePostal);
		
		txtVille = new JTextField();
		txtVille.setBounds(122, 386, 170, 28);
		txtVille.setText("Ville");
		txtVille.setForeground(Color.GRAY);
		txtVille.setColumns(10);
		pan.add(txtVille);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(120, 426, 175, 27);
		comboBox_1.setToolTipText("");
		pan.add(comboBox_1);
		
		JLabel lblCoordonnes = new JLabel("<html><u>Coordonnées</u></html>");
		lblCoordonnes.setBounds(49, 467, 93, 16);
		lblCoordonnes.setFont(new Font("Helvetica", Font.BOLD, 13));
		pan.add(lblCoordonnes);
		
		JLabel lbltl = new JLabel("<html>Téléphone<FONT color = \"red\"></FONT> :</html>");
		lbltl.setBounds(49, 501, 73, 16);
		pan.add(lbltl);
		
		txtPortable = new JTextField();
		txtPortable.setBounds(122, 495, 170, 28);
		txtPortable.setText("Portable");
		txtPortable.setForeground(Color.GRAY);
		txtPortable.setColumns(10);
		pan.add(txtPortable);
		
		JLabel lblfax = new JLabel("<html>Fax<FONT color = \"red\"></FONT> :</html>");
		lblfax.setBounds(49, 541, 73, 16);
		pan.add(lblfax);
		
		txtFax = new JTextField();
		txtFax.setBounds(122, 535, 170, 28);
		txtFax.setText("Fax");
		txtFax.setForeground(Color.GRAY);
		txtFax.setColumns(10);
		pan.add(txtFax);
		
		JLabel lblemail = new JLabel("<html>Email<FONT color = \"red\">*</FONT> :</html>");
		lblemail.setBounds(49, 582, 61, 16);
		pan.add(lblemail);
		
		txtVille_1 = new JTextField();
		txtVille_1.setText("Email");
		txtVille_1.setForeground(Color.GRAY);
		txtVille_1.setColumns(10);
		txtVille_1.setBounds(122, 576, 170, 28);
		pan.add(txtVille_1);
		
		JLabel lblsiteWeb = new JLabel("<html>Site Web<FONT color = \"red\"></FONT> :</html>");
		lblsiteWeb.setBounds(49, 622, 73, 16);
		pan.add(lblsiteWeb);
		
		txtSiteWeb = new JTextField();
		txtSiteWeb.setText("Site Web");
		txtSiteWeb.setForeground(Color.GRAY);
		txtSiteWeb.setColumns(10);
		txtSiteWeb.setBounds(122, 616, 170, 28);
		pan.add(txtSiteWeb);
		
		JButton btnNewButton = new JButton(new ImageIcon("src/com/itparis/b2/gestionref/graphix/Suivant.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(421, 644, 181, 52);
		pan.add(btnNewButton);
		getContentPane().add(span);
	}
}
