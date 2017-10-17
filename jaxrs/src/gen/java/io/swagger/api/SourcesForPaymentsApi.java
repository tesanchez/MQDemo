package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SourcesForPaymentsApiService;
import io.swagger.api.factories.SourcesForPaymentsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.CreateSourceExample;
import io.swagger.model.CreateSourceExampleResponse;
import io.swagger.model.GetSourceListExample;
import io.swagger.model.OffsetInvalidExample;
import io.swagger.model.SourceInvalidRequestExample;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/sourcesForPayments")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the sourcesForPayments API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-17T18:16:26.056Z")
public class SourcesForPaymentsApi  {
   private final SourcesForPaymentsApiService delegate = SourcesForPaymentsApiServiceFactory.getSourcesForPaymentsApi();

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
}
