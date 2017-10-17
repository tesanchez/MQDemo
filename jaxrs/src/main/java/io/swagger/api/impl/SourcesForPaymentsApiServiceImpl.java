package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.CreateSourceExample;
import io.swagger.model.CreateSourceExampleResponse;
import io.swagger.model.GetSourceListExample;
import io.swagger.model.OffsetInvalidExample;
import io.swagger.model.SourceInvalidRequestExample;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-17T18:16:26.056Z")
public class SourcesForPaymentsApiServiceImpl extends SourcesForPaymentsApiService {
    @Override
    public Response createSource(CreateSourceExample body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getSourceList(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
