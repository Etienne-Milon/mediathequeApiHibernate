package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NamedQuery(name = "genre.getAll", query = "SELECT g FROM GenreEntity g ORDER BY g.idGenre")
@Table(name = "genre", schema = "dbo", catalog = "CUIB")
public class GenreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_genre")
    private int idGenre;
    @Basic
    @Column(name = "nom_genre")
    private String nomGenre;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "genres")
    private List<ArticleEntity> articles;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenreEntity that = (GenreEntity) o;

        if (idGenre != that.idGenre) return false;
        if (nomGenre != null ? !nomGenre.equals(that.nomGenre) : that.nomGenre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGenre;
        result = 31 * result + (nomGenre != null ? nomGenre.hashCode() : 0);
        return result;
    }
}
