package client_lourd;

import javax.swing.*;

import client_lourd.Vues.Fenetre;
import java.sql.*;
import java.io.*;

import java.awt.*;

//Classe Main
public class Main{
	public static Fenetre f;

    //Main
    public static void main(String [] args) throws SQLException, IOException, ClassNotFoundException{
        //client_lourd.Modeles.ConnexionBDD.bddConnexion();
        f = new Fenetre();
        
    }
}