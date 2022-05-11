<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
<style>
.menu_header{
  position:fixed;
  display: block;
  top: 0;
  left: 0;
  width: 280px; /* 15% */
  height: 85%;
}

.menu_header nav{
  width: 100%;
  height: 100%;
  display: inline-block;
}

.menu a{
  text-decoration:none;
  color: #f0cc3e;
}

.menu a:hover .underline{
  transition-duration: 0.5s;
  width: 39%;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
}

li {
	padding-left: 50px;
	padding-right: 50px;
	width: 100px;
	float: left;
}

.active {
  background-color: blue;
}

li a, .dropbtn {
  display: inline-block;
  color: white;
  text-align: center;
  padding: 5px;
  text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}


li.dropdown {
  display: inline-block;
}

.dropdown button {
	color: black;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.show {display:block;}

nav{
	background-image: url('img/accueil.jpg');
}
</style>
	</head>
	<body>
  <nav>
    
    <a href="index.jsp" id="logo">
    <img src="img/logo.jpg" style="width: 50px;" alt="Logo">
    </a>
    <ul class="menu">
          <li><a href="index.jsp">ACCUEIL</a></li>
          <li><a href="">A PROPOS</a></li>
    </ul>
  </nav>
	<hr/>
