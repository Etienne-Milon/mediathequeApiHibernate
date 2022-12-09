package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NamedQuery(name = "editeur.getAll", query = "SELECT a FROM EditeurEntity a ORDER BY a.idEditeur")
@Table(name = "editeur", schema = "dbo", catalog = "CUIB")
public class EditeurEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_editeur")
    private int idEditeur;
    @Basic
    @Column(name = "nom_editeur")
    private String nomEditeur;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_editeur")
    private List<ArticleEntity> articles;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EditeurEntity that = (EditeurEntity) o;

        if (idEditeur != that.idEditeur) return false;
        if (nomEditeur != null ? !nomEditeur.equals(that.nomEditeur) : that.nomEditeur != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEditeur;
        result = 31 * result + (nomEditeur != null ? nomEditeur.hashCode() : 0);
        return result;
    }
}
