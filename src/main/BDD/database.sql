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

// à faire
CREATE TABLE Cours(
       num INT AUTO_INCREMENT
     , typeCours ENUM('EM','TD','TP','EX')
     , license INT 
     , matiere VARCHAR(30) 
     , classe INT 
     , groupe INT DEFAULT NULL
     , FOREIGN KEY (license) REFERENCES LMD(num)
     , FOREIGN KEY (matiere) REFERENCES Matiere(nom) 
     , FOREIGN KEY (prof) REFERENCES Prof(num)
     , FOREIGN KEY (classe) REFERENCES Classe(num)
     , FOREIGN KEY (groupe) REFERENCES GroupeTravail(num)
     , PRIMARY KEY (num)
)ENGINE=InnoDB;
