package client_lourd.Vues;

import client_lourd.Controleurs.ConnexionControl;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Connexion{
    //Variable
    private ConnexionControl controleur;
    public static JTextField champ_pseudo;
    public static JPasswordField champ_mdp;
    public static JButton btn_valide, btn_retour;
    public static JLabel texte_connexion;


    public static void afficheConnexion(JPanel cartes){
        ConnexionControl controleur = new ConnexionControl(cartes);

        //Affichage du pseudo et son champ de remplissage
        champ_pseudo = new JTextField();
        champ_pseudo.setBounds(540, 300, 200, 50);

        //Affichage du pseudo et son champ de remplissage
        champ_mdp = new JPasswordField();
        champ_mdp.setBounds(540, 360, 200, 50);
        
        btn_valide = new JButton("Valider");
        btn_valide.setBounds(540, 420, 200, 50);
        btn_valide.addActionListener(controleur);

        btn_retour = new JButton("Retour");
        btn_retour.setBounds(540, 570, 200, 50);
        btn_retour.addActionListener(controleur);


        texte_connexion = new JLabel();
        Font font = new Font("Arial",Font.BOLD,40);
        texte_connexion.setFont(font);
        texte_connexion.setBounds(500, 100, 400, 50);
        texte_connexion.setText("CONNEXION");
        texte_connexion.setForeground(Color.RED);


        cartes.add(champ_pseudo);
        cartes.add(champ_mdp);
        cartes.add(btn_valide);
        cartes.add(texte_connexion);
        cartes.add(btn_retour);

        cartes.repaint();
    }
}
