package client_lourd.Modeles;

import java.sql.*;
import java.io.*;
import client_lourd.Modeles.RecupData;

public class ConnexionBDD {
    public static void bddConnexion() throws SQLException, ClassNotFoundException, IOException{
        RecupData.recupererUtilisateurs();
        RecupData.recupererPlanning();
    }
}
