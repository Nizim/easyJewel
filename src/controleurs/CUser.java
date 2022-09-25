package controleurs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import modeles.Connexion;
import modeles.User;

/**
 *
 * @author darch
 */
public class CUser {

    public Connexion co;
    public HashMap<Integer, User> userMap;

    public CUser(Connexion co) {
        setCo(co);
        getUsersFromDB();
    }

    public void setCo(Connexion co) {
        this.co = co;
    }

    public void getUsersFromDB() {
        co.connect();
        ResultSet rsp = co.select("SELECT * FROM Utilisateurs");

        try {
            userMap = new HashMap<Integer, User>();
            while (rsp.next()) {
                int identifiant = rsp.getInt(1);
                String nomUtilisateur = rsp.getString(2);
                String password = rsp.getString(3);
                String statut = rsp.getString(4);
                String mail = rsp.getString(5);
                int nbAvertissement = rsp.getInt(6);

                User user = new User(identifiant, nomUtilisateur, password, statut, mail, nbAvertissement);
                userMap.put(identifiant, user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        co.close();
    }

    public HashMap<Integer, User> getUsers() {
        return userMap;
    }

    public void supprimerUser(Connexion co, String nomUser) {
        co.connect();
        if (existeNomUser(co, nomUser)) {
            co.update("DELETE FROM Utilisateurs WHERE nom_utilisateur = '" + nomUser + "'");
        } else {
            System.out.println("L'utilisateur n'existe pas");

        }
        co.close();
    }

    public void supprimerUserById(Connexion co, int idUser) {
        co.connect();
        co.update("DELETE FROM Utilisateurs WHERE identifiant = '" + idUser + "'");
        co.close();
    }

    public DefaultTableModel fillUserTable() {
        getUsersFromDB();
        DefaultTableModel model = createTableModel();
        for (Map.Entry<Integer, User> prod : userMap.entrySet()) {
            Integer identifiant = prod.getKey();
            String nomUtilisateur = prod.getValue().getNomUtilisateur();
            String statut = prod.getValue().getStatut();
            String mail = prod.getValue().getMail();
            int nbAvertissement = prod.getValue().getNbAvertissement();
            model.addRow(new Object[]{identifiant, nomUtilisateur, statut, mail, nbAvertissement});
        }
        return model;
    }

    public DefaultTableModel createTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        Object[] column = {"Identifiant", "Nom d'utilisateur", "Statut", "Mail", "Avertissement"};
        model.setColumnIdentifiers(column);
        return model;
    }

    public boolean existeNomUser(Connexion co, String nomUser) {

        for (Map.Entry<Integer, User> cat : userMap.entrySet()) {
            if (cat.getValue().getNomUtilisateur().equals(nomUser)) {
                return true;
            }
        }
        return false;

    }

    public boolean existeIdUser(Integer id) {
        return userMap.containsKey(id);
    }

    public int getIdFromUsername(HashMap<Integer, User> catMap, String nomUser) {
        for (Map.Entry<Integer, User> map : userMap.entrySet()) {
            if (map.getValue().getNomUtilisateur().equals(nomUser)) {
                return map.getKey();
            }
        }
        return -1;
    }
}
