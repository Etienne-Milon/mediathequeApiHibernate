package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "format", schema = "dbo", catalog = "CUIB")
public class FormatEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_format")
    private int idFormat;
    @Basic
    @Column(name = "libelle")
    private String libelle;

    public int getIdFormat() {
        return idFormat;
    }

    public void setIdFormat(int idFormat) {
        this.idFormat = idFormat;
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

        FormatEntity that = (FormatEntity) o;

        if (idFormat != that.idFormat) return false;
        if (libelle != null ? !libelle.equals(that.libelle) : that.libelle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFormat;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        return result;
    }
}
