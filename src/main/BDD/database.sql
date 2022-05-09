set foreign_key_checks=0 ;

CREATE TABLE Personne(
         num INT AUTO_INCREMENT
       , Pseudo VARCHAR(30) NOT NULL
       , Email  VARCHAR(300) NOT NULL
       , password VARCHAR(30) NOT NULL
       , titre VARCHAR(30) NOT NULL -- Utilisateur/Admin
       , PRIMARY KEY (num)
)ENGINE=InnoDB;
