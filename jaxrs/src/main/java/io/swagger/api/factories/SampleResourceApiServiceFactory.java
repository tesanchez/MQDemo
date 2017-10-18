package io.swagger.api.factories;

import io.swagger.api.SampleResourceApiService;
import io.swagger.api.impl.SampleResourceApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-18T15:06:03.607Z")
public class SampleResourceApiServiceFactory {
    private final static SampleResourceApiService service = new SampleResourceApiServiceImpl();

    public static SampleResourceApiService getSampleResourceApi() {
        return service;
    }
}
