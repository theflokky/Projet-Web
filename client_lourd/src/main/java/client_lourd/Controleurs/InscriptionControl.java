package client_lourd.Controleurs;

import client_lourd.Vues.Fenetre;
import client_lourd.Vues.Inscription;
import client_lourd.Modeles.EcrireData;

import  java.awt.event.*;
import  javax.swing.*;
import java.sql.*;

public class InscriptionControl implements ActionListener{
    private JPanel vue;
    public static String pseudo, mail;
    public static String mdp;

    //Constructeur
    public InscriptionControl(JPanel vue){
        this.vue = vue;
    }

    //Implementation de action performed
    public void actionPerformed(ActionEvent e){
        //Si clique sur Valider
        if(e.getSource() == Inscription.btn_valide){
            System.out.println("VALIDER");
            //RENTRER DANS LA BDD A FAIRE
            pseudo = Inscription.champ_pseudo.getText();
            mdp = String.valueOf(Inscription.champ_mdp.getPassword());
            mail = Inscription.champ_mail.getText();
            if(pseudo.isEmpty() || mdp.isEmpty()){}
            else{
                System.out.println("Pseudo : " + pseudo);
                System.out.println("Email : " + mail);
                System.out.println("Mot de Passe : " + mdp);
                try {
                    EcrireData.insererUtilisateurs(pseudo, mail, mdp);
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }


                Fenetre.num_page = 1;
                Fenetre.cartes.removeAll();
                Fenetre.frame.add(Fenetre.createMainPanel());
                Fenetre.frame.repaint();
            }

        }

        //Si clique sur Retour
        if(e.getSource() == Inscription.btn_retour){
            System.out.println("RETOUR CONNEXION");
            Fenetre.num_page = 1;
            Fenetre.cartes.removeAll();
            Fenetre.frame.add(Fenetre.createMainPanel());
            Fenetre.frame.repaint();
        }
    }
}