package io.swagger.api.factories;

import io.swagger.api.SourcesApiService;
import io.swagger.api.impl.SourcesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-17T18:16:26.056Z")
public class SourcesApiServiceFactory {
    private final static SourcesApiService service = new SourcesApiServiceImpl();

    public static SourcesApiService getSourcesApi() {
        return service;
    }
}