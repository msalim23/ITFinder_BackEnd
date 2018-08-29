package be.bt.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="offres")
public class Offre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String titre;
    private String description;
    private boolean status;
    @ManyToMany
    private List<Demandeur> candidats;
    @JsonIgnore
    @ManyToOne
    private Recruteur auteur;

    public Offre() {
    }

    public Offre(String titre, String description, boolean status, Recruteur auteur,List<Demandeur> candidats) {
        this.titre = titre;
        this.description = description;
        this.status = status;
        this.candidats = candidats;
        this.auteur = auteur;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public Recruteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Recruteur auteur) {
        this.auteur = auteur;
    }

    public List<Demandeur> getCandidats() {
        return candidats;
    }

    public void setCandidats(List<Demandeur> candidats) {
        this.candidats = candidats;
    }

    @Override
    public String toString() {
        return "Offre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", candidats=" + candidats +
                ", auteur=" + auteur +
                '}';
    }
}
