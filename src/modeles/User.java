
package modeles;

/**
 *
 * @author darch
 */
public class User {
    private int identifiant;
    private String nomUtilisateur;
    private String password;
    private String statut;
    private String mail;
    private int nbAvertissement;

    public User(int identifiant, String nomUtilisateur, String password, String statut, String mail, int nbAvertissement) {
        this.identifiant = identifiant;
        this.nomUtilisateur = nomUtilisateur;
        this.password = password;
        this.statut = statut;
        this.mail = mail;
        this.nbAvertissement=nbAvertissement;
    }
    
    public void addAvertissement() {
        this.nbAvertissement+=1;
    }

    public int getNbAvertissement() {
        return nbAvertissement;
    }

    public void setNbAvertissement(int nbAvertissement) {
        this.nbAvertissement = nbAvertissement;
    }
    
    

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}
