package io.swagger.api.factories;

import io.swagger.api.SourcesForPaymentsApiService;
import io.swagger.api.impl.SourcesForPaymentsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-17T18:16:26.056Z")
public class SourcesForPaymentsApiServiceFactory {
    private final static SourcesForPaymentsApiService service = new SourcesForPaymentsApiServiceImpl();

    public static SourcesForPaymentsApiService getSourcesForPaymentsApi() {
        return service;
    }
}
