package controleurs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import modeles.Avis;
import modeles.Connexion;

public class CAvis {

    public Connexion co;
    public HashMap<String, Avis> avisMap;

    public CAvis(Connexion co) {
        setCo(co);
        getAvisFromDB();
    }

    public void setCo(Connexion co) {
        this.co = co;
    }

    public void getAvisFromDB() {
        co.connect();
        ResultSet rsp = co.select("SELECT * FROM Commentaires");

        try {
            avisMap = new HashMap<String, Avis>();
            while (rsp.next()) {
                int idUser = rsp.getInt(1);
                int idProduit = rsp.getInt(2);
                String contenu = rsp.getString(3);
                String date = rsp.getString(4);
                
                Avis avis = new Avis(idUser, idProduit, contenu, date);
                avisMap.put(contenu, avis);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        co.close();
    }

    public HashMap<String, Avis> getAvis() {
        return avisMap;
    }

    public void supprimerAvis(Connexion co, int idUser, int idProduit) {
        co.connect();
        co.update("DELETE FROM Commentaires WHERE id_source_utilisateur = '" + idUser + "' and id_source_produit = '" + idProduit + "'");
        co.close();
    }

    public DefaultTableModel fillAvisTable() {
        getAvisFromDB();
        DefaultTableModel model = createTableModel();
        for (Map.Entry<String, Avis> prod : avisMap.entrySet()) {
            
            int idUser = prod.getValue().getUser();
            int idProduit = prod.getValue().getProduit();
            String contenu = prod.getValue().getContenu();
            String date = prod.getKey();
            
            model.addRow(new Object[]{idUser, idProduit, contenu, date});
        }
        return model;
    }

    public DefaultTableModel createTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        Object[] column = {"Utilisateur", "Produit", "Contenu", "Date"};
        model.setColumnIdentifiers(column);
        return model;
    }


    public boolean existeIdAvis(Integer id) {
        return avisMap.containsKey(id);
    }

    
}


