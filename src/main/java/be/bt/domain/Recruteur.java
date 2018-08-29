package be.bt.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="recruteurs")
@DiscriminatorValue("recruteurs")
public class Recruteur extends User {

    private String nomEntreprise;
    private String adresseEntreprise;
    private String numTel;
    private String siteWeb;
    @OneToMany(mappedBy="auteur")
    private List<Offre> offres;

    public Recruteur() {
        super();
    }

    public Recruteur(String login, String mdp, String nom, String prenom, String email, String nomEntreprise, String adresseEntreprise, String numTel, String siteWeb, List<Offre> offres) {
        super(login, mdp, nom, prenom, email);
        this.nomEntreprise = nomEntreprise;
        this.adresseEntreprise = adresseEntreprise;
        this.numTel = numTel;
        this.siteWeb = siteWeb;
        this.offres = offres;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getAdresseEntreprise() {
        return adresseEntreprise;
    }

    public void setAdresseEntreprise(String adresseEntreprise) {
        this.adresseEntreprise = adresseEntreprise;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public List<Offre> getOffres() {
        return offres;
    }

    public void setOffres(List<Offre> offres) {
        this.offres = offres;
    }

    @Override
    public String toString() {
        return "Recruteur{" +
                "nomEntreprise='" + nomEntreprise + '\'' +
                ", adresseEntreprise='" + adresseEntreprise + '\'' +
                ", numTel='" + numTel + '\'' +
                ", siteWeb='" + siteWeb + '\'' +
                ", offres=" + offres +
                '}';
    }
}
