package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Personne", schema = "dbo", catalog = "CUIB")
public class PersonneEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_personne")
    private int idPersonne;
    @Basic
    @Column(name = "nom")
    private String nom;

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
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

        PersonneEntity that = (PersonneEntity) o;

        if (idPersonne != that.idPersonne) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPersonne;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        return result;
    }
}
