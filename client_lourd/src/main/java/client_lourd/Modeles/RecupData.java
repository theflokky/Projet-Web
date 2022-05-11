package client_lourd.Modeles;

import java.sql.*;
import java.io.*;
import client_lourd.Controleurs.ConnexionControl;

public class RecupData{
    private static String[][] init_table_user(Integer nb_colonne){
        String[][] table = new String[nb_colonne][1000];


        for(int i= 0; i < nb_colonne; i++){
            for(int j=0; j<1000; j++){
                table[i][j] = new String("");
            }
        }
        return table;
    }

    private static Integer[] init_table_admin(){
        Integer[] table = new Integer[1000];


        for(int i= 0; i < 1000; i++){
            table[i]=-1;
        }
        return table;
    }

    private static Integer[][] init_table_horaire(){
        Integer[][] table = new Integer[3][1000];


        for(int i= 0; i < 3; i++){
            for(int j=0; j<1000; j++){
                table[i][j] = -1;
            }
        }
        return table;
    }


    public static String[][] table_user = init_table_user(2);
    public static Integer[] table_admin = init_table_admin();
    public static String[][] table_cours = init_table_user(2);
    public static Integer[][] table_horaire = init_table_horaire();

    //Fonction qui recupere les utilisateurs et les stockent dans un tableau
    public static void recupererUtilisateurs() throws SQLException{
        //Connexion a la BDD
        Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/chomeur", "flokky", "giroud");
        
        if (connexion != null) {
            System.out.println("[BDD] Connexion a la Base de Données Réussie");
            System.out.println("[BDD] Recuperation des Utilisateurs sur BDD");

            Statement statement = connexion.createStatement();
            ResultSet resultats = statement.executeQuery("SELECT id, pseudo, est_admin, password, mail FROM utilisateur;");

            while(resultats.next()){
                Integer id = resultats.getInt("id");
                String pseudo = resultats.getString("pseudo");
                String email = resultats.getString("mail");
                String password = resultats.getString("password");
                Integer type = resultats.getInt("est_admin");

                table_user[0][id] = pseudo;
                table_user[1][id] = password;
                table_admin[id] = type;
                
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

        //Fonction qui recupere les utilisateurs et les stockent dans un tableau
        public static void recupererPlanning() throws SQLException{
            //Connexion a la BDD
            Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/chomeur", "flokky", "giroud");
            
            if (connexion != null) {
                System.out.println("[BDD] Connexion a la Base de Données Réussie");
                System.out.println("[BDD] Recuperation des Cours sur BDD");
    
                Statement statement = connexion.createStatement();
                ResultSet resultats = statement.executeQuery("SELECT id_cours, nom, debut, fin, professeur, jour FROM cours;");
    
                while(resultats.next()){
                    Integer id = resultats.getInt("id_cours");
                    String nom = resultats.getString("nom");
                    String professeur = resultats.getString("professeur");
                    Integer debut = resultats.getInt("debut");
                    Integer fin = resultats.getInt("fin");
                    Integer jour = resultats.getInt("jour");

                    table_cours[0][id]=nom;
                    table_cours[1][id]=professeur;
                    table_horaire[0][id]=debut;
                    table_horaire[1][id]=fin;
                    table_horaire[2][id]=jour;
                    
                    System.out.println("Cours " + id + " : " + nom + " " + professeur + " " + debut + " " + fin + " " + jour);
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
