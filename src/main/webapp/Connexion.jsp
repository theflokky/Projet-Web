<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>
<link rel="stylesheet" type="text/css" href="script/projet.css">
<script type="text/javascript" src="style/projet.js"></script>
</head>

<body style="background-image: url('img/background.jpg'); background-size: cover;">
	<button onclick="window.history.back();"><img src="img/retourne.jpg" /></button>

<div class="login-box">
    <h1 style="color:red">Connexion</h1><br><br>
    
    <!-- form action ="/ServPlan" id ="form" method="post" name="connexion" -->
<form action ="planning.jsp" id ="form" method="post" name="connexion">
   	<div class="user-box">
   		<label for="pseudo">PSEUDO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    	<input type="text" name="pseudo" id="pseudo" pattern="\w*" title="Les caractères spéciaux sauf '_' ne sont pas acceptés" value="" required>
    </div>
    <br>
    <div class="user-box">
		<label for="password">MOT DE PASSE</label>
    	<input type="password" name="password" id="password"  minlength="6" title="6 caractère minimum" required>
    </div>
    <br>
	<input type="hidden" name="id_pseudo" id="id_pseudo" value="-1"></input><br>
    <input id ="valid" type="submit" class="bouton_valid" title="Connexion" value="Se connecter"><br>
    </form>
    <br>
    <a class="alt_co" href="inscription.jsp" style="color:red; font-size:20px">Créer un compte</a>
    </div>
    
    <% System.out.println(request.getParameter("id_pseudo")); %>

</body>
</html>
