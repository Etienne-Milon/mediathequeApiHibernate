package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "mediatheque", schema = "dbo", catalog = "CUIB")
public class MediathequeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_mediatheque")
    private int idMediatheque;
    @Basic
    @Column(name = "nom")
    private String nom;

    public int getIdMediatheque() {
        return idMediatheque;
    }

    public void setIdMediatheque(int idMediatheque) {
        this.idMediatheque = idMediatheque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MediathequeEntity that = (MediathequeEntity) o;

        if (idMediatheque != that.idMediatheque) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMediatheque;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        return result;
    }
}
