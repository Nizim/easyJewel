
package modeles;

/**
 *
 * @author darch
 */
public class MHeadProduit {
    
    private Integer nb;
    private String categorie;

    public Integer getNb() {
        return nb;
    }

    public void setNb(Integer nb) {
        this.nb = nb;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public MHeadProduit(Integer nb, String categorie) {
        this.nb = nb;
        this.categorie = categorie;
    }
    
    
}
