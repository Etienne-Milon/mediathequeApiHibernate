package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "compte", schema = "dbo", catalog = "CUIB")
public class CompteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "num_adherent")
    private int numAdherent;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "prenom")
    private String prenom;
    @Basic
    @Column(name = "adresse")
    private String adresse;
    @Basic
    @Column(name = "codepostal")
    private String codepostal;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "passwordhash")
    private String passwordhash;
    @Basic
    @Column(name = "date_debut_adhesion")
    private Date dateDebutAdhesion;
    @Basic
    @Column(name = "date_fin_adhesion")
    private Date dateFinAdhesion;

    public int getNumAdherent() {
        return numAdherent;
    }

    public void setNumAdherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordhash() {
        return passwordhash;
    }

    public void setPasswordhash(String passwordhash) {
        this.passwordhash = passwordhash;
    }

    public Date getDateDebutAdhesion() {
        return dateDebutAdhesion;
    }

    public void setDateDebutAdhesion(Date dateDebutAdhesion) {
        this.dateDebutAdhesion = dateDebutAdhesion;
    }

    public Date getDateFinAdhesion() {
        return dateFinAdhesion;
    }

    public void setDateFinAdhesion(Date dateFinAdhesion) {
        this.dateFinAdhesion = dateFinAdhesion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompteEntity that = (CompteEntity) o;

        if (numAdherent != that.numAdherent) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (prenom != null ? !prenom.equals(that.prenom) : that.prenom != null) return false;
        if (adresse != null ? !adresse.equals(that.adresse) : that.adresse != null) return false;
        if (codepostal != null ? !codepostal.equals(that.codepostal) : that.codepostal != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (passwordhash != null ? !passwordhash.equals(that.passwordhash) : that.passwordhash != null) return false;
        if (dateDebutAdhesion != null ? !dateDebutAdhesion.equals(that.dateDebutAdhesion) : that.dateDebutAdhesion != null)
            return false;
        if (dateFinAdhesion != null ? !dateFinAdhesion.equals(that.dateFinAdhesion) : that.dateFinAdhesion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numAdherent;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (codepostal != null ? codepostal.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (passwordhash != null ? passwordhash.hashCode() : 0);
        result = 31 * result + (dateDebutAdhesion != null ? dateDebutAdhesion.hashCode() : 0);
        result = 31 * result + (dateFinAdhesion != null ? dateFinAdhesion.hashCode() : 0);
        return result;
    }
}
