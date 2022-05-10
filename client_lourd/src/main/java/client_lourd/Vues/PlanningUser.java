package client_lourd.Vues;

import client_lourd.Controleurs.PlanningUserControl;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class PlanningUser{
    //VARIABLES
    private PlanningUserControl controleur;
    public static JButton btn_deco, btn_ajout;
    public static String pseudo;
    public static JButton[][] planning = new JButton[7][24];
    public static JTextField champ_jour, champ_lieu;
    

    public static JPanel createPanelPopup(){
        JPanel popup_panel = new JPanel();

        popup_panel.setLayout(null);
        popup_panel.setBackground(Color.BLACK);
            
        //Affichage du nom
        JLabel texte_jour = new JLabel();
        Font font1 = new Font("Arial",Font.PLAIN,15);
        texte_jour.setFont(font1);
        texte_jour.setBounds(20, 20, 100, 20);
        texte_jour.setText("Nom :");
        texte_jour.setForeground(Color.RED);
        Font font2 = new Font("Arial",Font.PLAIN,15);
        champ_jour = new JTextField();
        champ_jour.setBounds(150, 20, 125, 20);
        champ_jour.setFont(font2);

        //Ajout du Lieu
        JLabel texte_lieu = new JLabel();
        texte_lieu.setFont(font1);
        texte_lieu.setBounds(20, 50, 100, 20);
        texte_lieu.setText("Salle :");
        texte_lieu.setForeground(Color.RED);
        champ_lieu = new JTextField();
        champ_lieu.setBounds(150, 50, 125, 20);
        champ_lieu.setFont(font2);

        popup_panel.add(texte_jour);
        popup_panel.add(champ_jour);
        popup_panel.add(texte_lieu);
        popup_panel.add(champ_lieu);

        return popup_panel;
    }

    public static void popupAjout(){
        JFrame popup = new JFrame("Nouvel Evenement");
        popup.setSize(300, 400);
        popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        popup.add(createPanelPopup());

        popup.setResizable(false);
        popup.setVisible(true);
    }

    //Fonction d'affichage de la page
    public static void affichePlanningUser(JPanel cartes){
        PlanningUserControl controleur = new PlanningUserControl();

        Font font1 = new Font("Arial",Font.PLAIN,13);

        JLabel texte_pseudo = new JLabel();
        texte_pseudo.setBounds(1165, 560, 100, 20);
        texte_pseudo.setText("Connecté : ");
        texte_pseudo.setFont(font1);
        texte_pseudo.setForeground(Color.RED);

        JLabel texte_pseudo1 = new JLabel();
        texte_pseudo1.setBounds(1165, 580, 100, 20);
        texte_pseudo1.setText(pseudo);
        texte_pseudo1.setFont(font1);
        texte_pseudo1.setForeground(Color.RED);



        btn_deco = new JButton("Deconnexion");
        btn_deco.setBounds(1165, 620, 100, 50);
        btn_deco.addActionListener(controleur);
        Font font = new Font("Arial",Font.PLAIN,10);
        btn_deco.setFont(font);
        Insets i =  new Insets(0, 0, 0, 0);
        btn_deco.setMargin(i);

        //Dessin du Planning
        dessinePlanning(cartes);

        cartes.add(btn_deco);
        cartes.add(texte_pseudo);
        cartes.add(texte_pseudo1);
        
        cartes.repaint();
    }

    private static void dessinePlanning(JPanel cartes){
        PlanningUserControl controleur = new PlanningUserControl();
        Integer i, j;
        Integer x = 95;
        Integer y = 30;
        Integer h1 = 0;
        Integer h2 = 1;

        for(i= 0; i < 7; i++){
            for(j=0; j<24; j++){
                JButton cellule = new JButton();
                planning[i][j]=cellule;
                cellule.setBounds(x, y, 150, 26);
                cellule.setBackground(Color.DARK_GRAY);
                cellule.setForeground(Color.LIGHT_GRAY);
                cellule.addActionListener(controleur);
                cartes.add(cellule);
                

                y=y+27;
            }
            y=30;
            x=x+151;
        }

        y=30;

        for(j=0; j<24; j++){
            JLabel plage_horaire = new JLabel();
            plage_horaire.setBounds(10, y, 100, 26);
            plage_horaire.setText(h1 +"h - "+ h2 + "h");
            plage_horaire.setForeground(Color.RED);
            cartes.add(plage_horaire);

            h1+=1;
            h2+=1;

            y=y+27;
        }

        x=135;

        for(i=1; i<8; i++){
            JLabel jour = new JLabel();
            jour.setBounds(x, 5, 100, 24);
            jour.setText(PlanningUserControl.numToJour(i));
            jour.setForeground(Color.RED);
            cartes.add(jour);

            x+=151;
        }
    }
    
}
