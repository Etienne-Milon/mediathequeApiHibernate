package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@NamedQuery(name ="etat.getAll", query = "SELECT e FROM EtatEntity e order by e.id")
@Table(name = "etat", schema = "dbo", catalog = "CUIB")
public class EtatEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "libelle_etat")
    private String libelleEtat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelleEtat() {
        return libelleEtat;
    }

    public void setLibelleEtat(String libelleEtat) {
        this.libelleEtat = libelleEtat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EtatEntity that = (EtatEntity) o;

        if (id != that.id) return false;
        if (libelleEtat != null ? !libelleEtat.equals(that.libelleEtat) : that.libelleEtat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (libelleEtat != null ? libelleEtat.hashCode() : 0);
        return result;
    }
}
