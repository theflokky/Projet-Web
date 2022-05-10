package client_lourd.Controleurs;

import client_lourd.Fenetre;
import client_lourd.Vues.Accueil;

import  java.awt.event.*;
import  javax.swing.*;

public class AccueilControl implements ActionListener{
    //Variables
    private static Accueil view;

    //Constructeur
    public AccueilControl(client_lourd.Vues.Accueil vue){
        this.view = vue;
    }

    //Implementation de Action Perfomed
    public void actionPerformed(ActionEvent e){
        //Si l'utilisateur clique sur Connexion
        if(e.getSource() == view.btn_connexion){
            System.out.println("Connexion");
            client_lourd.Fenetre.carte.next(client_lourd.Fenetre.cartes);
        }
        else{
        
        //Si l'utilisateur clique sur Inscription
        if(e.getSource() == view.btn_inscription){
            System.out.println("Inscription");   
        }
        }
        

    }
}
