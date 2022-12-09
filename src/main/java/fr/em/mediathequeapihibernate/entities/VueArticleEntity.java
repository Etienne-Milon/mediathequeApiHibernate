package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Vue_Article", schema = "dbo", catalog = "CUIB")
public class VueArticleEntity {
    @Basic
    @Column(name = "EAN13")
    private String ean13;
    @Basic
    @Column(name = "titre")
    private String titre;
    @Basic
    @Column(name = "prix_achat")
    private Object prixAchat;
    @Basic
    @Column(name = "grande_valeur")
    private boolean grandeValeur;
    @Basic
    @Column(name = "id_format")
    private int idFormat;
    @Basic
    @Column(name = "libelle_format")
    private String libelleFormat;
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
    @Column(name = "nom_langue")
    private String nomLangue;
    @Basic
    @Column(name = "id_serie")
    private Integer idSerie;
    @Basic
    @Column(name = "nom_serie")
    private String nomSerie;
    @Basic
    @Column(name = "id_editeur")
    private int idEditeur;
    @Basic
    @Column(name = "nom_editeur")
    private String nomEditeur;
    @Basic
    @Column(name = "id_personne_dessinateur")
    private Integer idPersonneDessinateur;
    @Basic
    @Column(name = "nom_dessinateur")
    private String nomDessinateur;
    @Basic
    @Column(name = "id_personne_auteur")
    private Integer idPersonneAuteur;
    @Basic
    @Column(name = "nom_auteur")
    private String nomAuteur;
    @Basic
    @Column(name = "id_personne_realisateur")
    private Integer idPersonneRealisateur;
    @Basic
    @Column(name = "nom_realisateur")
    private String nomRealisateur;
    @Basic
    @Column(name = "id_personne_acteur")
    private Integer idPersonneActeur;
    @Basic
    @Column(name = "nom_acteur")
    private String nomActeur;
    @Basic
    @Column(name = "id_piste")
    private Integer idPiste;
    @Basic
    @Column(name = "nom_piste")
    private String nomPiste;
    @Basic
    @Column(name = "duree")
    private Object duree;
    @Basic
    @Column(name = "id_personne_interprete")
    private Integer idPersonneInterprete;
    @Basic
    @Column(name = "nom_interprete")
    private String nomInterprete;
    @Basic
    @Column(name = "id_personne_est_parolier")
    private Integer idPersonneEstParolier;
    @Basic
    @Column(name = "nom_parolier")
    private String nomParolier;
    @Basic
    @Column(name = "id_personne_est_compositeur")
    private Integer idPersonneEstCompositeur;
    @Basic
    @Column(name = "nom_compositeur")
    private String nomCompositeur;
    @Basic
    @Column(name = "num_exemplaire")
    private int numExemplaire;
    @Basic
    @Column(name = "id_mediatheque")
    private int idMediatheque;
    @Basic
    @Column(name = "nom_mediatheque")
    private String nomMediatheque;
    @Basic
    @Column(name = "id_etat")
    private int idEtat;
    @Basic
    @Column(name = "libelle_etat")
    private String libelleEtat;
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

    public Object getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(Object prixAchat) {
        this.prixAchat = prixAchat;
    }

    public boolean isGrandeValeur() {
        return grandeValeur;
    }

    public void setGrandeValeur(boolean grandeValeur) {
        this.grandeValeur = grandeValeur;
    }

    public int getIdFormat() {
        return idFormat;
    }

    public void setIdFormat(int idFormat) {
        this.idFormat = idFormat;
    }

    public String getLibelleFormat() {
        return libelleFormat;
    }

    public void setLibelleFormat(String libelleFormat) {
        this.libelleFormat = libelleFormat;
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

    public String getNomLangue() {
        return nomLangue;
    }

    public void setNomLangue(String nomLangue) {
        this.nomLangue = nomLangue;
    }

    public Integer getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Integer idSerie) {
        this.idSerie = idSerie;
    }

    public String getNomSerie() {
        return nomSerie;
    }

    public void setNomSerie(String nomSerie) {
        this.nomSerie = nomSerie;
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

    public Integer getIdPersonneDessinateur() {
        return idPersonneDessinateur;
    }

    public void setIdPersonneDessinateur(Integer idPersonneDessinateur) {
        this.idPersonneDessinateur = idPersonneDessinateur;
    }

    public String getNomDessinateur() {
        return nomDessinateur;
    }

    public void setNomDessinateur(String nomDessinateur) {
        this.nomDessinateur = nomDessinateur;
    }

    public Integer getIdPersonneAuteur() {
        return idPersonneAuteur;
    }

    public void setIdPersonneAuteur(Integer idPersonneAuteur) {
        this.idPersonneAuteur = idPersonneAuteur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public Integer getIdPersonneRealisateur() {
        return idPersonneRealisateur;
    }

    public void setIdPersonneRealisateur(Integer idPersonneRealisateur) {
        this.idPersonneRealisateur = idPersonneRealisateur;
    }

    public String getNomRealisateur() {
        return nomRealisateur;
    }

    public void setNomRealisateur(String nomRealisateur) {
        this.nomRealisateur = nomRealisateur;
    }

    public Integer getIdPersonneActeur() {
        return idPersonneActeur;
    }

    public void setIdPersonneActeur(Integer idPersonneActeur) {
        this.idPersonneActeur = idPersonneActeur;
    }

    public String getNomActeur() {
        return nomActeur;
    }

    public void setNomActeur(String nomActeur) {
        this.nomActeur = nomActeur;
    }

    public Integer getIdPiste() {
        return idPiste;
    }

    public void setIdPiste(Integer idPiste) {
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

    public Integer getIdPersonneInterprete() {
        return idPersonneInterprete;
    }

    public void setIdPersonneInterprete(Integer idPersonneInterprete) {
        this.idPersonneInterprete = idPersonneInterprete;
    }

    public String getNomInterprete() {
        return nomInterprete;
    }

    public void setNomInterprete(String nomInterprete) {
        this.nomInterprete = nomInterprete;
    }

    public Integer getIdPersonneEstParolier() {
        return idPersonneEstParolier;
    }

    public void setIdPersonneEstParolier(Integer idPersonneEstParolier) {
        this.idPersonneEstParolier = idPersonneEstParolier;
    }

    public String getNomParolier() {
        return nomParolier;
    }

    public void setNomParolier(String nomParolier) {
        this.nomParolier = nomParolier;
    }

    public Integer getIdPersonneEstCompositeur() {
        return idPersonneEstCompositeur;
    }

    public void setIdPersonneEstCompositeur(Integer idPersonneEstCompositeur) {
        this.idPersonneEstCompositeur = idPersonneEstCompositeur;
    }

    public String getNomCompositeur() {
        return nomCompositeur;
    }

    public void setNomCompositeur(String nomCompositeur) {
        this.nomCompositeur = nomCompositeur;
    }

    public int getNumExemplaire() {
        return numExemplaire;
    }

    public void setNumExemplaire(int numExemplaire) {
        this.numExemplaire = numExemplaire;
    }

    public int getIdMediatheque() {
        return idMediatheque;
    }

    public void setIdMediatheque(int idMediatheque) {
        this.idMediatheque = idMediatheque;
    }

    public String getNomMediatheque() {
        return nomMediatheque;
    }

    public void setNomMediatheque(String nomMediatheque) {
        this.nomMediatheque = nomMediatheque;
    }

    public int getIdEtat() {
        return idEtat;
    }

    public void setIdEtat(int idEtat) {
        this.idEtat = idEtat;
    }

    public String getLibelleEtat() {
        return libelleEtat;
    }

    public void setLibelleEtat(String libelleEtat) {
        this.libelleEtat = libelleEtat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VueArticleEntity that = (VueArticleEntity) o;

        if (grandeValeur != that.grandeValeur) return false;
        if (idFormat != that.idFormat) return false;
        if (idGenre != that.idGenre) return false;
        if (idLangue != that.idLangue) return false;
        if (idEditeur != that.idEditeur) return false;
        if (numExemplaire != that.numExemplaire) return false;
        if (idMediatheque != that.idMediatheque) return false;
        if (idEtat != that.idEtat) return false;
        if (ean13 != null ? !ean13.equals(that.ean13) : that.ean13 != null) return false;
        if (titre != null ? !titre.equals(that.titre) : that.titre != null) return false;
        if (prixAchat != null ? !prixAchat.equals(that.prixAchat) : that.prixAchat != null) return false;
        if (libelleFormat != null ? !libelleFormat.equals(that.libelleFormat) : that.libelleFormat != null)
            return false;
        if (nomGenre != null ? !nomGenre.equals(that.nomGenre) : that.nomGenre != null) return false;
        if (nomLangue != null ? !nomLangue.equals(that.nomLangue) : that.nomLangue != null) return false;
        if (idSerie != null ? !idSerie.equals(that.idSerie) : that.idSerie != null) return false;
        if (nomSerie != null ? !nomSerie.equals(that.nomSerie) : that.nomSerie != null) return false;
        if (nomEditeur != null ? !nomEditeur.equals(that.nomEditeur) : that.nomEditeur != null) return false;
        if (idPersonneDessinateur != null ? !idPersonneDessinateur.equals(that.idPersonneDessinateur) : that.idPersonneDessinateur != null)
            return false;
        if (nomDessinateur != null ? !nomDessinateur.equals(that.nomDessinateur) : that.nomDessinateur != null)
            return false;
        if (idPersonneAuteur != null ? !idPersonneAuteur.equals(that.idPersonneAuteur) : that.idPersonneAuteur != null)
            return false;
        if (nomAuteur != null ? !nomAuteur.equals(that.nomAuteur) : that.nomAuteur != null) return false;
        if (idPersonneRealisateur != null ? !idPersonneRealisateur.equals(that.idPersonneRealisateur) : that.idPersonneRealisateur != null)
            return false;
        if (nomRealisateur != null ? !nomRealisateur.equals(that.nomRealisateur) : that.nomRealisateur != null)
            return false;
        if (idPersonneActeur != null ? !idPersonneActeur.equals(that.idPersonneActeur) : that.idPersonneActeur != null)
            return false;
        if (nomActeur != null ? !nomActeur.equals(that.nomActeur) : that.nomActeur != null) return false;
        if (idPiste != null ? !idPiste.equals(that.idPiste) : that.idPiste != null) return false;
        if (nomPiste != null ? !nomPiste.equals(that.nomPiste) : that.nomPiste != null) return false;
        if (duree != null ? !duree.equals(that.duree) : that.duree != null) return false;
        if (idPersonneInterprete != null ? !idPersonneInterprete.equals(that.idPersonneInterprete) : that.idPersonneInterprete != null)
            return false;
        if (nomInterprete != null ? !nomInterprete.equals(that.nomInterprete) : that.nomInterprete != null)
            return false;
        if (idPersonneEstParolier != null ? !idPersonneEstParolier.equals(that.idPersonneEstParolier) : that.idPersonneEstParolier != null)
            return false;
        if (nomParolier != null ? !nomParolier.equals(that.nomParolier) : that.nomParolier != null) return false;
        if (idPersonneEstCompositeur != null ? !idPersonneEstCompositeur.equals(that.idPersonneEstCompositeur) : that.idPersonneEstCompositeur != null)
            return false;
        if (nomCompositeur != null ? !nomCompositeur.equals(that.nomCompositeur) : that.nomCompositeur != null)
            return false;
        if (nomMediatheque != null ? !nomMediatheque.equals(that.nomMediatheque) : that.nomMediatheque != null)
            return false;
        if (libelleEtat != null ? !libelleEtat.equals(that.libelleEtat) : that.libelleEtat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ean13 != null ? ean13.hashCode() : 0;
        result = 31 * result + (titre != null ? titre.hashCode() : 0);
        result = 31 * result + (prixAchat != null ? prixAchat.hashCode() : 0);
        result = 31 * result + (grandeValeur ? 1 : 0);
        result = 31 * result + idFormat;
        result = 31 * result + (libelleFormat != null ? libelleFormat.hashCode() : 0);
        result = 31 * result + idGenre;
        result = 31 * result + (nomGenre != null ? nomGenre.hashCode() : 0);
        result = 31 * result + idLangue;
        result = 31 * result + (nomLangue != null ? nomLangue.hashCode() : 0);
        result = 31 * result + (idSerie != null ? idSerie.hashCode() : 0);
        result = 31 * result + (nomSerie != null ? nomSerie.hashCode() : 0);
        result = 31 * result + idEditeur;
        result = 31 * result + (nomEditeur != null ? nomEditeur.hashCode() : 0);
        result = 31 * result + (idPersonneDessinateur != null ? idPersonneDessinateur.hashCode() : 0);
        result = 31 * result + (nomDessinateur != null ? nomDessinateur.hashCode() : 0);
        result = 31 * result + (idPersonneAuteur != null ? idPersonneAuteur.hashCode() : 0);
        result = 31 * result + (nomAuteur != null ? nomAuteur.hashCode() : 0);
        result = 31 * result + (idPersonneRealisateur != null ? idPersonneRealisateur.hashCode() : 0);
        result = 31 * result + (nomRealisateur != null ? nomRealisateur.hashCode() : 0);
        result = 31 * result + (idPersonneActeur != null ? idPersonneActeur.hashCode() : 0);
        result = 31 * result + (nomActeur != null ? nomActeur.hashCode() : 0);
        result = 31 * result + (idPiste != null ? idPiste.hashCode() : 0);
        result = 31 * result + (nomPiste != null ? nomPiste.hashCode() : 0);
        result = 31 * result + (duree != null ? duree.hashCode() : 0);
        result = 31 * result + (idPersonneInterprete != null ? idPersonneInterprete.hashCode() : 0);
        result = 31 * result + (nomInterprete != null ? nomInterprete.hashCode() : 0);
        result = 31 * result + (idPersonneEstParolier != null ? idPersonneEstParolier.hashCode() : 0);
        result = 31 * result + (nomParolier != null ? nomParolier.hashCode() : 0);
        result = 31 * result + (idPersonneEstCompositeur != null ? idPersonneEstCompositeur.hashCode() : 0);
        result = 31 * result + (nomCompositeur != null ? nomCompositeur.hashCode() : 0);
        result = 31 * result + numExemplaire;
        result = 31 * result + idMediatheque;
        result = 31 * result + (nomMediatheque != null ? nomMediatheque.hashCode() : 0);
        result = 31 * result + idEtat;
        result = 31 * result + (libelleEtat != null ? libelleEtat.hashCode() : 0);
        return result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
