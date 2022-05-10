package client_lourd.Controleurs;

import client_lourd.Vues.Accueil;
import client_lourd.Vues.Connexion;

import  java.awt.event.*;
import  javax.swing.*;

public class AccueilControl implements ActionListener{
    //Variables
    private Accueil vue;
    //Constructeur
    public AccueilControl(client_lourd.Vues.Accueil vue){
        this.vue = vue;
    }

    //Implementation de Action Perfomed
    public void actionPerformed(ActionEvent e){
        String  s=((JButton) e.getSource()).getText();

        //Si l'utilisateur clique sur Connexion
        if(s.equals("Connexion")){
            System.out.println("Connexion");
            client_lourd.Main.f.getContentPane().removeAll();
            client_lourd.Main.f.getContentPane().add(new Connexion());
        }
        
        //Si l'utilisateur clique sur Inscription
        if(s.equals("Inscription")){
            System.out.println("Inscription");
            this.vue.setVisible(false);        
        }

    }
}
