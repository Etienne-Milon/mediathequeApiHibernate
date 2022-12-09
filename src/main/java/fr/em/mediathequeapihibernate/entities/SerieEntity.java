package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "serie", schema = "dbo", catalog = "CUIB")
public class SerieEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_serie")
    private int idSerie;
    @Basic
    @Column(name = "nom_serie")
    private String nomSerie;

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public String getNomSerie() {
        return nomSerie;
    }

    public void setNomSerie(String nomSerie) {
        this.nomSerie = nomSerie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SerieEntity that = (SerieEntity) o;

        if (idSerie != that.idSerie) return false;
        if (nomSerie != null ? !nomSerie.equals(that.nomSerie) : that.nomSerie != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSerie;
        result = 31 * result + (nomSerie != null ? nomSerie.hashCode() : 0);
        return result;
    }
}
