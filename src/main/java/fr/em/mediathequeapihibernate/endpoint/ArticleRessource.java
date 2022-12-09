package fr.em.mediathequeapihibernate.endpoint;

import fr.em.mediathequeapihibernate.dto.ArticleByIdDto;
import fr.em.mediathequeapihibernate.dto.ArticleDto;
import fr.em.mediathequeapihibernate.dto.Article_GenreDto;
import fr.em.mediathequeapihibernate.entities.ArticleEntity;
import fr.em.mediathequeapihibernate.entities.EditeurEntity;
import fr.em.mediathequeapihibernate.repositories.ArticleRepository;
import fr.em.mediathequeapihibernate.security.Tokened;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Tag(name = "Articles")
@Path("/articles")
public class ArticleRessource {
    ArticleRepository articleRepository = new ArticleRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllArticles() {
        List<ArticleDto> allArticles = articleRepository.getAll();
        if (allArticles != null)
            return Response.ok(allArticles).build();
        else
            return Response.noContent().build();
    }

    //test : 5001756529522
    @GET
    @Path("{ean13}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("ean13") String ean13) {
        ArticleByIdDto article = articleRepository.getById(ean13);
        if (article != null)
            return Response.ok(article).build();
        else
            return Response.noContent().build();
    }

    @GET
    @Path("{ean13}/Genres")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGenreById(@PathParam("ean13") String ean13) {
        Article_GenreDto article = articleRepository.getGenreById(ean13);
        if (article != null)
            return Response.ok(article).build();
        else
            return Response.noContent().build();
    }


    @POST
    @Tokened
    @Operation(summary = "Add 'article'")
    @ApiResponse(responseCode = "200", description = "Article ajouté")
    @ApiResponse(responseCode = "400", description = "Article existant")
    @ApiResponse(responseCode = "401", description = "Authentification nécessaire")
    @Path("/insert")
    public Response insert(ArticleEntity article) {
        articleRepository.create(article);
        return Response.status(Response.Status.OK).build();
    }



}
