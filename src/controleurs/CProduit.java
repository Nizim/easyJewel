package controleurs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modeles.Categorie;
import modeles.Produit;
import modeles.Connexion;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darch
 */
public class CProduit {

    public Connexion co;
    public HashMap<Integer, Produit> prodMap;
    public CCategorie ccategorie;

    public CProduit(Connexion co) {
        setCo(co);
        setCCategorie(co);
        getProduitsFromDB();
    }

    public void setCo(Connexion co) {
        this.co = co;
    }

    public void setCCategorie(Connexion co) {
        this.ccategorie = new CCategorie(co);
    }

    public void getProduitsFromDB() {
        co.connect();

        //Récupere toutes les catégories au préalable
        HashMap<Integer, Categorie> catMap = ccategorie.getCategorie();
        ResultSet rsp = co.select("SELECT * FROM Produits");
        try {
            prodMap = new HashMap<Integer, Produit>();
            while (rsp.next()) {

                int idProduit = rsp.getInt(1);
                String libelleProduit = rsp.getString(2);
                float prix = rsp.getFloat(3);
                String description = rsp.getString(4);
                int stockProduit = rsp.getInt(5);
                int idCategorie = rsp.getInt(6);
                int nbComm = rsp.getInt(7);
                
                if (ccategorie.existeIdCategorie(idCategorie)) {
                    //Recréation de cat correspondante
                    Categorie categorie = catMap.get(idCategorie);
                    Produit produit = new Produit(idProduit, libelleProduit, prix, description, stockProduit, categorie, nbComm);
                    prodMap.put(idProduit, produit);
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        co.close();
    }

    public HashMap<Integer, Produit> getProduits() {
        return prodMap;
    }

    public DefaultTableModel fillProduitTable() {
        getProduitsFromDB();
        DefaultTableModel model = createTableModel();
        for (Map.Entry<Integer, Produit> prod : prodMap.entrySet()) {
            Integer identifiant = prod.getKey();
            String libelle = prod.getValue().getLibelleProduit();
            float prix = prod.getValue().getPrix();
            String description = prod.getValue().getDescription();
            Integer stock = prod.getValue().getStockProduit();
            String categorieNom = prod.getValue().getCategorieProduit().getNomCategorie();
            Integer nbCommentaires = prod.getValue().getNbCommentaires();
            model.addRow(new Object[]{identifiant, libelle, prix, description, stock, categorieNom, nbCommentaires});
        }
        return model;
    }

    public DefaultTableModel createTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        Object[] column = {"Identifiant", "Libellé", "Prix", "Description", "Stock", "Catégorie", "Nombre de commentaires"};
        model.setColumnIdentifiers(column);
        return model;
    }

    public DefaultComboBoxModel fillCatCbb() {
        HashMap<Integer, Categorie> catMap = ccategorie.getCategorie();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Map.Entry<Integer, Categorie> cat : catMap.entrySet()) {
            model.addElement(cat.getValue().getNomCategorie());
        }
        return model;
    }
    
    public void modifierProduit(Connexion co, int idProduit, String libelle, int idCat, Float prix, String description, int stock) {
        co.connect();
        
        co.update("UPDATE Produits SET libelle='" + libelle + "' WHERE idProduit='" + idProduit + "'");
        co.update("UPDATE Produits SET idCat='" + idCat + "' WHERE idProduit='" + idProduit + "'");
        co.update("UPDATE Produits SET prix=" + prix + " WHERE idProduit='" + idProduit + "'");
        co.update("UPDATE Produits SET description='" + description + "' WHERE idProduit='" + idProduit + "'");
        co.update("UPDATE Produits SET stock='" + stock + "' WHERE idProduit='" + idProduit + "'");
        
        co.close();
    }

    public void ajoutProduit(Connexion co, String libelle, int idCat, Float prix, String description, int stock) {
        co.connect();
        co.update("INSERT INTO Produits (idProduit, libelle, idCat, prix, description, stock) "
                + "VALUES (null, '" + libelle + "'," + idCat + " ," + prix + ", '" + description + "','" + stock + "')");
        co.close();
    }

    public void supprimerProduitByName(Connexion co, String libelle) {
        co.connect();
        if (existeProduitByName(co, libelle)) {
            co.update("DELETE FROM Produits WHERE libelle='" + libelle + "'");
        } else {
            JOptionPane.showMessageDialog(null, "Le produit n'existe pas", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        co.close();
    }

    public void supprimerProduitById(Connexion co, int idProduit) {
        co.connect();
        if (existeProduitById(co, idProduit)) {
            co.update("DELETE FROM Produits WHERE idProduit='" + idProduit + "'");
        } else {
            JOptionPane.showMessageDialog(null, "Le produit n'existe pas", "Attention", JOptionPane.WARNING_MESSAGE);
        }
        co.close();
    }

    public boolean existeProduitByName(Connexion co, String nomProduit) {
        for (Map.Entry<Integer, Produit> prod : prodMap.entrySet()) {
            if (prod.getValue().getLibelleProduit().equals(nomProduit)) {
                return true;
            }
        }
        return false;

    }

    public boolean existeProduitById(Connexion co, int idProduit) {
        return prodMap.containsKey(idProduit);

    }

    public void ajoutStock(Connexion co, Integer idProduit, Integer qte) {
        co.connect();
        co.update("UPDATE Produits SET Stock=Stock + " + qte + " WHERE idProduit = " + idProduit);
        co.close();
    }

    
}
