package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "piste", schema = "dbo", catalog = "CUIB")
@IdClass(PisteEntityPK.class)
public class PisteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EAN13")
    private String ean13;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_piste")
    private int idPiste;
    @Basic
    @Column(name = "nom_piste")
    private String nomPiste;
    @Basic
    @Column(name = "duree")
    private Object duree;
    @Basic
    @Column(name = "id_personne")
    private int idPersonne;
    @Basic
    @Column(name = "id_personne_est_parolier")
    private Integer idPersonneEstParolier;
    @Basic
    @Column(name = "id_personne_est_compositeur")
    private Integer idPersonneEstCompositeur;

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public int getIdPiste() {
        return idPiste;
    }

    public void setIdPiste(int idPiste) {
        this.idPiste = idPiste;
    }

    public String getNomPiste() {
        return nomPiste;
    }

    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }

    public Object getDuree() {
        return duree;
    }

    public void setDuree(Object duree) {
        this.duree = duree;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Integer getIdPersonneEstParolier() {
        return idPersonneEstParolier;
    }

    public void setIdPersonneEstParolier(Integer idPersonneEstParolier) {
        this.idPersonneEstParolier = idPersonneEstParolier;
    }

    public Integer getIdPersonneEstCompositeur() {
        return idPersonneEstCompositeur;
    }

    public void setIdPersonneEstCompositeur(Integer idPersonneEstCompositeur) {
        this.idPersonneEstCompositeur = idPersonneEstCompositeur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PisteEntity that = (PisteEntity) o;

        if (idPiste != that.idPiste) return false;
        if (idPersonne != that.idPersonne) return false;
        if (ean13 != null ? !ean13.equals(that.ean13) : that.ean13 != null) return false;
        if (nomPiste != null ? !nomPiste.equals(that.nomPiste) : that.nomPiste != null) return false;
        if (duree != null ? !duree.equals(that.duree) : that.duree != null) return false;
        if (idPersonneEstParolier != null ? !idPersonneEstParolier.equals(that.idPersonneEstParolier) : that.idPersonneEstParolier != null)
            return false;
        if (idPersonneEstCompositeur != null ? !idPersonneEstCompositeur.equals(that.idPersonneEstCompositeur) : that.idPersonneEstCompositeur != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ean13 != null ? ean13.hashCode() : 0;
        result = 31 * result + idPiste;
        result = 31 * result + (nomPiste != null ? nomPiste.hashCode() : 0);
        result = 31 * result + (duree != null ? duree.hashCode() : 0);
        result = 31 * result + idPersonne;
        result = 31 * result + (idPersonneEstParolier != null ? idPersonneEstParolier.hashCode() : 0);
        result = 31 * result + (idPersonneEstCompositeur != null ? idPersonneEstCompositeur.hashCode() : 0);
        return result;
    }
}
