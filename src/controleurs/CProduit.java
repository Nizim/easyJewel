package controleurs;

import java.sql.ResultSet;
import controleurs.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import modeles.Categorie;
import modeles.Produit;
import modeles.Connexion;
import controleurs.CCategorie;

/**
 *
 * @author darch
 */
public class CProduit {

    public static HashMap<Integer, Produit> prodMap;

    public CProduit() {
        this.prodMap = null;
    }

    public static HashMap<Integer, Produit> getProduits() {
        return prodMap;
    }

    public void getProduitsFromDB(Connexion co) {
        co.connect();
        ResultSet rsp = co.select("SELECT * FROM Produit");
        try {
            while (rsp.next()) {
                int idProduit = rsp.getInt(1);
                String libelleProduit = rsp.getString(2);
                int idCategorie = rsp.getInt(3);
                int idImage = rsp.getInt(4);
                int stockProduit = rsp.getInt(5);

                ResultSet rsc = co.select("SELECT nomCategorie FROM Categorie WHERE idCategorie = " + idCategorie);

                //Produit produit = new Produit(idProduit, libelleProduit, idCategorie, idImage, stockProduit);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        co.close();

    }

    public static HashMap<Integer, Produit> getProduits(Connexion co) {
        return prodMap;
    }

    public void ajoutProduit(Connexion co, String libelle, Integer idCat, Integer prix, String description) {
        co.connect();
        co.update("INSERT INTO Produits (idProduit, libelle, idCat, prix, description) "
                + "VALUES (null, '" + libelle + "'," + idCat + " ," + prix + ", '" + description + "')");
        co.close();
    }

    public void supprimerProduit(Connexion co, String libelle) {
        co.connect();
        if (existeProduit(co, libelle)) {
            co.update("DELETE FROM Produits WHERE libelle=" + libelle);
        }
        co.close();
    }

    public boolean existeProduit(Connexion co, String nomProduit) {

        getProduitsFromDB(co);
        HashMap<Integer, Produit> prodMap = getProduits();
        for (Map.Entry<Integer, Produit> prod : prodMap.entrySet()) {
            if (prod.getValue().getLibelleProduit().equals(nomProduit)) {
                return true;
            }
        }
        return false;

    }

}
