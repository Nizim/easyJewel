package controleurs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import modeles.Connexion;
import modeles.Categorie;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JOptionPane;

/**
 *
 * @author darch
 */
public class CCategorie {
    
    public static HashMap<Integer, Categorie> catMap;

    public CCategorie() {
        this.catMap=null;
    }
    
    
    public void getCategorieFromDB(Connexion co) {
        ResultSet rsp = co.select("SELECT * FROM Categorie");
        
        try {
            catMap = new HashMap<Integer, Categorie>();
            while(rsp.next()) {
                int idCategorie = rsp.getInt(1);
                String nomCategorie = rsp.getString(2);
                
                Categorie categorie = new Categorie(idCategorie, nomCategorie);
                catMap.put(idCategorie, categorie);    
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    public static HashMap<Integer, Categorie> getCategorie() {
        return catMap;
    }
    
    
    public void ajoutCategorie(Connexion co, String nomCat) {
        co.connect();
        co.update("INSERT INTO Categorie (idCat, libelleCat) " + "VALUES (null, '" + nomCat + "')");
        co.close();
    }
    
    public void supprimerCategorie(Connexion co, String nomCat) {
        co.connect();
        if(existeCategorie(co, nomCat)) {
            co.update("DELETE FROM Categorie WHERE libelleCat = '" + nomCat + "'");
        } else {
            System.out.println("La catégorie n'existe pas");
        }
        co.close();
    }
    
    public void modifierCategorie(Connexion co, String nomCatEx, String nomCatNv) {
        co.connect();
        if(existeCategorie(co, nomCatNv)) {
            if(existeCategorie(co, nomCatEx)) {
                co.update("UPDATE Categorie SET libelleCat='" + nomCatNv + "' WHERE libelleCat='" + nomCatEx + "'");
            } else {
            }
        } else {
            System.out.println("La catégorie n'existe pas");
        }
        co.close();
    }
    
    public boolean existeCategorie(Connexion co, String nomCat) {
        
        getCategorieFromDB(co);
        HashMap<Integer, Categorie> catMap = getCategorie();
        for(Map.Entry<Integer, Categorie> cat : catMap.entrySet()) {
            if(cat.getValue().getNomCategorie().equals(nomCat)) {
                return true;
            }
        }
        return false;
        
    }
    
    public int getIdFromCategorie(HashMap<Integer, Categorie> catMap, String nomCat) {
        for(Map.Entry<Integer, Categorie> map : catMap.entrySet()){
            if (map.getValue().getNomCategorie().equals(nomCat)) {
                return map.getKey();
            }
        }
        return -1;
    }
    
}
