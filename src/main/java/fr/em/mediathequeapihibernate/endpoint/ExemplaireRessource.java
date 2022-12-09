package fr.em.mediathequeapihibernate.endpoint;

import fr.em.mediathequeapihibernate.entities.ExemplaireEntity;
import fr.em.mediathequeapihibernate.repositories.ExemplaireRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Tag(name="Exemplaires")
@Path("/exemplaire")
public class ExemplaireRessource {

    ExemplaireRepository exemplaireRepository = new ExemplaireRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        List<ExemplaireEntity> allExemplaires = exemplaireRepository.getAll();
        if (allExemplaires != null)
            return Response.ok(allExemplaires).build();
        else
            return Response.noContent().build();
    }


}
