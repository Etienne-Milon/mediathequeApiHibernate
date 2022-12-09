package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "emprunter", schema = "dbo", catalog = "CUIB")
@IdClass(EmprunterEntityPK.class)
public class EmprunterEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_utilisateur")
    private int idUtilisateur;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EAN13")
    private String ean13;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "num_exemplaire")
    private int numExemplaire;
    @Basic
    @Column(name = "date_emprunt")
    private Date dateEmprunt;
    @Basic
    @Column(name = "date_retour")
    private Date dateRetour;

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

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmprunterEntity that = (EmprunterEntity) o;

        if (idUtilisateur != that.idUtilisateur) return false;
        if (numExemplaire != that.numExemplaire) return false;
        if (ean13 != null ? !ean13.equals(that.ean13) : that.ean13 != null) return false;
        if (dateEmprunt != null ? !dateEmprunt.equals(that.dateEmprunt) : that.dateEmprunt != null) return false;
        if (dateRetour != null ? !dateRetour.equals(that.dateRetour) : that.dateRetour != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUtilisateur;
        result = 31 * result + (ean13 != null ? ean13.hashCode() : 0);
        result = 31 * result + numExemplaire;
        result = 31 * result + (dateEmprunt != null ? dateEmprunt.hashCode() : 0);
        result = 31 * result + (dateRetour != null ? dateRetour.hashCode() : 0);
        return result;
    }
}
