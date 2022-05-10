package client_lourd;

import javax.swing.*;
import java.awt.*;

import client_lourd.Vues.*;

public class Fenetre {
	public static Integer LARGEUR_FENETRE = 1280;
	public static Integer HAUTEUR_FENETRE = 720;
	public static JPanel cartes = new JPanel();
	public static JFrame frame;

	public static Integer num_page = 1;


    public Fenetre(){
    	frame = new JFrame("Fenetre");
		frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(createMainPanel());

        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static JPanel createMainPanel() {
		
        cartes.setLayout(null);
		cartes.setBackground(Color.BLACK);

		//Ecran d'accueil
        if(num_page == 1){
			Accueil.afficheAccueil(cartes);
		}

		//Ecran de Connexion
		if(num_page == 2){
			Connexion.afficheConnexion(cartes);
		}

		if(num_page == 3){
			Inscription.afficheInscription(cartes);
		}

        return cartes;
    }

}
