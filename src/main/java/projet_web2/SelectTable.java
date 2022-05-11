package projet_web2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SelectTable
{
	static  List<List<Object>> Lcours ;
  public static void main(String args[])
  {
    try
    {
      //étape 1: charger la classe driver
      Class.forName("com.mysql.jdbc.Driver");

      //étape 2: créer l'objet de connexion
      Connection conn = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/chomeur", "root", "");

      //étape 3: créer l'objet statement 
      Statement stmt = conn.createStatement();
      String sql = "SELECT id_cours, nom, debut, fin, professeur FROM cours";
      ResultSet res = stmt.executeQuery(sql);

      //étape 5: extraire les données
      while(res.next()){
         //Récupérer par nom de colonne
         int id = res.getInt("id_cours");
         String nom = res.getString("nom");
         int debut = res.getInt("debut");
         int fin = res.getInt("fin");
         String professeur = res.getString("professeur");
         
         Lcours=List.of(
        		 List.of(id,nom,debut,fin,professeur));


         //Afficher les valeurs
         /*
         System.out.print("ID: " + id);
         System.out.print(", Nom: " + nom);
         System.out.print(", debut: " + debut);
         System.out.print(", fin: " + fin);
         System.out.println(", Professeur: " + professeur);
         */
         Lcours.forEach(System.out::println);

      }  
    
      //étape 6: fermez l'objet de connexion
      conn.close();
    }
    catch(Exception e){ 
      System.out.println(e);
    }
  }
}
