package client_lourd;

//Bibliothèques
import javax.swing.*;

import client_lourd.Vues.Accueil;

import java.awt.*;
import java.util.*;

//Fenetre
public class Fenetre extends JFrame{	
	public static Integer LARGEUR_FENETRE = 1280;
	public static Integer HAUTEUR_FENETRE = 720;
	public static JPanel p = new Accueil();

    //Constructeur de la Fenetre
	public Fenetre() {
		this.setSize(LARGEUR_FENETRE, HAUTEUR_FENETRE);
		this.setTitle("Emploi du Temps");

		this.setBackground(Color.BLACK);
		this.setContentPane(p);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

		this.setVisible(true);
	}
}
