package client_lourd.Modeles;

import java.sql.*;
import java.io.*;


public class EcrireData {
    //Fonction qui recupere les utilisateurs et les stockent dans un tableau
    public static void insererUtilisateurs(String pseudo, String mail, String password) throws SQLException{
        //Connexion a la BDD
        String admin = "Utilisateur";

        Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/chomeur", "flokky", "giroud");
    
        if (connexion != null) {
            System.out.println("[BDD] Connexion a la Base de Données Réussie");
        
            String requete = "INSERT INTO Personne (Pseudo, Email, password, type) VALUES(?, ?, ?, ?)";

            PreparedStatement statement = connexion.prepareStatement(requete);

            statement.setString(1, pseudo);
            statement.setString(2, mail);
            statement.setString(3, password);
            statement.setString(4, admin);
            
            statement.executeUpdate();
                
            statement.close();
        } 
        else {
            System.out.println("[BDD] Echec de la Connexion a la Base de Données");
            System.exit(0);
        }
        
        connexion.close(); 
    }
}
