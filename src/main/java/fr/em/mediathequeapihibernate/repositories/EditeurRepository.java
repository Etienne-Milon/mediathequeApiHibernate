package fr.em.mediathequeapihibernate.repositories;

import fr.em.mediathequeapihibernate.dto.EditeurDto;
import fr.em.mediathequeapihibernate.entities.EditeurEntity;
import fr.em.mediathequeapihibernate.entities.GenreEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;

import java.util.List;

public class EditeurRepository {


    private EntityManager entityManager = Persistence.createEntityManagerFactory("fr.em.cuib").createEntityManager();


    public List<EditeurDto> getAll() {
        return EditeurDto.toEditeurDto(entityManager.createNamedQuery("editeur.getAll", EditeurEntity.class).getResultList());
    }

    public EditeurEntity getById(int id) {
        EditeurEntity editeur = entityManager.find(EditeurEntity.class, id);
        return editeur;
    }

    @Transactional
    public boolean update(EditeurDto editeur) {
        EditeurEntity updatingEditeur = getById(editeur.getId());
        if (updatingEditeur == null) return false;
        updatingEditeur.setNomEditeur(editeur.getNom());
        entityManager.getTransaction().begin();
        entityManager.merge(editeur);
        entityManager.getTransaction().commit();
        return true;
    }

    @Transactional
    public void create(EditeurEntity editeur) {
        entityManager.getTransaction().begin();
        entityManager.persist(editeur);
        entityManager.getTransaction().commit();
    }

    @Transactional
    public boolean delete(EditeurEntity editeur) {
        EditeurEntity deletingEditeur = getById(editeur.getIdEditeur());
        if (deletingEditeur == null)
            return false;
        entityManager.getTransaction().begin();
        entityManager.remove(deletingEditeur);
        entityManager.getTransaction().commit();
        return true;
    }
}

