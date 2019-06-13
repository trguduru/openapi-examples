package io.tguduru.openapi.api;

import io.tguduru.openapi.model.Error;
import io.tguduru.openapi.model.Pet;
import io.tguduru.openapi.model.Pets;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pets")
@Api(description = "the pets API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-06-12T19:54:37.791-05:00[America/Chicago]")
public interface PetstoreAwesomeAPI {

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a pet", notes = "", tags={ "pets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Null response", response = Void.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    void createPets();

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "List all pets", notes = "", tags={ "pets",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A paged array of pets", response = Pets.class),
        @ApiResponse(code = 500, message = "unexpected error", response = Error.class) })
    Pets listPets(@QueryParam("limit")   @ApiParam("How many items to return at one time (max 100)")  Integer limit);

    @GET
    @Path("/{petId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Info for a specific pet", notes = "", tags={ "pets" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = Pet.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    Pet showPetById(@PathParam("petId") @ApiParam("The id of the pet to retrieve") String petId);
}
