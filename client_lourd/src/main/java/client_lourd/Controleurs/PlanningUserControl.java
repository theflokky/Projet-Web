package client_lourd.Controleurs;

import client_lourd.Vues.PlanningUser;
import client_lourd.Vues.Fenetre;
import client_lourd.Vues.PopUpAjout;
import client_lourd.Modeles.RecupData;

import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.sql.SQLException;

public class PlanningUserControl implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Integer x=-1, y=-1;

        //Si clique sur Retour
        if(e.getSource() == PlanningUser.btn_deco){
            System.out.println("DECONNEXION");
 
            Fenetre.num_page = 1;
            Fenetre.cartes.removeAll();
            Fenetre.frame.add(Fenetre.createMainPanel());
            Fenetre.frame.repaint();
        }

        for(int i=0; i<7; i++){
            for(int j=0; j<10; j++){
                if(e.getSource() == PlanningUser.planning[i][j]){
                    System.out.println("PopUP");
                        new PopUpAjout(i, j, false);
                }

            }
        }
    }

    public static Integer rechercheIdCours(Integer jour, Integer x , Integer y){
        Integer i;
        for(i=0; i < 1000; i++){
            //On verifie que c'est le bon jour
            if(RecupData.table_horaire[2][i] == jour && RecupData.table_horaire[0][i] == x + 8){

                    System.out.println(i);
                    return i;
            }
        }
        //System.out.println(RecupData.table_horaire[2][i]);
        return -1;
    }

    public static void initPlanning(){

        for(int i= 0; i < 7; i++){
            for(int j=0; j<10; j++){
                JButton cellule = null;
                PlanningUser.planning[i][j]=cellule;
            }
        }
        for(int i=0; i<1000; i++){
            if(RecupData.table_horaire[0][i] != -1){
                PlanningUser.planning[RecupData.table_horaire[2][i]][(RecupData.table_horaire[0][i]) -8] = new JButton();
                PlanningUser.planning[RecupData.table_horaire[2][i]][(RecupData.table_horaire[0][i]) -8].setText("Giroud");
                
            }
        }
    }

    public static String numToJour(Integer jour){
        switch(jour){
            case 1 :
                return "Lundi";
            case 2 :
                return "Mardi";
            case 3 :
                return "Mercredi";
            case 4 :
                return "Jeudi";
            case 5 :
                return "Vendredi";
            case 6 :
                return "Samedi";
            case 7 :
                return "Dimanche";
        }
        return "ERREUR";
    }
}
