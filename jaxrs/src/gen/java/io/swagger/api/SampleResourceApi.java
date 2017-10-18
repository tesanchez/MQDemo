package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SampleResourceApiService;
import io.swagger.api.factories.SampleResourceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/sampleResource")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the sampleResource API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-18T15:06:03.607Z")
public class SampleResourceApi  {
   private final SampleResourceApiService delegate = SampleResourceApiServiceFactory.getSampleResourceApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "sample description", notes = "sample", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = void.class) })
    public Response sampleResourceGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sampleResourceGet(securityContext);
    }
}
