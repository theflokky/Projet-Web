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
    public static JLabel texte_connexion, texte_pseudo, texte_mdp;


    public static void afficheConnexion(JPanel cartes){
        ConnexionControl controleur = new ConnexionControl(cartes);

        //Affichage du pseudo et son champ de remplissage
        texte_pseudo = new JLabel();
        Font font1 = new Font("Arial",Font.PLAIN,20);
        texte_pseudo.setFont(font1);
        texte_pseudo.setBounds(440, 250, 200, 50);
        texte_pseudo.setText("Pseudo :");
        texte_pseudo.setForeground(Color.RED);
        Font font2 = new Font("Arial",Font.PLAIN,15);
        champ_pseudo = new JTextField();
        champ_pseudo.setBounds(640, 250, 200, 50);
        champ_pseudo.setFont(font2);

        //Affichage du mot de passe et son champ de remplissage
        texte_mdp = new JLabel();
        texte_mdp.setFont(font1);
        texte_mdp.setBounds(440, 310, 200, 50);
        texte_mdp.setText("Mot de Passe :");
        texte_mdp.setForeground(Color.RED);
        champ_mdp = new JPasswordField();
        champ_mdp.setBounds(640, 310, 200, 50);
        champ_mdp.setFont(font2);
        
        btn_valide = new JButton("Valider");
        btn_valide.setBounds(540, 420, 200, 50);
        btn_valide.addActionListener(controleur);

        btn_retour = new JButton("Retour");
        btn_retour.setBounds(540, 570, 200, 50);
        btn_retour.addActionListener(controleur);


        texte_connexion = new JLabel();
        Font font = new Font("Arial",Font.PLAIN,40);
        texte_connexion.setFont(font);
        texte_connexion.setBounds(500, 100, 400, 50);
        texte_connexion.setText("CONNEXION");
        texte_connexion.setForeground(Color.RED);


        cartes.add(champ_pseudo);
        cartes.add(champ_mdp);
        cartes.add(btn_valide);
        cartes.add(texte_connexion);
        cartes.add(btn_retour);
        cartes.add(texte_mdp);
        cartes.add(texte_pseudo);

        cartes.repaint();
    }
}
