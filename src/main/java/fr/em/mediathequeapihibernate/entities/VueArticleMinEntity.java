package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Vue_Article_Min", schema = "dbo", catalog = "CUIB")
public class VueArticleMinEntity {
    @Basic
    @Column(name = "EAN13")
    private String ean13;
    @Basic
    @Column(name = "titre")
    private String titre;
    @Basic
    @Column(name = "nom_editeur")
    private String nomEditeur;
    @Basic
    @Column(name = "libelle")
    private String libelle;
    @Id
    private Long id;

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNomEditeur() {
        return nomEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VueArticleMinEntity that = (VueArticleMinEntity) o;

        if (ean13 != null ? !ean13.equals(that.ean13) : that.ean13 != null) return false;
        if (titre != null ? !titre.equals(that.titre) : that.titre != null) return false;
        if (nomEditeur != null ? !nomEditeur.equals(that.nomEditeur) : that.nomEditeur != null) return false;
        if (libelle != null ? !libelle.equals(that.libelle) : that.libelle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ean13 != null ? ean13.hashCode() : 0;
        result = 31 * result + (titre != null ? titre.hashCode() : 0);
        result = 31 * result + (nomEditeur != null ? nomEditeur.hashCode() : 0);
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        return result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
