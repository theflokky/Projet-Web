
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="projet_web2.Connexion"%> 
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
   <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  

<jsp:useBean id="Connexion" class="projet_web2.Connexion" scope="application"></jsp:useBean>

<!DOCTYPE html>
<html lang="fr">
  <head>
  
    <meta charset="utf-8">
    <title>Notre site</title>
    <link rel="stylesheet" type="text/css" href="style/projet.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@900&display=swap" rel="stylesheet">
  </head>
<body>

	<% String Id_user = (String) session.getAttribute("Id_user"); %>
	<% ServletContext context = request.getSession().getServletContext(); %>
	
	<c:if test="${not empty param.id_pseudo or param.id_pseudo > -1 }">
		<c:catch var="donner_id">
			<c:set var="id_pseudo" value="${param.id_pseudo }" scope = "application"></c:set>
		</c:catch>
	  	
  	</c:if>
  	
  	<c:import url="header.html" />
	<div class="main">
      <div class="main_content">
        <section class="news">
          <h2>BIENVENUE</h2>
		<p style="float:right; padding-right: 60px"><a href="Connexion.jsp">Connecter</a></p>
          <p>Bienvenu sur le site : Le site vous permet de .... !</p>
          <p>Explication</p>
          <p>Une messagerie  est également intégrée</p>
          <p> ... !</p> 
          
		</section>
		
        </div>
       
        
      </div>
      
      
      
      <c:import url="footer.html" />
      <script src="script/projet.js"></script>
      
  </body>
  
</html>
