<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>
<link rel="stylesheet" type="text/css" href="script/projet.css">
<link rel="stylesheet" type="text/css" href="script/account.css">


<script type="text/javascript" src="style/projet.js"></script>
</head>

<body>
	<button onclick="window.history.back();"><img src="img/retourne.jpg" /></button>

<div class="login-box">
    <h2>Connexion</h2>
    
    <form action ="<%=request.getContextPath()%>/LoginServlet" id ="form" method="post" name="connexion">
   	<div class="user-box">
   	<label for="pseudo">PSEUDO</label>
    <input type="text" name="pseudo" id="pseudo" pattern="\w*" title="Les caractères spéciaux sauf '_' ne sont pas acceptés" value="" required></div>
	<label for="password">MOT DE PASSE</label>
    <div class="user-box"><input type="password" name="password" id="password"  minlength="4" title="6 caractère minimum" required></div>
	<input type="hidden" name="id_pseudo" id="id_pseudo" value="-1"></input>
   	<div id="Vérifier" class="verif" onclick="valider_connexion()">Vérification</div>
    <input id ="valid" type="submit" class="bouton_valid" title="Connexion" value="Se connecter">
	
    </form>
    
    <a class="alt_co" href="inscription.jsp">Créer un compte</a>
    </div>
    
</body>
</html>
