package fr.em.mediathequeapihibernate.dto;

import fr.em.mediathequeapihibernate.entities.ArticleEntity;
import fr.em.mediathequeapihibernate.entities.EditeurEntity;
import fr.em.mediathequeapihibernate.entities.GenreEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Article_GenreDto {
    private String ean13;
    private Object prixAchat;
    private String titre;
    private List<Genre> genres;

    @Getter
    @Setter
    private class Genre {
        int id;
        String nom;
        public Genre(GenreEntity genreEntity) {
            id = genreEntity.getIdGenre();
            nom = genreEntity.getNomGenre();
        }
    }


    public Article_GenreDto(ArticleEntity articleEntity) {
        this.ean13 = articleEntity.getEan13();
        this.titre = articleEntity.getTitre();
        this.prixAchat = articleEntity.getPrixAchat();
        this.genres = toGenreList(articleEntity.getGenres());
    }

    private List<Genre> toGenreList(List<GenreEntity> genres) {
        List<Genre> liste = new ArrayList<>();
        for (GenreEntity genre : genres) {
            liste.add(new Genre(genre));
        }
        return liste;
    }

    public static List<Article_GenreDto> toArticleDto(List<ArticleEntity> articleEntities) {
        List<Article_GenreDto> articleDtos = new ArrayList<>();
        for (ArticleEntity articleEntity : articleEntities) {
            articleDtos.add(new Article_GenreDto(articleEntity));
        }
        return articleDtos;
    }
}
