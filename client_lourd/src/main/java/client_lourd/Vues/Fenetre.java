package client_lourd.Vues;

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
		Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
		//LARGEUR_FENETRE = tailleMoniteur.width * 2/3;
		//HAUTEUR_FENETRE = tailleMoniteur.height * 2/3;

    	frame = new JFrame("Fenetre");
		frame.setSize(LARGEUR_FENETRE, HAUTEUR_FENETRE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("NIQUE SA MERE GROSSE OTRZAJFAZEzaeuih");
        frame.add(createMainPanel());
		System.out.println("NIQUE SA MERE GROSSE OTRZAJFAZEzaeuih");
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

		if(num_page == 4){
			PlanningUser.affichePlanningUser(cartes);
		}

		if(num_page == 5){
			PlanningAdmin.affichePlanningAdmin(cartes);
		}

        return cartes;
    }

}
