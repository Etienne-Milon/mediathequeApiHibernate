package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "faire_partie", schema = "dbo", catalog = "CUIB")
@IdClass(FairePartieEntityPK.class)
public class FairePartieEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_personne")
    private int idPersonne;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_personne_faire_partie")
    private int idPersonneFairePartie;
    @Basic
    @Column(name = "nom_groupe")
    private String nomGroupe;

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public int getIdPersonneFairePartie() {
        return idPersonneFairePartie;
    }

    public void setIdPersonneFairePartie(int idPersonneFairePartie) {
        this.idPersonneFairePartie = idPersonneFairePartie;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FairePartieEntity that = (FairePartieEntity) o;

        if (idPersonne != that.idPersonne) return false;
        if (idPersonneFairePartie != that.idPersonneFairePartie) return false;
        if (nomGroupe != null ? !nomGroupe.equals(that.nomGroupe) : that.nomGroupe != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPersonne;
        result = 31 * result + idPersonneFairePartie;
        result = 31 * result + (nomGroupe != null ? nomGroupe.hashCode() : 0);
        return result;
    }
}
