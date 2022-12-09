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
public class Article_EditeurDto {
    private String ean13;
    private Object prixAchat;
    private String titre;
    private Editeur editeur;

    @Getter
    @Setter
    private class Editeur {
        int id;
        String nom;
        public Editeur(EditeurEntity editeurEntity) {
            id = editeurEntity.getIdEditeur();
            nom = editeurEntity.getNomEditeur();
        }
    }

    public Article_EditeurDto(ArticleEntity articleEntity) {
        this.ean13 = articleEntity.getEan13();
        this.titre = articleEntity.getTitre();
        this.prixAchat = articleEntity.getPrixAchat();
        this.editeur = new Editeur(articleEntity.getEditeur());
    }


    public static List<Article_EditeurDto> toArticleDto(List<ArticleEntity> articleEntities) {
        List<Article_EditeurDto> articleDtos = new ArrayList<>();
        for (ArticleEntity articleEntity : articleEntities) {
            articleDtos.add(new Article_EditeurDto(articleEntity));
        }
        return articleDtos;
    }
}
