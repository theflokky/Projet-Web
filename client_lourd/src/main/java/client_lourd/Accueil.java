package client_lourd;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Accueil extends JPanel{
    //Constructeur
    public Accueil(){
        setVisible(true);
    }

    //Fonction du panneau
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 100, 100);
    }
}