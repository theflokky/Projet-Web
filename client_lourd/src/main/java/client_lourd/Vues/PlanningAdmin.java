package client_lourd.Vues;

import client_lourd.Controleurs.PlanningAdminControl;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class PlanningAdmin{
    //VARIABLES
    public static JButton btn_deco;
    public static String pseudo;
    public static boolean supprimer = false;

    //Fonction d'affichage de la page
    public static void affichePlanningAdmin(JPanel cartes){
        PlanningAdminControl controleur = new PlanningAdminControl();

        Font font1 = new Font("Arial",Font.PLAIN,13);
        Font font = new Font("Arial",Font.PLAIN,10);
        Insets i =  new Insets(0, 0, 0, 0);

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
        btn_deco.setFont(font);
        btn_deco.setMargin(i);

        //Dessin du Planning
        dessinePlanning(cartes);

        cartes.add(btn_deco);


        cartes.add(texte_pseudo);
        cartes.add(texte_pseudo1);

        
        cartes.repaint();
    }

    private static void dessinePlanning(JPanel cartes){
        PlanningAdminControl controleur = new PlanningAdminControl();
        Integer i, j;
        Integer x = 95;
        Integer y = 30;
        Integer h1 = 8;
        Integer h2 = 9;

        for(i= 0; i < 7; i++){
            for(j=0; j<10; j++){
                JButton cellule = new JButton();
                PlanningUser.planning[i][j]=cellule;
                cellule.setBounds(x, y, 150, 50);
                cellule.setBackground(Color.DARK_GRAY);
                cellule.setForeground(Color.LIGHT_GRAY);
                cellule.addActionListener(controleur);
                cartes.add(cellule);
                

                y=y+51;
            }
            y=30;
            x=x+151;
        }

        y=30;

        for(j=0; j<10; j++){
            JLabel plage_horaire = new JLabel();
            plage_horaire.setBounds(10, y, 100, 50);
            plage_horaire.setText(h1 +"h - "+ h2 + "h");
            plage_horaire.setForeground(Color.RED);
            cartes.add(plage_horaire);

            h1+=1;
            h2+=1;

            y=y+51;
        }

        x=135;

        for(i=1; i<8; i++){
            JLabel jour = new JLabel();
            jour.setBounds(x, 5, 100, 24);
            jour.setText(PlanningAdminControl.numToJour(i));
            jour.setForeground(Color.RED);
            cartes.add(jour);

            x+=151;
        }
    }
    
}

