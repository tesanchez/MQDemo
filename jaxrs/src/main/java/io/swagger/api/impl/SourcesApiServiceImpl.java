package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-19T14:40:29.097Z")
public class SourcesApiServiceImpl extends SourcesApiService {
    @Override
    public Response createSource(CreateSourceExample body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteSource(String sourceId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getSource(String sourceId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getSourceList(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response partialUpdateSource(String sourceId, PartialUpdateSourceExample body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
