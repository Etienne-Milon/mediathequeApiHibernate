package fr.em.mediathequeapihibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur", schema = "dbo", catalog = "CUIB")
public class UtilisateurEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_utilisateur")
    private int idUtilisateur;
    @Basic
    @Column(name = "nom_utilisateur")
    private String nomUtilisateur;
    @Basic
    @Column(name = "num_adherent")
    private int numAdherent;

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public int getNumAdherent() {
        return numAdherent;
    }

    public void setNumAdherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UtilisateurEntity that = (UtilisateurEntity) o;

        if (idUtilisateur != that.idUtilisateur) return false;
        if (numAdherent != that.numAdherent) return false;
        if (nomUtilisateur != null ? !nomUtilisateur.equals(that.nomUtilisateur) : that.nomUtilisateur != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUtilisateur;
        result = 31 * result + (nomUtilisateur != null ? nomUtilisateur.hashCode() : 0);
        result = 31 * result + numAdherent;
        return result;
    }
}
