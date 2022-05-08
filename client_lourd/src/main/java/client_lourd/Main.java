package client_lourd;

//Bibliothèques
import javax.swing.*;
import java.awt.*;
import java.util.*;

//Fenetre
class Fenetre extends JFrame{	
	public Fenetre() {
		this.setSize(1100, 720);
		this.setTitle("Masterclass");
		Accueil panneau_accueil = new Accueil();
		this.setBackground(Color.white);
		this.getContentPane().add(panneau_accueil);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

//Classe Main
public class Main{
    //Main
    public static void main(String [] args){
        Fenetre f = new Fenetre();
    }
}