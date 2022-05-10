package client_lourd.Vues;

import client_lourd.Controleurs.InscriptionControl;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Inscription {
        //Variable
        private InscriptionControl controleur;
        public static JTextField champ_pseudo;
        public static JPasswordField champ_mdp;
        public static JTextField champ_mail;
        public static JButton btn_valide, btn_retour;
        public static JLabel texte_connexion, texte_mdp, texte_pseudo, texte_mail;
    
    
        public static void afficheInscription(JPanel cartes){
            InscriptionControl controleur = new InscriptionControl(cartes);
    
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

            //Affichage du Mot de passe et son champ de remplissage
            texte_mdp = new JLabel();
            texte_mdp.setFont(font1);
            texte_mdp.setBounds(440, 370, 200, 50);
            texte_mdp.setText("Mot de Passe :");
            texte_mdp.setForeground(Color.RED);
            champ_mdp = new JPasswordField();
            champ_mdp.setBounds(640, 370, 200, 50);
            champ_pseudo.setFont(font2);

            //Affichage du mail et son champ de remplissage
            texte_mail = new JLabel();
            texte_mail.setFont(font1);
            texte_mail.setBounds(440, 310, 200, 50);
            texte_mail.setText("Adresse Mail :");
            texte_mail.setForeground(Color.RED);
            champ_mail = new JTextField();
            champ_mail.setBounds(640, 310, 200, 50);
            champ_mail.setFont(font2);
            

            btn_valide = new JButton("Valider");
            btn_valide.setBounds(540, 480, 200, 50);
            btn_valide.addActionListener(controleur);

            btn_retour = new JButton("Retour");
            btn_retour.setBounds(540, 570, 200, 50);
            btn_retour.addActionListener(controleur);
    
    
            texte_connexion = new JLabel();
            Font font = new Font("Arial",Font.PLAIN,40);
            texte_connexion.setFont(font);
            texte_connexion.setBounds(500, 100, 400, 50);
            texte_connexion.setText("INSCRIPTION");
            texte_connexion.setForeground(Color.RED);
    
    
            cartes.add(champ_pseudo);
            cartes.add(champ_mdp);
            cartes.add(btn_valide);
            cartes.add(texte_connexion);
            cartes.add(btn_retour);
            cartes.add(texte_mdp);
            cartes.add(texte_pseudo);
            cartes.add(texte_mail);
            cartes.add(champ_mail);
    
            cartes.repaint();
        }
}
