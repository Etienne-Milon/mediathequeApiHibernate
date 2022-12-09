package fr.em.mediathequeapihibernate.endpoint;

import fr.em.mediathequeapihibernate.dto.GenreDto;
import fr.em.mediathequeapihibernate.entities.GenreEntity;
import fr.em.mediathequeapihibernate.repositories.GenreRepository;
import fr.em.mediathequeapihibernate.security.Tokened;
import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Tag(name = "Genres")
@Path("/genres")
@Produces(MediaType.APPLICATION_JSON)

public class GenreRessource {
    GenreRepository genreRepository = new GenreRepository();

    @GET
    @Operation(summary = "Return all 'genres'")
    public Response getAll() {
        List<GenreDto> allGenres = genreRepository.getAll();
        if (allGenres != null)
            return Response.ok(allGenres).build();
        else
            return Response.noContent().build();
    }

    @GET
    @Operation(summary = "Return 'genre' for an id")
    @Path("{id}")
    public Response getById(@PathParam("id") int id){
        GenreEntity genre = genreRepository.getById(id);
        return Response.ok(genre).build();
    }

    @POST
    @Tokened
    @Operation(summary = "Add 'genre'")
    public Response insert(GenreEntity genre){
        genreRepository.create(genre);
        return Response.ok().build();
    }

    @PUT
    @Tokened
    @Operation(summary = "Modify 'genre' for an id")
    @Path("/update")
    public Response uodate(GenreEntity genre){
        genreRepository.update(genre);
        return Response.ok().build();
    }

    @DELETE
    @Tokened
    @Operation(summary = "Delete 'genre' for an id")
    @Path("/delete")
    public Response deleteById(GenreEntity genre){
        genreRepository.delete(genre);
        return Response.ok().build();
    }

//
//    //test : 8030387318159
//    @GET
//    @Path("{ean13}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getById(@PathParam("ean13") long ean13) {
//        GenreEntity genre = DaoFactory.getGenreDAO().getById(ean13);
//        if (genres != null)
//            return Response.ok(genres).build();
//        else
//            return Response.noContent().build();
//    }
//
//
//    @Tokened
//    @PUT
//    @Path("{ean13}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response update(@PathParam("ean13") long ean13, Reference[] genres) throws SQLException {
//        if (DaoFactory.getGenreDAO().deleteAllGenresInArticle(ean13)) {
//            DaoFactory.getGenreDAO().insertAvoirGenre(ean13, genres);
//            return Response.ok(genres).status(Response.Status.CREATED).build();
//        } else
//            return Response.status(Response.Status.CONFLICT).build();
//    }
//
//
//    /* INSERT une ArrayList de Genres existants dans un article   */
//    @Tokened
//    @POST
//    @Path("{ean13}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response insert(@PathParam("ean13") long ean13, ArrayList<Reference> genres) throws SQLException {
////        ArrayList<Reference> genresArticle = DaoFactory.getGenreDAO().getById(ean13);
////        if (Outils.testPresence(genres, genresArt)) {
////            return Response.status(409).build();
////        }
//        if (DaoFactory.getGenreDAO().insertGenresInArticle(ean13, genres))
//            return Response.ok(genres).status(Response.Status.CREATED).build();
//        else
//            return Response.status(Response.Status.CONFLICT).build();
//    }
//
//    /* DELETE une ArrayList de Genres existants dans un article */
//    @Tokened
//    @DELETE
//    @Path("{ean13}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @ApiResponse(responseCode = "204", description = "Genre supprimé")
//    @ApiResponse(responseCode = "404", description = "Non trouvé")
//    public Response delete(@PathParam("ean13") long ean13, ArrayList<Reference> genres) {
//        if (genres == null) {
//            return Response.status(Response.Status.BAD_REQUEST).build();
//        }
//        if (DaoFactory.getGenreDAO().deleteGenresInArticle(ean13, genres)) {
//            return Response.status(204).build();
//        } else {
//            return Response.status(404).build();
//        }
//    }
}



