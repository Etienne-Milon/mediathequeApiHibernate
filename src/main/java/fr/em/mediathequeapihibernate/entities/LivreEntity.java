package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "livre", schema = "dbo", catalog = "CUIB")
public class LivreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EAN13")
    private String ean13;
    @Basic
    @Column(name = "id_personne")
    private Integer idPersonne;

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public Integer getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Integer idPersonne) {
        this.idPersonne = idPersonne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LivreEntity that = (LivreEntity) o;

        if (ean13 != null ? !ean13.equals(that.ean13) : that.ean13 != null) return false;
        if (idPersonne != null ? !idPersonne.equals(that.idPersonne) : that.idPersonne != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ean13 != null ? ean13.hashCode() : 0;
        result = 31 * result + (idPersonne != null ? idPersonne.hashCode() : 0);
        return result;
    }
}
