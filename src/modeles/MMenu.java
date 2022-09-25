
package modeles;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author darch
 */
public class MMenu {
    
    private String icone;
    private String nom;
    private MenuType type;

    public MMenu(String icone, String nom, MenuType type) {
        this.icone = icone;
        this.nom = nom;
        this.type = type;
    }
    
    

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }
    
    public Icon toIcon() {
        return new ImageIcon(getClass().getResource("/icones/"+icone+".png"));
    }
    
    public static enum MenuType {
        TITLE,MENU,EMPTY
    }
}
