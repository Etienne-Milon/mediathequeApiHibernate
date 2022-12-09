package fr.em.mediathequeapihibernate.repositories;

import fr.em.mediathequeapihibernate.dto.GenreDto;
import fr.em.mediathequeapihibernate.entities.GenreEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;

import java.util.List;

public class GenreRepository {

    private EntityManager entityManager = Persistence.createEntityManagerFactory("fr.em.cuib").createEntityManager();


    public List<GenreDto> getAll() {
        return GenreDto.toGenreDto(entityManager.createNamedQuery("genre.getAll", GenreEntity.class).getResultList());
    }

    public GenreEntity getById(int id) {
        GenreEntity genre = entityManager.find(GenreEntity.class, id);
        return genre;
    }

    @Transactional
    public boolean update(GenreEntity genre) {
        GenreEntity updatingGenre = getById(genre.getIdGenre());
        if (updatingGenre == null) return false;
        entityManager.getTransaction().begin();
        entityManager.merge(genre);
        entityManager.getTransaction().commit();
        return true;
    }

    @Transactional
    public void create(GenreEntity genre) {
        entityManager.getTransaction().begin();
        entityManager.persist(genre);
        entityManager.getTransaction().commit();
    }

    @Transactional
    public boolean delete(GenreEntity genre) {
        GenreEntity deletingGenre = getById(genre.getIdGenre());
        if (deletingGenre == null)
            return false;
        entityManager.getTransaction().begin();
        entityManager.remove(deletingGenre);
        entityManager.getTransaction().commit();
        return true;
    }
}