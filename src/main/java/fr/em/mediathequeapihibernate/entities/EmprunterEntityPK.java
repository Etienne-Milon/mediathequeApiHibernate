package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class EmprunterEntityPK implements Serializable {
    @Column(name = "id_utilisateur")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUtilisateur;
    @Column(name = "EAN13")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ean13;
    @Column(name = "num_exemplaire")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numExemplaire;

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public int getNumExemplaire() {
        return numExemplaire;
    }

    public void setNumExemplaire(int numExemplaire) {
        this.numExemplaire = numExemplaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmprunterEntityPK that = (EmprunterEntityPK) o;

        if (idUtilisateur != that.idUtilisateur) return false;
        if (numExemplaire != that.numExemplaire) return false;
        if (ean13 != null ? !ean13.equals(that.ean13) : that.ean13 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUtilisateur;
        result = 31 * result + (ean13 != null ? ean13.hashCode() : 0);
        result = 31 * result + numExemplaire;
        return result;
    }
}
