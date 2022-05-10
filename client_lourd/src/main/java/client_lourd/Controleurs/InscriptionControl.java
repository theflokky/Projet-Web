package client_lourd.Controleurs;

import client_lourd.Vues.Inscription;
import client_lourd.Fenetre;

import  java.awt.event.*;
import  javax.swing.*;

public class InscriptionControl implements ActionListener{
    private JPanel vue;

    //Constructeur
    public InscriptionControl(JPanel vue){
        this.vue = vue;
    }

    //Implementation de action performed
    public void actionPerformed(ActionEvent e){
        //Si clique sur Valider
        if(e.getSource() == Inscription.btn_valide){
            System.out.println("VALIDER");
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