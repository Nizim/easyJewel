/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeles;

/**
 *
 * @author darch
 */
public class Produit {
    private int idProduit;
    private String libelleProduit;
    private Categorie categorieProduit;
    private Image imageProduit;
    private int stockProduit;

    public Produit(int idProduit, String libelleProduit, Categorie categorieProduit, int stockProduit) {
        this.idProduit = idProduit;
        this.libelleProduit = libelleProduit;
        this.categorieProduit = categorieProduit;
        this.stockProduit = stockProduit;
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

    public Image getImageProduit() {
        return imageProduit;
    }

    public void setImageProduit(Image imageProduit) {
        this.imageProduit = imageProduit;
    }

    public int getStockProduit() {
        return stockProduit;
    }

    public void setStockProduit(int stockProduit) {
        this.stockProduit = stockProduit;
    }
    
    
    
    
    
}
