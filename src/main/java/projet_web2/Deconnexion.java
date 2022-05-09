package projet_web2;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Deconnexion extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Deconnexion() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException{
		
		ServletContext context = this.getServletContext();
		context.setAttribute("id_pseudo", null);
		reponse.sendRedirect("index.jsp");
	}

}
