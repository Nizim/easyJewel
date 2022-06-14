package controleurs;

import static controleurs.CCategorie.catMap;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import modeles.Categorie;
import modeles.Connexion;
import vues.Frame;

/**
 *
 * @author yd / ag
 */
public class CPOAJava {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });

        
        //Connexion JDBC
        Connexion co = new Connexion();
        //Init controleurs
        CCategorie ccategorie = new CCategorie();
        ccategorie.getCategorieFromDB(co);
        CProduit cproduit = new CProduit();
        
        for (HashMap.Entry<Integer, Categorie> entry : catMap.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue().getNomCategorie());
        }
   
        
    }

}
