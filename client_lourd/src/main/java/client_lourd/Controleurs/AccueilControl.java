package client_lourd.Controleurs;

import client_lourd.Main;
import client_lourd.Vues.Accueil;
import client_lourd.Vues.Fenetre;

import  java.awt.event.*;
import  javax.swing.*;

public class AccueilControl implements ActionListener{
    //Variables
    private static JPanel view;

    //Constructeur
    public AccueilControl(JPanel vue){
        this.view = vue;
    }

    //Implementation de Action Perfomed
    public void actionPerformed(ActionEvent e){
        //Si l'utilisateur clique sur Connexion
        if(e.getSource() == Accueil.btn_connexion){
            System.out.println("Connexion");
            Fenetre.num_page = 2;
            Fenetre.cartes.removeAll();
            Fenetre.frame.add(Fenetre.createMainPanel());
            Fenetre.frame.repaint();
        }
        else{
        
        //Si l'utilisateur clique sur Inscription
        if(e.getSource() == Accueil.btn_inscription){
            System.out.println("Inscription");   
            Fenetre.num_page = 3;
            Fenetre.cartes.removeAll();
            Fenetre.frame.add(Fenetre.createMainPanel());
            Fenetre.frame.repaint();
        }
        }
        

    }
}
