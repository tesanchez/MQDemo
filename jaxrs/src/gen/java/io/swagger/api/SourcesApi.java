package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SourcesApiService;
import io.swagger.api.factories.SourcesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.CreateSourceExample;
import io.swagger.model.CreateSourceExampleResponse;
import io.swagger.model.GetSourceExample;
import io.swagger.model.GetSourceListExample;
import io.swagger.model.OffsetInvalidExample;
import io.swagger.model.PartialUpdateSourceExample;
import io.swagger.model.PartialUpdateSourceExampleResponse;
import io.swagger.model.SourceInvalidRequestExample;
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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-19T17:19:19.800Z")
public class SourcesApi  {
   private final SourcesApiService delegate = SourcesApiServiceFactory.getSourcesApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a new payment source", notes = "", response = CreateSourceExampleResponse.class, tags={ "sources", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = CreateSourceExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Not Valid", response = CreateSourceExampleResponse.class) })
    public Response createSource(@ApiParam(value = "" ,required=true) CreateSourceExample body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createSource(body,securityContext);
    }
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
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve list of payment sources", notes = "", response = GetSourceListExample.class, tags={ "sources", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = GetSourceListExample.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid Offset", response = GetSourceListExample.class) })
    public Response getSourceList(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSourceList(securityContext);
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
