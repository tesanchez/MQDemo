package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-18T15:01:04.059Z")
public abstract class SourcesApiService {
    public abstract Response createSource(CreateSourceExample body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteSource(String sourceId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSource(String sourceId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSourceList(SecurityContext securityContext) throws NotFoundException;
    public abstract Response partialUpdateSource(String sourceId,PartialUpdateSourceExample body,SecurityContext securityContext) throws NotFoundException;
}
