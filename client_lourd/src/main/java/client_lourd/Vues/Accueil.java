package client_lourd.Vues;

import client_lourd.Controleurs.AccueilControl;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.Font;
import java.util.*;

public class Accueil{
    public static JButton btn_connexion, btn_inscription;
    public static JLabel texte_accueil;

    public static void afficheAccueil(JPanel cartes){
        AccueilControl controleur = new AccueilControl(cartes);

        btn_inscription = new JButton("Inscription");
        btn_inscription.setBounds(540, 400, 200, 50);
        btn_inscription.addActionListener(controleur);

        btn_connexion = new JButton("Connexion");
        btn_connexion.setBounds(540, 300, 200, 50);
        btn_connexion.addActionListener(controleur);

        texte_accueil = new JLabel();
        Font font = new Font("Arial",Font.BOLD,40);
        texte_accueil.setFont(font);
        texte_accueil.setBounds(440, 100, 600, 50);
        texte_accueil.setText("EMPLOI DU TEMPS");
        texte_accueil.setForeground(Color.RED);

        cartes.add(btn_connexion);
        cartes.add(btn_inscription);
        cartes.add(texte_accueil);
    }
}