package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "langue", schema = "dbo", catalog = "CUIB")
public class LangueEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_langue")
    private int idLangue;
    @Basic
    @Column(name = "nom_langue")
    private String nomLangue;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LangueEntity that = (LangueEntity) o;

        if (idLangue != that.idLangue) return false;
        if (nomLangue != null ? !nomLangue.equals(that.nomLangue) : that.nomLangue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLangue;
        result = 31 * result + (nomLangue != null ? nomLangue.hashCode() : 0);
        return result;
    }
}
