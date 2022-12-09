package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class FairePartieEntityPK implements Serializable {
    @Column(name = "id_personne")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonne;
    @Column(name = "id_personne_faire_partie")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonneFairePartie;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FairePartieEntityPK that = (FairePartieEntityPK) o;

        if (idPersonne != that.idPersonne) return false;
        if (idPersonneFairePartie != that.idPersonneFairePartie) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPersonne;
        result = 31 * result + idPersonneFairePartie;
        return result;
    }
}
