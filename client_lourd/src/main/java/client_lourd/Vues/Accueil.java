package client_lourd.Vues;

import client_lourd.Controleurs.AccueilControl;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Accueil extends JPanel{
    //Declaration des controleurs et modeles
    private static boolean visible = true;
    public static JButton btn_connexion, btn_inscription;
    public static JLabel titre_accueil;
    

    //Constructeur
    public Accueil(){

        this.setLayout(null);

        AccueilControl controleur = new AccueilControl(this);
        
        btn_inscription = new JButton("Inscription");
        btn_inscription.setBounds(540, 400, 200, 50);
        btn_inscription.addActionListener(controleur);

        btn_connexion = new JButton("Connexion");
        btn_connexion.setBounds(540, 300, 200, 50);
        btn_connexion.addActionListener(controleur);




        
        
        this.add(btn_inscription);
        this.add(btn_connexion);
        
        this.setVisible(visible);

    }
    
    //Fonction du panneau
    public void paint(Graphics g){
        //On dessine le logo en haut de l'accueil
        //g.setColor(Color.GRAY);
        //g.fillRect(340, 100, 600, 100);


    }
}