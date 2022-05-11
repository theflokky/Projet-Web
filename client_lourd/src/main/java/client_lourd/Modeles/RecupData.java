package client_lourd.Modeles;

import java.sql.*;
import java.io.*;
import client_lourd.Controleurs.ConnexionControl;

public class RecupData{
    //Fonction qui recupere les utilisateurs et les stockent dans un tableau
    public static void recupererUtilisateurs() throws SQLException{
        //Connexion a la BDD
        Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/chomeur", "flokky", "giroud");
        
        if (connexion != null) {
            System.out.println("[BDD] Connexion a la Base de Données Réussie");
            System.out.println("[BDD] Recuperation des Utilisateurs sur BDD");

            Statement statement = connexion.createStatement();
            ResultSet resultats = statement.executeQuery("SELECT num, Pseudo, Email, password, type FROM Personne;");

            while(resultats.next()){
                Integer id = resultats.getInt("num");
                String pseudo = resultats.getString("Pseudo");
                String email = resultats.getString("Email");
                String password = resultats.getString("password");
                String type = resultats.getString("type");

                ConnexionControl.table_user[0][id] = pseudo;
                ConnexionControl.table_user[1][id] = password;
                ConnexionControl.table_user[2][id] = type;
                
                System.out.println("Personne " + id + " : " + pseudo + " " + email + " " + password + " " + type);
            }

            resultats.close();
            statement.close();
        } 
        else {
            System.out.println("[BDD] Echec de la Connexion a la Base de Données");
            System.exit(0);
        }

        connexion.close();
    }
    
}
