package com.itparis.b2.gestionref.graphix;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class Page2 extends JFrame{
	private JPanel pan;
	private JScrollPane span;
	private JTextField txtAutre;
	private JTextField txtEffectif;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public Page2() {
		this.setBounds(0,0,657,728);
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
		
		JLabel lblNewLabel = new JLabel("<html>Activité<FONT color = \"red\">*</FONT> :</html>");
		lblNewLabel.setBounds(33, 71, 68, 16);
		pan.add(lblNewLabel);
		
		JLabel lblAutrePrcisez = new JLabel("Autre, précisez :");
		lblAutrePrcisez.setBounds(33, 104, 105, 16);
		pan.add(lblAutrePrcisez);
		
		txtAutre = new JTextField();
		txtAutre.setText("Autre");
		txtAutre.setForeground(Color.GRAY);
		txtAutre.setColumns(10);
		txtAutre.setBounds(148, 98, 134, 28);
		pan.add(txtAutre);
		
		JLabel lbleffectif = new JLabel("<html>Effectif<FONT color = \"red\">*</FONT> :</html>");
		lbleffectif.setBounds(33, 138, 68, 16);
		pan.add(lbleffectif);
		
		txtEffectif = new JTextField();
		txtEffectif.setForeground(Color.GRAY);
		txtEffectif.setText("Effectif");
		txtEffectif.setBounds(148, 132, 134, 28);
		pan.add(txtEffectif);
		txtEffectif.setColumns(10);
		
		JLabel lblarticle = new JLabel("<html><u>Article</u></html>");
		lblarticle.setFont(new Font("Helvetica", Font.BOLD, 13));
		lblarticle.setBounds(33, 175, 50, 16);
		pan.add(lblarticle);
		
		JLabel lbltitre = new JLabel("<html>Titre<FONT color = \"red\">*</FONT> :</html>");
		lbltitre.setBounds(33, 209, 68, 16);
		pan.add(lbltitre);
		
		JLabel lblmotCl = new JLabel("<html>Mot Clé<FONT color = \"red\">*</FONT> :</html>");
		lblmotCl.setBounds(33, 242, 68, 16);
		pan.add(lblmotCl);
		
		JLabel lblrsum = new JLabel("<html>Résumé<FONT color = \"red\">*</FONT> :</html>");
		lblrsum.setBounds(33, 274, 68, 16);
		pan.add(lblrsum);
		
		JLabel lblauteur = new JLabel("<html>Auteur<FONT color = \"red\">*</FONT> :</html>");
		lblauteur.setBounds(33, 306, 68, 16);
		pan.add(lblauteur);
		
		JLabel lblJoindreUnFichier = new JLabel("Joindre un fichier :");
		lblJoindreUnFichier.setBounds(33, 338, 116, 16);
		pan.add(lblJoindreUnFichier);
		
		textField = new JTextField();
		textField.setText("Activité");
		textField.setForeground(Color.GRAY);
		textField.setColumns(10);
		textField.setBounds(148, 203, 134, 28);
		pan.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Activité");
		textField_1.setForeground(Color.GRAY);
		textField_1.setColumns(10);
		textField_1.setBounds(148, 236, 134, 28);
		pan.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Activité");
		textField_2.setForeground(Color.GRAY);
		textField_2.setColumns(10);
		textField_2.setBounds(148, 268, 134, 28);
		pan.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Activité");
		textField_3.setForeground(Color.GRAY);
		textField_3.setColumns(10);
		textField_3.setBounds(148, 300, 134, 28);
		pan.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("Activité");
		textField_4.setForeground(Color.GRAY);
		textField_4.setColumns(10);
		textField_4.setBounds(148, 332, 134, 28);
		pan.add(textField_4);
		
		
		
		getContentPane().add(span);
	}
}
