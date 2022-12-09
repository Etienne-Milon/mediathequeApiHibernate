package fr.em.mediathequeapihibernate.endpoint;

import fr.em.mediathequeapihibernate.dto.EditeurDto;
import fr.em.mediathequeapihibernate.entities.EditeurEntity;
import fr.em.mediathequeapihibernate.repositories.EditeurRepository;
import fr.em.mediathequeapihibernate.security.Tokened;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/editeurs")
@Tag(name = "Editeurs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EditeurRessource {

    private EditeurRepository editeurRepository = new EditeurRepository();

    @GET
    @Operation(summary = "Return all 'editeurs'")
    @ApiResponse(responseCode = "200", description = "Editeurs trouvés", content = @Content)
    public Response editeurs() {
        List<EditeurDto> listEditeur = editeurRepository.getAll();
        return Response.ok(listEditeur).build();
    }

    @GET
    @Operation(summary = "Return 'editeur' for a id")
    @ApiResponse(responseCode = "200", description = "Editeur trouvé")
    @ApiResponse(responseCode = "404", description = "Editeur introuvable")
    @Path("{id}")
    public Response editeurByID(@PathParam("id") int id) {
        EditeurEntity editeur = editeurRepository.getById(id);
        return Response.ok(editeur).build();
    }

    @POST
    @Tokened
    @Operation(summary = "Add 'editeur'")
    @ApiResponse(responseCode = "200", description = "Editeur ajouté")
    @ApiResponse(responseCode = "400", description = "Editeur existant")
    @ApiResponse(responseCode = "401", description = "Authentification nécessaire")
    @Path("/insert")
    public Response insert(EditeurEntity editeur) {
        editeurRepository.create(editeur);
        return Response.status(Response.Status.OK).build();
    }

    @PUT
    @Tokened
    @Operation(summary = "Modify 'editeur' for a id")
    @ApiResponse(responseCode = "200", description = "Editeur modifié")
    @ApiResponse(responseCode = "400", description = "Modification impossible : editeur existant")
    @ApiResponse(responseCode = "404", description = "Modification impossible : editeur introuvable")
    @ApiResponse(responseCode = "401", description = "Authentification nécessaire")
    @Path("/update")
    public Response update(EditeurDto editeur) {
        editeurRepository.update(editeur);
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    @Tokened
    @Operation(summary = "Delete 'editeur' for a id")
    @ApiResponse(responseCode = "200", description = "Editeur supprimé")
    @ApiResponse(responseCode = "404", description = "Suppression impossible : editeur introuvable")
    @ApiResponse(responseCode = "401", description = "Authentification nécessaire")
    @Path("/delete")
    public Response deleteByID(EditeurEntity editeur) {
        editeurRepository.delete(editeur);
        return Response.status(Response.Status.OK).build();
    }
}