<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page errorPage="page_error.jsp" %>
    <%@ page import="java.sql.*" %>
    
<%@ page import="projet_web2.Connexion"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ADE</title>
    <link rel="stylesheet" href="style/projet.css">
    <script type="text/javascript" src="script/projet.js"></script>
</head>
<body>
	<button onclick="retourne()"><img src="img/retourne.jpg" /></button>
	<form style="float:right" action="Mess" method="post"><input type="submit" name="messagerie" value="messagerie" /></form>
	<h3>BIENVENUE</h3>	

	<table>
		<tr><td colspan="3"><strong>EMPLOI DU TEMPS</strong></td></tr>
		<tr>
		</tr>
		  <%
   try
   {
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/chomeur";
       String username="root";
       String password="";
       String query="select * from cours";
       Connection conn=DriverManager.getConnection(url, username, password);
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery(query);
       while(rs.next())
       {
   %>
           <tr><td><%="Professeur: " + rs.getString("professeur") %></td></tr>
           <tr><td><%="Cours: " + rs.getString("nom") %></td></tr>
           <tr><td><%="Heure_debut :" + rs.getInt("debut")+'H' %></td></tr>
           <tr><td><%="Heure_fin: "+ rs.getInt("fin")+'H' %></td></tr>
           <hr/>
   <%
       }
   %>
   </table>
   <hr/>
   <%
   rs.close();
   stmt.close();
   conn.close();  
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   %>

	</table>
	
	<a style="float: right; text-decoration: none; border: 1px solid black;" href="form_creneau.html">Ajouter Créneau</a>
</body>
</body>
</html>
