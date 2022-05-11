package client_lourd.Controleurs;

import client_lourd.Vues.Connexion;
import client_lourd.Vues.Fenetre;

import  java.awt.event.*;
import  javax.swing.*;

public class ConnexionControl implements ActionListener{
    private JPanel vue;
    public static String pseudo;
    public static String mdp;
    private boolean utilisateur_existe = false;
    public boolean admin = true;


    //Constructeur
    public ConnexionControl(JPanel vue){
        this.vue = vue;
    }

    //Implementation de action performed
    public void actionPerformed(ActionEvent e){
        //Si clique sur Valider
        if(e.getSource() == Connexion.btn_valide){
            System.out.println("VALIDER");
            //Verification dans la BDD A FAIRE
            pseudo = Connexion.champ_pseudo.getText();
            client_lourd.Vues.PlanningUser.pseudo = pseudo;
            mdp = String.valueOf(Connexion.champ_mdp.getPassword());
            System.out.println("Pseudo : " + pseudo);
            System.out.println("Mot de Passe : " + mdp);

            //VERIFIER BDD
            utilisateur_existe = true;

            if(utilisateur_existe){
                if(admin){
                Fenetre.num_page = 5;
                Fenetre.cartes.removeAll();
                Fenetre.frame.add(Fenetre.createMainPanel());
                Fenetre.frame.repaint();

                }
            else{
                Fenetre.num_page = 4;
                Fenetre.cartes.removeAll();
                Fenetre.frame.add(Fenetre.createMainPanel());
                Fenetre.frame.repaint();
            }
            }
        }

        //Si clique sur Retour
        if(e.getSource() == Connexion.btn_retour){
            System.out.println("RETOUR CONNEXION");
            Fenetre.num_page = 1;
            Fenetre.cartes.removeAll();
            Fenetre.frame.add(Fenetre.createMainPanel());
            Fenetre.frame.repaint();
        }
    }
}
