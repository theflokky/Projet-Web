<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" version="4.0">
  <servlet>
  	<servlet-name>Init</servlet-name>
  	<servlet-class>projet_web2.Init</servlet-class>
  	<!--  <load-on-startup>0</load-on-startup>  -->
  </servlet>
  <servlet>
    <description></description>
    <display-name>Deconnexion</display-name>
    <servlet-name>Deconnexion</servlet-name>
    <servlet-class>projet_web2.Deconnexion</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>Deconnexion</servlet-name>
    <url-pattern>/Deconnexion</url-pattern>
  </servlet-mapping>
  <servlet-mapping>
  	<servlet-name>default</servlet-name>
  	<url-pattern>*.css</url-pattern>
  	<url-pattern>*.js</url-pattern>
  	<url-pattern>*.jpg</url-pattern>
  	<url-pattern>*.png</url-pattern>
  </servlet-mapping>
  
  <display-name>ProjetDW2022</display-name>
</web-app>
