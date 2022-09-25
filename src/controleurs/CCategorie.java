package controleurs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import modeles.Connexion;
import modeles.Categorie;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darch
 */
public class CCategorie {

    public Connexion co;
    public HashMap<Integer, Categorie> catMap;
    public CProduit cproduit;

    public CCategorie(Connexion co) {
        setCo(co);
        getCategoriesFromDB();
    }

    public void setCo(Connexion co) {
        this.co = co;
    }

    public void getCategoriesFromDB() {
        co.connect();
        ResultSet rsp = co.select("SELECT * FROM Categorie");

        try {
            catMap = new HashMap<Integer, Categorie>();
            while (rsp.next()) {
                int idCategorie = rsp.getInt(1);
                String nomCategorie = rsp.getString(2);

                Categorie categorie = new Categorie(idCategorie, nomCategorie);
                catMap.put(idCategorie, categorie);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        co.close();
    }

    public HashMap<Integer, Categorie> getCategorie() {
        return catMap;
    }

    public void ajoutCategorie(Connexion co, String nomCat) {
        co.connect();
        co.update("INSERT INTO Categorie (idCat, libelleCat) " + "VALUES (null, '" + nomCat + "')");
        co.close();
    }

    public void supprimerCategorieByName(Connexion co, String nomCat) {
        co.connect();
        if (existeNomCategorie(co, nomCat)) {
            co.update("DELETE FROM Categorie WHERE libelleCat = '" + nomCat + "'");
        } else {
            JOptionPane.showMessageDialog(null, "La catégorie n'existe pas", "Attention", JOptionPane.WARNING_MESSAGE);

        }
        co.close();
    }

    public void supprimerCategorieById(Connexion co, int idCat) {
        co.connect();
        if (existeIdCategorie(idCat)) {
            co.update("DELETE FROM Categorie WHERE idCat = '" + idCat + "'");
        } else {
            JOptionPane.showMessageDialog(null, "La catégorie n'existe pas", "Attention", JOptionPane.WARNING_MESSAGE);

        }
        co.close();
    }

    public DefaultTableModel fillCategorieTable() {
        getCategoriesFromDB();
        DefaultTableModel model = createTableModel();
        for (Map.Entry<Integer, Categorie> prod : catMap.entrySet()) {
            Integer identifiant = prod.getKey();
            String libelle = prod.getValue().getNomCategorie();
            model.addRow(new Object[]{identifiant, libelle});
        }
        return model;
    }

    public DefaultTableModel createTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        Object[] column = {"Identifiant", "Libellé"};
        model.setColumnIdentifiers(column);
        return model;
    }

    public void modifierCategorie(Connexion co, int idCategorie, String newName) {
        co.connect();
        co.update("UPDATE Categorie SET libelleCat='" + newName + "' WHERE idCat='" + idCategorie + "'");
        co.close();
    }

    public boolean existeNomCategorie(Connexion co, String nomCat) {

        for (Map.Entry<Integer, Categorie> cat : catMap.entrySet()) {
            if (cat.getValue().getNomCategorie().equals(nomCat)) {
                return true;
            }
        }
        return false;

    }

    public boolean existeIdCategorie(Integer id) {
        return catMap.containsKey(id);
    }

    public int getIdFromCategorie(String nomCat) {
        for (Map.Entry<Integer, Categorie> map : catMap.entrySet()) {
            if (map.getValue().getNomCategorie().equals(nomCat)) {
                return map.getKey();
            }
        }
        return -1;
    }

    public void updateCategorieName(int idCat, String nomCat) {

    }

}
