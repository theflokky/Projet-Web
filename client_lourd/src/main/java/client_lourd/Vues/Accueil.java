package client_lourd.Vues;

import client_lourd.Controleurs.AccueilControl;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Accueil extends JPanel{
    //Declaration des controleurs et modeles
    private AccueilControl controleur;
    private static boolean visible = true;
    

    //Constructeur
    public Accueil(){
        //On instancie le controleur
        controleur = new AccueilControl(this);

        //Ajout du bouton de Connexion
        JButton btn_connexion = new JButton("Connexion");
        btn_connexion.setBounds(540, 300 ,200, 50);
        btn_connexion.addActionListener(controleur);

        //Ajout du bouton de Inscription
        JButton btn_inscription = new JButton("Inscription");
        btn_inscription.setBounds(540, 400 ,200, 50);
        btn_inscription.addActionListener(controleur);

        setLayout(null);
        this.add(btn_connexion);
        this.add(btn_inscription);
        setVisible(visible);

    }
    
    //Fonction du panneau
    public void paint(Graphics g){
        //On dessine le logo en haut de l'accueil
        g.setColor(Color.GRAY);
        g.fillRect(340, 100, 600, 100);
    }
}