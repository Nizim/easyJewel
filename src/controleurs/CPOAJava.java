package controleurs;

import modeles.Connexion;
import vues.Frame;

/**
 *
 * @author yd / ag
 */
public class CPOAJava {
    
    public static Connexion co;

    public static void main(String args[]) {

        //Connexion JDBC
        Connexion co = new Connexion();
        //Init controleurs
        CCategorie ccategorie = new CCategorie(co);
        ccategorie.setCo(co);
        CProduit cproduit = new CProduit(co);
        cproduit.setCo(co);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });

        
        
        
        
   
        
    }

}
