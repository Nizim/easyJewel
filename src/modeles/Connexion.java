package modeles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author p2006969
 */
public class Connexion {

    Connection connexion;
    static final String DRIVER = "oracle.jdbc.OracleDriver";
    static final String BD_URL = "jdbc:oracle:thin:@iutdoua-ora.univ-lyon1.fr:1521:cdb1";
    static final String BD_USER = "p2006969";
    static final String BD_MDP = "584758";

    public Connexion() {
        connect();
    }

    public void connect() {
        try {
            Class.forName(DRIVER);
            connexion = DriverManager.getConnection(BD_URL, BD_USER, BD_MDP);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public ResultSet select(String query) {
        try {
            Statement stmt = connexion.createStatement();
            ResultSet result = stmt.executeQuery(query);
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int update(String query) {
        try {
            Statement statement = connexion.createStatement();
            return statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void close() {
        try {
            connexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
