
set foreign_key_checks=0 ;

CREATE TABLE Personne(
         num INT AUTO_INCREMENT
       , Pseudo VARCHAR(30) NOT NULL
       , Email  VARCHAR(300) NOT NULL
       , password VARCHAR(30) NOT NULL
       , type VARCHAR(30) NOT NULL -- Utilisateur/Admin
       , PRIMARY KEY (num)
)ENGINE=InnoDB;


CREATE TABLE Utilisateur(
         num INT
       , FOREIGN KEY (num) REFERENCES Personne(num)
       , PRIMARY KEY (num)
)ENGINE=InnoDB;


CREATE TABLE Admin(
         num INT
       , FOREIGN KEY (num) REFERENCES Personne(num)
       , PRIMARY KEY (num)
)ENGINE=InnoDB;


CREATE TABLE Creneau(
         num INT AUTO_INCREMENT
       , date DATE
       , timebeg TIME
       , timeend TIME
       , cours INT
       , FOREIGN KEY (cours) REFERENCES Cours(num)    
       , PRIMARY KEY (num)
)ENGINE=InnoDB;


CREATE TABLE Cours(
       num INT AUTO_INCREMENT
     , salle VARCHAR(30)
     , PRIMARY KEY (num)
)ENGINE=InnoDB;


CREATE TABLE Planning(
       utilisateur INT
     , creneau INT
     , FOREIGN KEY (utilisateur) REFERENCES Utilisateur(num)
     , FOREIGN KEY (creneau) REFERENCES Creneau(num)    
)ENGINE=InnoDB;