package fr.em.mediathequeapihibernate.repositories;

import fr.em.mediathequeapihibernate.dto.ArticleByIdDto;
import fr.em.mediathequeapihibernate.dto.ArticleDto;
import fr.em.mediathequeapihibernate.dto.Article_GenreDto;
import fr.em.mediathequeapihibernate.entities.ArticleEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;

import java.util.List;

public class ArticleRepository {

    private EntityManager entityManager = Persistence.createEntityManagerFactory("fr.em.cuib").createEntityManager();


    public List<ArticleDto> getAll() {
        return ArticleDto.toArticleDto(entityManager.createNamedQuery("article.getAll", ArticleEntity.class).getResultList());
    }

    public ArticleByIdDto getById(String ean13) {
        return new ArticleByIdDto(entityManager.find(ArticleEntity.class, ean13));
    }

    public Article_GenreDto getGenreById(String ean13) {
        return new Article_GenreDto(entityManager.find(ArticleEntity.class, ean13));
    }

    @Transactional
    public boolean update(ArticleEntity article) {
        ArticleByIdDto updatingArticle = getById(article.getEan13());
        if (updatingArticle == null) return false;
        entityManager.getTransaction().begin();
        entityManager.merge(article);
        entityManager.getTransaction().commit();
        return true;
    }

    @Transactional
    public void create(ArticleEntity article) {
        entityManager.getTransaction().begin();
        entityManager.persist(article);
        entityManager.getTransaction().commit();
    }

    @Transactional
    public boolean delete(ArticleEntity article) {
        ArticleByIdDto deletingArticle = getById(article.getEan13());
        if (deletingArticle == null)
            return false;
        entityManager.getTransaction().begin();
        entityManager.remove(deletingArticle);
        entityManager.getTransaction().commit();
        return true;
    }
}