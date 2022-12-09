package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "avoir_genre", schema = "dbo", catalog = "CUIB")
@IdClass(AvoirGenreEntityPK.class)
public class AvoirGenreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EAN13")
    private String ean13;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_genre")
    private int idGenre;

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AvoirGenreEntity that = (AvoirGenreEntity) o;

        if (idGenre != that.idGenre) return false;
        if (ean13 != null ? !ean13.equals(that.ean13) : that.ean13 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ean13 != null ? ean13.hashCode() : 0;
        result = 31 * result + idGenre;
        return result;
    }
}
