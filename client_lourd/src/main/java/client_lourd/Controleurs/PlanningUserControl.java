package client_lourd.Controleurs;

import client_lourd.Vues.PlanningUser;
import client_lourd.Vues.Fenetre;

import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PlanningUserControl implements ActionListener{
    public void actionPerformed(ActionEvent e){
        //Si clique sur Retour
        if(e.getSource() == PlanningUser.btn_deco){
            System.out.println("DECONNEXION");
            Fenetre.num_page = 1;
            Fenetre.cartes.removeAll();
            Fenetre.frame.add(Fenetre.createMainPanel());
            Fenetre.frame.repaint();
        }

        for(int i=0; i<7; i++){
            for(int j=0; j<24; j++){
                JButton tmp = PlanningUser.planning[i][j];
                if(e.getSource() == tmp){
                    tmp.setBackground(Color.BLUE);
                    if(tmp.getText().equals("")){
                        PlanningUser.popupAjout();
                    }
                }
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
