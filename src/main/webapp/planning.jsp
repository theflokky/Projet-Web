<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="projet_web2.Planning"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
-->

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ADE</title>
    <link rel="stylesheet" href="style/projet.css">
    <script type="text/javascript" src="script/projet.js"></script>
</head>
<body>
	<button onclick="window.history.back();"><img src="img/retourne.jpg" /></button>
	<form style="float:right" action="Chat" method="post"><input type="submit" name="messagerie" value="messagerie" /></form>
	<h3>BIENVENUE</h3>	

	<% Planning ent = (Planning) session.getAttribute("edt"); %>
	<table>
		<tr><td colspan="3"><strong>EMPLOI DU TEMPS</strong></td></tr>
		<tr>
			<th>Cours</th>
			<th>Début</th>
			<th>Fin</th>
		</tr>
		<c:forEach var="item" items="${ent.getEdt()}">
			<tr>
				<td><c:out value="${item.getCours()}" /></td>
				<td><c:out value="${item.getDebut()}" /></td>
				<td><c:out value="${item.getFin()}" /></td>
			</tr>
		</c:forEach>
	</table>
<!-- Table utilise jstl/sql
	<table>
		<tr><td colspan="8"><strong>EMPLOI DU TEMPS</strong></td></tr>
		<sql:setDataSource var="ent" driver="com.mysql.jdbc.Driver"
			url="jdbc:mysql://127.0.0.1:8889/DBfac"
			user="bd02305t"  password=""/>
		
		<sql:query dataSource="${ent}" var="result">
			SELECT date, matiere, timebeg, timeend, batiment, salle, classe, groupe
			FROM Cours,Creaneau,Batiment,InfoClasse,LMDAnnee,LMD,GroupeTravail
			WHERE (    
				batiment.Creneau = nom.Batiment
				AND (
					creneau.Cours = num.Creneau
					AND classe.cours = num.InfoClasse
					AND license.InfoClasse = lmd.LMDAnne
					AND license.InfoClasse = num.LMD
					AND annee.InfoClasse   = annee.LMDAnne 
					AND classe.cours = num.Classe
					AND etudiant.Classe = ? /* :tmpid*/
					AND (
						groupe.cours = NULL
						OR  groupe.cours = num.GroupeTravail
						)
					)
				)
				OR (
					creneau.SeanceTravail =  num.Creneau
					AND groupe.SeanceTravail = num.GroupeTravail
					AND membre.ListeGroupeTravail = ? /* :tmpid*/
				)
				ORDER BY date, timebeg , timeend
			);
		</sql:query>

		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${date}"/></td>
   				<td><c:out value="${cours}"/></td>
				<td><c:out value="${timebeg}"/></td>
   				<td><c:out value="${timeend}"/></td>
   				<td><c:out value="${batiment}"/></td>
				<td><c:out value="${salle}"/></td>
				<td><c:out value="${classe}"/></td>
				<td><c:out value="${groupe}"/></td>
			</tr>
		</c:forEach>
	</table>
-->
</body>
</body>
</html>
