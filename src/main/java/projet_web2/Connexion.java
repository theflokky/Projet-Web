package projet_web2;

import java.sql.*;

// BDD a creer, j ai juste preparer la fonction de connexion et quelques fonction
public class Connexion {
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    private final String JDBC_CONNEXION = "jdbc:mysql://localhost:4456/lj08048s";
    private final String JDBC_USER = "lj08048s";
    private final String JDBC_PWD = "0000"; // a definir
    
    /*
    private final String JDBC_CONNEXION = "jdbc:mysql://localhost/mydb";
    private final String JDBC_USER = "root";
    private final String JDBC_PWD = "";
    */
    Connection c;
    private Statement ts;

    public Connexion() {
    	
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Java Database Connectivity a ete trouve");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            c = DriverManager.getConnection(JDBC_CONNEXION, JDBC_USER, JDBC_PWD);
            System.out.println("Connexion etablie");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ts = c.createStatement();
            System.out.println("Statement cree");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Fonction d'authentification d'un utilisateur, vérifie que toutes les données fournies soient juste
     * @param user Utilisateur souhaitant s'authentifier
     */
    public boolean Authentification(Utilisateur user){
        String query = "SELECT * FROM Utilisateur";
        try(ResultSet resultat = ts.executeQuery(query);){
            while(resultat.next()){ 
                // Stockage des informations
                String pseudo = resultat.getString(2);
                String password = resultat.getString(4);
               
                // Comparaison
                if (pseudo.equals(user.getPseudo()) && password.equals(user.getPassword())){
                    return true; // On a trouvé une correspondance
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
        return false;
    }

    /**
     * Fonction d'inscription d'un utilisateur (Les informations seront verifiees anterieurement)
     * @param user Utilisateur a inscrire
     */
    public boolean Inscription(Utilisateur user){
        if (!this.Authentification(user)){ // On empeche que deux personnes avec les memes infos s'inscrivent 

            String query = "INSERT INTO Utilisateur (Pseudo, Mail, Password, est_admin) VALUES ( ?, ?, ?, ?)";

            try(PreparedStatement ps = c.prepareStatement(query);){
           
                ps.setString(1, user.getPseudo());
                ps.setString(2, user.getMail());
                ps.setString(3, user.getPassword());
                String ad = String.valueOf(user.getAdmin());
                ps.setString(4, ad);
                ps.executeUpdate();
            }catch(SQLException e){
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

    /**
     * Fonction d'authentification d'un utilisateur, verifie si les donnees sont juste
     * @param user Utilisateur souhaitant s'authentifier
     */
   
    public int trouverId(String pseudo) {
    	String query = "SELECT Id FROM Utilisateur WHERE pseudo = '"+ pseudo + "' "; 
    	try(ResultSet resultat = ts.executeQuery(query);){
            int id = -1;
            
            while(resultat.next()){
            	id = Integer.parseInt(resultat.getString(1));
            }
            return id;
        }catch(SQLException e){
        	e.printStackTrace();
        	return -1;
            
        }
    }

   
    
    public void close() {
    	try {
	    	ts.close();
	    	c.close();
    	}catch(SQLException e) {
    		
    	}
    }
    
    
}
