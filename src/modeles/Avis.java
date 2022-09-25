
package modeles;

/**
 *
 * @author darch
 */
public class Avis {
    private int user;
    private int produit;
    private String contenu;
    private String datePoste;

    public Avis(int user, int produit, String contenu, String datePoste) {
        this.user = user;
        this.produit = produit;
        this.contenu = contenu;
        this.datePoste = datePoste;
    }

    
    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getProduit() {
        return produit;
    }

    public void setProduit(int produit) {
        this.produit = produit;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getDatePoste() {
        return datePoste;
    }

    public void setDatePoste(String datePoste) {
        this.datePoste = datePoste;
    }

    
    
    
}
