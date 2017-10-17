package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SourcesApiService;
import io.swagger.api.factories.SourcesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.GetSourceExample;
import io.swagger.model.PartialUpdateSourceExample;
import io.swagger.model.PartialUpdateSourceExampleResponse;
import io.swagger.model.SourceNotFoundExample;
import io.swagger.model.SourceUpdateInvalidRequestExample;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/sources")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the sources API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-17T18:16:26.056Z")
public class SourcesApi  {
   private final SourcesApiService delegate = SourcesApiServiceFactory.getSourcesApi();

    @DELETE
    @Path("/{sourceId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a payment source", notes = "Delete an existing payment source.", response = void.class, tags={ "sources", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Deleted", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = void.class) })
    public Response deleteSource(@ApiParam(value = "The ID of the source.",required=true) @PathParam("sourceId") String sourceId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteSource(sourceId,securityContext);
    }
    @GET
    @Path("/{sourceId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve a payment source", notes = "", response = GetSourceExample.class, tags={ "sources", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = GetSourceExample.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = GetSourceExample.class) })
    public Response getSource(@ApiParam(value = "The ID of the source.",required=true) @PathParam("sourceId") String sourceId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSource(sourceId,securityContext);
    }
    @POST
    @Path("/{sourceId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a payment source", notes = "Update part of an existing payment source.", response = PartialUpdateSourceExampleResponse.class, tags={ "sources", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Updated", response = PartialUpdateSourceExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Not Valid", response = PartialUpdateSourceExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = PartialUpdateSourceExampleResponse.class) })
    public Response partialUpdateSource(@ApiParam(value = "The ID of the source.",required=true) @PathParam("sourceId") String sourceId
,@ApiParam(value = "" ,required=true) PartialUpdateSourceExample body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.partialUpdateSource(sourceId,body,securityContext);
    }
}
