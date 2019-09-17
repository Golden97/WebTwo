/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restFull;

import com.persistance.Akkademician;
import com.services.AkkademicianService;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author midem
 */
@Path("ex")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class rest {

    @Inject
    AkkademicianService akkademicianService;

    @Path("new")
    @POST
    public Response createTodo(Akkademician akkademician) {
        akkademicianService.createTodo(akkademician);

        return Response.ok(akkademician).build();
    }

    @Path("update")
    @PUT
    public Response updateAkkademician(Akkademician akkademician) {
        akkademicianService.updateAkkademician(akkademician);

        return Response.ok(akkademician).build();
    }

    @Path("{id}")
    @GET
    public Akkademician getTodo(@PathParam("id") Long id) {
        return akkademicianService.findAkkademicianById(id);
    }

}
