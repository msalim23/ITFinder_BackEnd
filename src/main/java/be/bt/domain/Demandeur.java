package be.bt.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="demandeurs")
@DiscriminatorValue("demandeurs")
public class Demandeur extends User {

    private String CV;
    private boolean actif;
    @ManyToMany(mappedBy = "candidats")
    private List<Offre> candidatures;

    public Demandeur() {
        super();
    }

    public Demandeur(String login, String mdp, String nom, String prenom, String email, String CV, boolean actif, List<Offre> candidatures) {
        super(login, mdp, nom, prenom, email);
        this.CV = CV;
        this.actif = actif;
        this.candidatures = candidatures;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public List<Offre> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(List<Offre> candidatures) {
        this.candidatures = candidatures;
    }


}
