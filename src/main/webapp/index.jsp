<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="projet_web2.Connexion"%> 
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
   <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
   
<!DOCTYPE html>
<html lang="fr">
  <head>
    <meta charset="utf-8">
    <title>Notre site</title>
    <link rel="stylesheet" href="script/projet.css">
    <script type="text/javascript" src="style/projet.js"></script>
  </head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<% String Id_user = (String) session.getAttribute("Id_user"); %>
	<% ServletContext context = request.getSession().getServletContext(); %>
	
	<c:if test="${not empty param.id_pseudo or param.id_pseudo > -1 }">
		<c:catch var="donner_id">
			<c:set var="id_pseudo" value="${param.id_pseudo }" scope = "application"></c:set>
		</c:catch>
	  	
  	</c:if>
  	
	<h1>BIENVENUE</h1>
	<p style="float:right; padding-right: 60px"><a href="Connexion.jsp">Connecter</a></p>
	<p>Bienvenu sur le site : Le site vous permet de .... !</p>
	<p>Explication</p>
	<p>Une messagerie  est également intégrée</p>
	
	<br><br><br>
	<a style="padding: 30px" href="#"><img src="img/img1.jpg"/></a>
	<a style="padding: 30px" href="#"><img src="img/img2.jpg"/></a>
	<a style="padding: 30px" href="#"><img src="img/img3.jpg"/></a><br><br><br>
	<a style="padding: 30px" href="#"><img src="img/img4.jpg"/></a>
	<a style="padding: 30px" href="#"><img src="img/img5.jpg"/></a>
	<a style="padding: 30px" href="#"><img src="img/img6.jpg"/></a><br><br><br>
	<a style="padding: 30px" href="#"><img src="img/img7.jpg"/></a>
	<a style="padding: 30px" href="#"><img src="img/img8.jpg"/></a>
	<a style="padding: 30px" href="#"><img src="img/img9.jpg"/></a>

	<jsp:include page="/footer.jsp" />
      
  </body>
  
</html>
