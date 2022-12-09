package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class AvoirLangueEntityPK implements Serializable {
    @Column(name = "EAN13")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ean13;
    @Column(name = "id_langue")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLangue;

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public int getIdLangue() {
        return idLangue;
    }

    public void setIdLangue(int idLangue) {
        this.idLangue = idLangue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AvoirLangueEntityPK that = (AvoirLangueEntityPK) o;

        if (idLangue != that.idLangue) return false;
        if (ean13 != null ? !ean13.equals(that.ean13) : that.ean13 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ean13 != null ? ean13.hashCode() : 0;
        result = 31 * result + idLangue;
        return result;
    }
}
