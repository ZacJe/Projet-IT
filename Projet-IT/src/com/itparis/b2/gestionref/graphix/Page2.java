package com.itparis.b2.gestionref.graphix;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Page2 extends JFrame implements ActionListener{
	private JPanel pan;
	private JScrollPane span;
	private JTextField txtAutre;
	private JTextField txtEffectif;
	private JTextField txtTitre;
	private JTextField txtMotsCls;
	private JTextField txtRsum;
	private JTextField txtAuteur;
	public Page2() {
		this.setBounds(0,0,657,670);
		pan = new JPanel();
		pan.setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pan.setBackground(Color.WHITE);
		span = new JScrollPane(pan);
		
		JLabel lblNewLabel_1 = new JLabel("<html><u>Saisissez les informations relatives à votre inscription</u></html>");
		lblNewLabel_1.setBounds(148, 6, 377, 16);
		lblNewLabel_1.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 14));
		pan.add(lblNewLabel_1);
		
		JLabel lblVotreEntreprise = new JLabel("<html><u>Votre entreprise</u></html>");
		lblVotreEntreprise.setFont(new Font("Helvetica", Font.BOLD, 13));
		lblVotreEntreprise.setBounds(33, 37, 105, 16);
		pan.add(lblVotreEntreprise);
		
		JLabel lblNewLabel = new JLabel("<html>Activit\u00E9<FONT color = \"red\">*</FONT> :</html>");
		lblNewLabel.setBounds(33, 71, 68, 16);
		pan.add(lblNewLabel);
		
		JLabel lblAutrePrcisez = new JLabel("Autre, précisez :");
		lblAutrePrcisez.setBounds(33, 104, 105, 16);
		pan.add(lblAutrePrcisez);
		
		txtAutre = new JTextField();
		txtAutre.setText("Autre");
		txtAutre.setForeground(Color.GRAY);
		txtAutre.setColumns(10);
		txtAutre.setBounds(148, 98, 184, 28);
		pan.add(txtAutre);
		
		JLabel lbleffectif = new JLabel("<html>Effectif<FONT color = \"red\">*</FONT> :</html>");
		lbleffectif.setBounds(33, 138, 68, 16);
		pan.add(lbleffectif);
		
		txtEffectif = new JTextField();
		txtEffectif.setForeground(Color.GRAY);
		txtEffectif.setText("Effectif");
		txtEffectif.setBounds(148, 132, 184, 28);
		pan.add(txtEffectif);
		txtEffectif.setColumns(10);
		
		JLabel lblarticle = new JLabel("<html><u>Article</u></html>");
		lblarticle.setFont(new Font("Helvetica", Font.BOLD, 13));
		lblarticle.setBounds(33, 175, 50, 16);
		pan.add(lblarticle);
		
		JLabel lbltitre = new JLabel("<html>Titre<FONT color = \"red\">*</FONT> :</html>");
		lbltitre.setBounds(33, 209, 68, 16);
		pan.add(lbltitre);
		
		JLabel lblmotCl = new JLabel("<html>Mots Cl\u00E9s<FONT color = \"red\">*</FONT> :</html>");
		lblmotCl.setBounds(33, 242, 81, 16);
		pan.add(lblmotCl);
		
		JLabel lblrsum = new JLabel("<html>R\u00E9sum\u00E9<FONT color = \"red\">*</FONT> :</html>");
		lblrsum.setBounds(33, 274, 81, 16);
		pan.add(lblrsum);
		
		JLabel lblauteur = new JLabel("<html>Auteur<FONT color = \"red\">*</FONT> :</html>");
		lblauteur.setBounds(33, 306, 68, 16);
		pan.add(lblauteur);
		
		JLabel lblJoindreUnFichier = new JLabel("Joindre un article :");
		lblJoindreUnFichier.setBounds(33, 338, 116, 16);
		pan.add(lblJoindreUnFichier);
		
		txtTitre = new JTextField();
		txtTitre.setText("Titre");
		txtTitre.setForeground(Color.GRAY);
		txtTitre.setColumns(10);
		txtTitre.setBounds(148, 203, 184, 28);
		pan.add(txtTitre);
		
		txtMotsCls = new JTextField();
		txtMotsCls.setText("Mots Cl\u00E9s");
		txtMotsCls.setForeground(Color.GRAY);
		txtMotsCls.setColumns(10);
		txtMotsCls.setBounds(148, 236, 184, 28);
		pan.add(txtMotsCls);
		
		txtRsum = new JTextField();
		txtRsum.setText("R\u00E9sum\u00E9");
		txtRsum.setForeground(Color.GRAY);
		txtRsum.setColumns(10);
		txtRsum.setBounds(148, 268, 184, 28);
		pan.add(txtRsum);
		
		txtAuteur = new JTextField();
		txtAuteur.setText("Auteur");
		txtAuteur.setForeground(Color.GRAY);
		txtAuteur.setColumns(10);
		txtAuteur.setBounds(148, 300, 184, 28);
		pan.add(txtAuteur);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(148, 67, 184, 27);
		pan.add(comboBox);
		
		JButton browse = new JButton("Browse");
		browse.setBounds(148, 333, 184, 28);
	    browse.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	            JFileChooser chooser = new JFileChooser();
	            chooser.setCurrentDirectory(new java.io.File("."));
	            chooser.setDialogTitle("Browse the folder to process");
	            chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	            chooser.setAcceptAllFileFilterUsed(true);

	            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
	                System.out.println("getCurrentDirectory(): "+ chooser.getCurrentDirectory());
	                System.out.println("getSelectedFile() : "+ chooser.getSelectedFile());
	            } else {
	                System.out.println("No Selection ");
	            }
	        }
	    });
	    pan.add(browse);
	    
	    JLabel lblquitesvous = new JLabel("<html><u>Qui \u00EAtes-vous?</u> <FONT color = \"red\">*</FONT></html>");
	    lblquitesvous.setFont(new Font("Helvetica", Font.BOLD, 13));
	    lblquitesvous.setBounds(33, 371, 116, 16);
	    pan.add(lblquitesvous);
	    
	    JComboBox comboBox_1 = new JComboBox();
	    comboBox_1.setToolTipText("");
	    comboBox_1.setBounds(148, 366, 184, 27);
	    pan.add(comboBox_1);
	    
	    JLabel lblNewLabel_2 = new JLabel(new ImageIcon("src/com/itparis/b2/gestionref/graphix/Formule.jpg"));
	    lblNewLabel_2.setBounds(33, 404, 573, 63);
	    pan.add(lblNewLabel_2);
	    
	    JCheckBox chckbxNewCheckBox = new JCheckBox(" J'ai lu et j'accepte les conditions g\u00E9n\u00E9rales de participation ");
	    chckbxNewCheckBox.setForeground(Color.BLACK);
	    chckbxNewCheckBox.setBounds(21, 479, 409, 23);
	    pan.add(chckbxNewCheckBox);
	    
	    JLabel label = new JLabel("*");
	    label.setForeground(Color.RED);
	    label.setBounds(422, 483, 12, 16);
	    pan.add(label);
	    
	    JLabel lblNewLabel_3 = new JLabel("<html><u>Cliquez ici pour afficher les conditions g\u00E9n\u00E9rales de participation</u></html>");
	    lblNewLabel_3.setBackground(SystemColor.text);
	    lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
	    lblNewLabel_3.setForeground(SystemColor.activeCaption);
	    lblNewLabel_3.setBounds(27, 513, 418, 16);
	    pan.add(lblNewLabel_3);
		
	    JButton btnNewButton = new JButton(new ImageIcon("src/com/itparis/b2/gestionref/graphix/Suivant.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(421, 556, 181, 52);
		pan.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton(new ImageIcon("src/com/itparis/b2/gestionref/graphix/Precedent.jpg"));
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton2.setBounds(28, 556, 181, 52);
		pan.add(btnNewButton2);
		getContentPane().add(span);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
