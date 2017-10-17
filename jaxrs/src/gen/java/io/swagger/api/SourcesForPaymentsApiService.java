package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.CreateSourceExample;
import io.swagger.model.CreateSourceExampleResponse;
import io.swagger.model.GetSourceListExample;
import io.swagger.model.OffsetInvalidExample;
import io.swagger.model.SourceInvalidRequestExample;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-17T18:16:26.056Z")
public abstract class SourcesForPaymentsApiService {
    public abstract Response createSource(CreateSourceExample body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSourceList(SecurityContext securityContext) throws NotFoundException;
}
