package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NamedQuery(name = "article.getAll", query = "SELECT a FROM ArticleEntity a ORDER BY a.ean13")
@Table(name = "ARTICLE", schema = "dbo", catalog = "CUIB")
public class ArticleEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EAN13")
    private String ean13;
    @Basic
    @Column(name = "prix_achat")
    private Object prixAchat;
    @Basic
    @Column(name = "titre")
    private String titre;
    @Basic
    @Column(name = "grande_valeur")
    private boolean grandeValeur;

    @ManyToOne
    @JoinColumn(name = "id_editeur")
    private EditeurEntity editeur;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "avoir_genre",
            joinColumns = {@JoinColumn(name = "ean13")},
            inverseJoinColumns = {@JoinColumn(name = "id_genre")}
    )
    private List<GenreEntity> genres;

    @Basic
    @Column(name = "id_format")
    private int idFormat;
    @Basic
    @Column(name = "id_serie")
    private Integer idSerie;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleEntity that = (ArticleEntity) o;

        if (grandeValeur != that.grandeValeur) return false;
        if (editeur != that.editeur) return false;
        if (idFormat != that.idFormat) return false;
        if (ean13 != null ? !ean13.equals(that.ean13) : that.ean13 != null) return false;
        if (prixAchat != null ? !prixAchat.equals(that.prixAchat) : that.prixAchat != null) return false;
        if (titre != null ? !titre.equals(that.titre) : that.titre != null) return false;
        if (idSerie != null ? !idSerie.equals(that.idSerie) : that.idSerie != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ean13 != null ? ean13.hashCode() : 0;
        result = 31 * result + (prixAchat != null ? prixAchat.hashCode() : 0);
        result = 31 * result + (titre != null ? titre.hashCode() : 0);
        result = 31 * result + (grandeValeur ? 1 : 0);
        result = 31 * result + editeur.getIdEditeur();
        result = 31 * result + idFormat;
        result = 31 * result + (idSerie != null ? idSerie.hashCode() : 0);
        return result;
    }
}
