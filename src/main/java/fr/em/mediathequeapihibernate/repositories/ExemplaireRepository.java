package fr.em.mediathequeapihibernate.repositories;

import fr.em.mediathequeapihibernate.entities.ExemplaireEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.List;

public class ExemplaireRepository {

    private EntityManager entityManager = Persistence.createEntityManagerFactory("fr.em.cuib").createEntityManager();

    public List<ExemplaireEntity> getAll(){
        return entityManager.createNamedQuery("exemplaire.getAll",ExemplaireEntity.class).getResultList();
    }
}
