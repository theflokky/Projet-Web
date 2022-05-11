package client_lourd.Modeles;

import java.sql.*;
import java.io.*;


public class EcrireData {
    //Fonction qui recupere les utilisateurs et les stockent dans un tableau
    public static void insererUtilisateurs(String pseudo, String mail, String password) throws SQLException{
        //Connexion a la BDD

        Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/chomeur", "flokky", "giroud");
    
        if (connexion != null) {
            System.out.println("[BDD] Connexion a la Base de Données Réussie");
        
            String requete = "INSERT INTO utilisateur (pseudo, est_admin, password, mail) VALUES(?, ?, ?, ?)";

            PreparedStatement statement = connexion.prepareStatement(requete);

            statement.setString(1, pseudo);
            statement.setString(4, mail);
            statement.setString(3, password);
            statement.setInt(2, 0);
            
            statement.executeUpdate();
                
            statement.close();
        } 
        else {
            System.out.println("[BDD] Echec de la Connexion a la Base de Données");
            System.exit(0);
        }
        
        connexion.close(); 
    }

        //Fonction qui recupere les utilisateurs et les stockent dans un tableau
    public static void insererCours(String nom, String professeur, Integer debut, Integer fin, Integer jour) throws SQLException{
        //Connexion a la BDD

        Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/chomeur", "flokky", "giroud");
    
        if (connexion != null) {
            System.out.println("[BDD] Connexion a la Base de Données Réussie");
        
            String requete = "INSERT INTO cours (nom, debut, fin, professeur, jour) VALUES(?, ?, ?, ?, ?)";

            PreparedStatement statement = connexion.prepareStatement(requete);

            statement.setString(1, nom);
            statement.setInt(2, debut);
            statement.setInt(3, fin);
            statement.setString(4, professeur);
            statement.setInt(5, jour);
            
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
