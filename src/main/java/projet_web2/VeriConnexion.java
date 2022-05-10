package projet_web2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;

public class ServletConnection extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private Connexion c = new Connexion();
	
	public void  doGet(HttpServletRequest  request ,HttpServletResponse  response ){
		try {
			co(request,response);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	private int co(HttpServletRequest  rq ,HttpServletResponse  resp ) throws SQLException, IOException{
	  
	  	
      HttpSession session = rq.getSession();
      if(rq.getAttribute("id")!=null){
         /*deja co*/
         coMessageAlreadyCo();
         return 2;
      }
      String email;
      String password;
	 
      /*recup email*/
      email=rq.getParameter("email");
      /*recup password*/
      password=rq.getParameter("password");
      

      /*use prepared-statement to avoid "fuzzy" entries */
      PreparedStatement st=co.prepareStatement("SELECT num,email,password,salt FROM Personne WHERE email = ?");
      st.setString(1, email);
      ResultSet rs = st.executeQuery();
      
      /* next rappel :
       * -deplace curseur sur la ligne suivante. 
       * -retourne true si curseur sur ligne, false si curseur depasse la fin*/
      if(!rs.next()){
    	//1ere ligne
         /*echec*/
         coMessageFail();
         st.close();
         rs.close();
         return 1;
      }
      /*on suppose l'integrite de la table; |rs|=1*/
      
      String tmpPassword =rs.getString("password");
      String tmpSalt =rs.getString("salt");
      
      /*verf*/
      if(!(  password.equals(hashPassword(tmpPassword+tmpSalt)) )){
         coMessageFail();
         st.close();
         rs.close();
         return 1;
      }

      //else
      /*affect session*/
      int id =rs.getInt("id");
      StatutPersonne statut = getStatut(id);
      session.setAttribute("statut", statut.ordinal());
      session.setAttribute("id", id);
      
      st.close();
      rs.close();
      /*redirect*/
      coMessageSuccess();
      resp.sendRedirect("ADE");
      return 0;
    }
}
