package client_lourd.Modeles;

import java.sql.*;
import java.io.*;

public class ConnexionBDD {
    public static void bddConnexion() throws SQLException, ClassNotFoundException, IOException{
        //Connexion a la BDD
        Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/chomeur", "flokky", "giroud");
        
        if (connexion != null) {
            System.out.println("[BDD] Connexion a la Base de Données Réussie");
        } 
        else {
            System.out.println("[BDD] Echec de la Connexion a la Base de Données");
            System.exit(0);
        }

        connexion.close();
    }
}
