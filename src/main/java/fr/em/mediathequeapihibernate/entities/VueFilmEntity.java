package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Vue_Film", schema = "dbo", catalog = "CUIB")
public class VueFilmEntity {
    @Basic
    @Column(name = "EAN13")
    private String ean13;
    @Basic
    @Column(name = "titre")
    private String titre;
    @Basic
    @Column(name = "id_editeur")
    private int idEditeur;
    @Basic
    @Column(name = "nom_editeur")
    private String nomEditeur;
    @Basic
    @Column(name = "id_genre")
    private int idGenre;
    @Basic
    @Column(name = "nom_genre")
    private String nomGenre;
    @Basic
    @Column(name = "id_langue")
    private int idLangue;
    @Basic
    @Column(name = "Expr1")
    private int expr1;
    @Basic
    @Column(name = "id_personne_realisateur")
    private int idPersonneRealisateur;
    @Basic
    @Column(name = "nom_realisateur")
    private String nomRealisateur;
    @Basic
    @Column(name = "id_personne_acteur")
    private int idPersonneActeur;
    @Basic
    @Column(name = "nom_acteur")
    private String nomActeur;
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

    public int getIdEditeur() {
        return idEditeur;
    }

    public void setIdEditeur(int idEditeur) {
        this.idEditeur = idEditeur;
    }

    public String getNomEditeur() {
        return nomEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    public String getNomGenre() {
        return nomGenre;
    }

    public void setNomGenre(String nomGenre) {
        this.nomGenre = nomGenre;
    }

    public int getIdLangue() {
        return idLangue;
    }

    public void setIdLangue(int idLangue) {
        this.idLangue = idLangue;
    }

    public int getExpr1() {
        return expr1;
    }

    public void setExpr1(int expr1) {
        this.expr1 = expr1;
    }

    public int getIdPersonneRealisateur() {
        return idPersonneRealisateur;
    }

    public void setIdPersonneRealisateur(int idPersonneRealisateur) {
        this.idPersonneRealisateur = idPersonneRealisateur;
    }

    public String getNomRealisateur() {
        return nomRealisateur;
    }

    public void setNomRealisateur(String nomRealisateur) {
        this.nomRealisateur = nomRealisateur;
    }

    public int getIdPersonneActeur() {
        return idPersonneActeur;
    }

    public void setIdPersonneActeur(int idPersonneActeur) {
        this.idPersonneActeur = idPersonneActeur;
    }

    public String getNomActeur() {
        return nomActeur;
    }

    public void setNomActeur(String nomActeur) {
        this.nomActeur = nomActeur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VueFilmEntity that = (VueFilmEntity) o;

        if (idEditeur != that.idEditeur) return false;
        if (idGenre != that.idGenre) return false;
        if (idLangue != that.idLangue) return false;
        if (expr1 != that.expr1) return false;
        if (idPersonneRealisateur != that.idPersonneRealisateur) return false;
        if (idPersonneActeur != that.idPersonneActeur) return false;
        if (ean13 != null ? !ean13.equals(that.ean13) : that.ean13 != null) return false;
        if (titre != null ? !titre.equals(that.titre) : that.titre != null) return false;
        if (nomEditeur != null ? !nomEditeur.equals(that.nomEditeur) : that.nomEditeur != null) return false;
        if (nomGenre != null ? !nomGenre.equals(that.nomGenre) : that.nomGenre != null) return false;
        if (nomRealisateur != null ? !nomRealisateur.equals(that.nomRealisateur) : that.nomRealisateur != null)
            return false;
        if (nomActeur != null ? !nomActeur.equals(that.nomActeur) : that.nomActeur != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ean13 != null ? ean13.hashCode() : 0;
        result = 31 * result + (titre != null ? titre.hashCode() : 0);
        result = 31 * result + idEditeur;
        result = 31 * result + (nomEditeur != null ? nomEditeur.hashCode() : 0);
        result = 31 * result + idGenre;
        result = 31 * result + (nomGenre != null ? nomGenre.hashCode() : 0);
        result = 31 * result + idLangue;
        result = 31 * result + expr1;
        result = 31 * result + idPersonneRealisateur;
        result = 31 * result + (nomRealisateur != null ? nomRealisateur.hashCode() : 0);
        result = 31 * result + idPersonneActeur;
        result = 31 * result + (nomActeur != null ? nomActeur.hashCode() : 0);
        return result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
