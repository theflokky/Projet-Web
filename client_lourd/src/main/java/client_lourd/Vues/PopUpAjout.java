package client_lourd.Vues;

import client_lourd.Controleurs.PopUpAjoutControl;


import java.awt.*;
import java.util.*;
import javax.swing.*;

public class PopUpAjout {
    private Integer creneau_x = -1, creneau_y = -1;
    public static JTextField champ_nom, champ_lieu;
    public static JButton btn_valide2;
    //public static JPanel popup_panel = new JPanel();
    public static JFrame popup;

    public PopUpAjout(int i, int j){
        this.creneau_x = i;
        this.creneau_y = j;
        popup = new JFrame("Nouvel Evenement");
        popup.setSize(300, 400);
        popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        popup.add(createPopupPanel(this.creneau_x, this.creneau_y));
    
        popup.setResizable(false);
        popup.setVisible(true);
    }

    public static JPanel createPopupPanel(Integer x, Integer y){
        JPanel popup_panel = new JPanel();

        popup_panel.setLayout(null);
        popup_panel.setBackground(Color.BLACK);
            
        affichePopUp(popup_panel, x, y);

        return popup_panel;
    }


    public static void affichePopUp(JPanel popup_panel, Integer x, Integer y){
        PopUpAjoutControl controleur = new PopUpAjoutControl(x, y);

        //Ajout du Bouton de validation du formulaire
        btn_valide2 = new JButton("Valider");
        btn_valide2.setBounds(50, 300, 200, 25);
        btn_valide2.addActionListener(controleur);
            
        //Affichage du nom
        JLabel texte_jour = new JLabel();
        Font font1 = new Font("Arial",Font.PLAIN,15);
        texte_jour.setFont(font1);
        texte_jour.setBounds(20, 20, 100, 20);
        texte_jour.setText("Nom :");
        texte_jour.setForeground(Color.RED);
        Font font2 = new Font("Arial",Font.PLAIN,15);
        champ_nom = new JTextField();
        champ_nom.setBounds(150, 20, 125, 20);
        champ_nom.setFont(font2);

        //Ajout du Lieu
        JLabel texte_lieu = new JLabel();
        texte_lieu.setFont(font1);
        texte_lieu.setBounds(20, 50, 100, 20);
        texte_lieu.setText("Salle :");
        texte_lieu.setForeground(Color.RED);
        champ_lieu = new JTextField();
        champ_lieu.setBounds(150, 50, 125, 20);
        champ_lieu.setFont(font2);

        popup_panel.add(btn_valide2);
        popup_panel.add(texte_jour);
        popup_panel.add(champ_nom);
        popup_panel.add(texte_lieu);
        popup_panel.add(champ_lieu);

        popup_panel.repaint();
    }
}
