
package modeles;

/**
 *
 * @author darch
 */
public class Produit {
    
    private int idProduit;
    private String libelleProduit;
    private float prix;
    private String description;
    private int stockProduit;
    private Categorie categorieProduit;
    private int nbComm;
    

    private int nbCommentaires;

    public Produit(int idProduit, String libelleProduit, Float prix, String description, int stockProduit, Categorie categorieProduit, int nbComm) {
        this.idProduit = idProduit;
        this.libelleProduit = libelleProduit;
        this.prix = prix;
        this.description = description;
        this.stockProduit = stockProduit;
        this.categorieProduit = categorieProduit;
        this.nbComm=nbComm;
    }

    public int getNbComm() {
        return nbComm;
    }

    public void setNbComm(int nbComm) {
        this.nbComm = nbComm;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public float getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getLibelleProduit() {
        return libelleProduit;
    }

    public void setLibelleProduit(String libelleProduit) {
        this.libelleProduit = libelleProduit;
    }

    public Categorie getCategorieProduit() {
        return categorieProduit;
    }

    public void setCategorieProduit(Categorie categorieProduit) {
        this.categorieProduit = categorieProduit;
    }

    public int getStockProduit() {
        return stockProduit;
    }

    public void setStockProduit(int stockProduit) {
        this.stockProduit = stockProduit;
    }
    
    public int getNbCommentaires() {
        return nbCommentaires;
    }

    public void setNbCommentaires(int nbCommentaires) {
        this.nbCommentaires = nbCommentaires;
    }
    
    
    
}
