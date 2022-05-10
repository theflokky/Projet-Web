package client_lourd.Vues;

import client_lourd.Controleurs.ConnexionControl;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Connexion extends JPanel{
    //Variable
    private ConnexionControl controleur;
    private static boolean visible = false;

    //Constructeur
    public Connexion(){
            //On instancie le controleur
            controleur = new ConnexionControl(this);

            setVisible(visible);
    }

    public void setVisible(){
        visible = true;
    }

    //Fonction Paint
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1280, 720);
        
        g.setColor(Color.RED);
        g.fillRect(340, 100, 600, 100);

        
    }
}
