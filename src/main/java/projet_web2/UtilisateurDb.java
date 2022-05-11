package projet_web2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UtilisateurDb {
	public static int ID_USER=2;
	public int inscription_user(Utilisateur user) throws ClassNotFoundException {
	        String INSERT_USERS_SQL = "INSERT INTO utilisateur" +
	            "  (id, pseudo, est_admin, password, mail) VALUES " +
	            " (?, ?, ?, ?,?);";

	        int result = 0;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://127.0.0.1:3306/chomeur", "root", "");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	            preparedStatement.setInt(1,ID_USER++);
	            preparedStatement.setString(2,user.getPseudo());
	            preparedStatement.setInt(3, user.getAdmin());
	            preparedStatement.setString(4, user.getPassword());
	            preparedStatement.setString(5, user.getMail());



	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            // process sql exception
	            printSQLException(e);
	        }
	        return result;
	    }
	
	private void printSQLException(SQLException ex) {
		for (Throwable e: ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
	            System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	            System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	            System.err.println("Message: " + e.getMessage());
	            Throwable t = ex.getCause();
	            while (t != null) {
	            	System.out.println("Cause: " + t);
	                 t = t.getCause();             
	            }
	            
			}
		}
		}
	    
	    


}
