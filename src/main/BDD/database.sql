set foreign_key_checks=0 ;

CREATE TABLE Utilisateur(
         num INT AUTO_INCREMENT
       , Pseudo VARCHAR(50) NOT NULL
       , Email  VARCHAR(255) NOT NULL
       , password VARCHAR(40) NOT NULL -- hash only
       , PRIMARY KEY (num)
)ENGINE=InnoDB;
