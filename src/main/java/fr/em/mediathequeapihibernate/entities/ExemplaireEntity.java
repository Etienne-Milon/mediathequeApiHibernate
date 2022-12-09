package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@NamedQuery(name = "exemplaire.getAll", query = "SELECT e FROM ExemplaireEntity e ORDER BY e.ean13")
@Table(name = "EXEMPLAIRE", schema = "dbo", catalog = "CUIB")
@IdClass(ExemplaireEntityPK.class)
public class ExemplaireEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EAN13")
    private String ean13;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "num_exemplaire")
    private int numExemplaire;
    @Basic
    @Column(name = "id_mediatheque")
    private int idMediatheque;
    @Basic
    @Column(name = "id_etat")
    private int idEtat;

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
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

    public int getIdEtat() {
        return idEtat;
    }

    public void setIdEtat(int idEtat) {
        this.idEtat = idEtat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExemplaireEntity that = (ExemplaireEntity) o;

        if (numExemplaire != that.numExemplaire) return false;
        if (idMediatheque != that.idMediatheque) return false;
        if (idEtat != that.idEtat) return false;
        if (ean13 != null ? !ean13.equals(that.ean13) : that.ean13 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ean13 != null ? ean13.hashCode() : 0;
        result = 31 * result + numExemplaire;
        result = 31 * result + idMediatheque;
        result = 31 * result + idEtat;
        return result;
    }
}
