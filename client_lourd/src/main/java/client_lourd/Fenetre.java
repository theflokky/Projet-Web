package client_lourd;

//Bibliothèques
import javax.swing.*;

import client_lourd.Vues.*;

import java.awt.*;
import java.util.*;

//Fenetre
public class Fenetre extends JFrame{	
	public static Integer LARGEUR_FENETRE = 1280;
	public static Integer HAUTEUR_FENETRE = 720;
	public static JPanel accueil;
	public static JPanel connexion;
	public static CardLayout carte;
	public static JPanel cartes;

    //Constructeur de la Fenetre
	public Fenetre() {

		accueil = new Accueil();
		connexion = new Connexion();

		this.setSize(LARGEUR_FENETRE, HAUTEUR_FENETRE);
		this.setTitle("Emploi du Temps");

		carte = new CardLayout();
		cartes = new JPanel(carte);

		cartes.add(accueil);
		cartes.add(connexion);
		

		add(cartes);

		this.setBackground(Color.BLACK);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
		this.setVisible(true);
	}
}
