package client_lourd.Modeles;

import java.sql.*;
import java.io.*;

public class ConnexionBDD {
    public static void bddConnexion() throws SQLException, ClassNotFoundException, IOException{
        //Connexion a la BDD A COMPLETER QUAND BDD OP
        Connection connexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8080/basededonnees", "user", "passwd");
        
        if (connexion != null) {
            System.out.println("[BDD] Connexion a la Base de Données Réussie");
        } 
        else {
            System.out.println("[BDD] Echec de la Connexion a la Base de Données");
            System.exit(0);
        }
    }
}
