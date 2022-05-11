package client_lourd.Controleurs;

import client_lourd.Vues.Fenetre;
import client_lourd.Vues.PopUpAjout;
import client_lourd.Vues.PlanningUser;

import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PopUpAjoutControl implements ActionListener{
    public static String nom_ajoute, salle_ajoute;
    private Integer creneau_x = -1, creneau_y = -1;

    public PopUpAjoutControl(Integer x, Integer y){
        this.creneau_x = x;
        this.creneau_y = y;
    }


    public void actionPerformed(ActionEvent e){
        //Action quand on valide le formulaire d'ajout
        if(e.getSource() == PopUpAjout.btn_valide2){
            nom_ajoute = PopUpAjout.champ_nom.getText();
            salle_ajoute = PopUpAjout.champ_lieu.getText();

            //Si vide on reste sur la fenetre
            if(nom_ajoute.isEmpty() || salle_ajoute.isEmpty()){
            }
            else{
                PlanningUser.planning[this.creneau_x][this.creneau_y].setBackground(Color.RED);
                PlanningUser.planning[this.creneau_x][this.creneau_y].setText("<HTML><BODY><CENTER>"+ PopUpAjoutControl.nom_ajoute + "<BR>" + PopUpAjoutControl.salle_ajoute + "</CENTER></BODY></HTML>");
                Fenetre.frame.repaint();
                PopUpAjout.popup.dispose();
            }
        }
        if(e.getSource() == PopUpAjout.btn_supprime){
            PlanningUser.planning[this.creneau_x][this.creneau_y].setBackground(Color.DARK_GRAY);
            PlanningUser.planning[this.creneau_x][this.creneau_y].setText("");
            Fenetre.frame.repaint();
            PopUpAjout.popup.dispose();
        
        }
    }
}
