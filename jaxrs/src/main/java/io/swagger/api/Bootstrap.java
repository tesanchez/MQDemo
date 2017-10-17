package io.swagger.api;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;

import io.swagger.models.auth.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Bootstrap extends HttpServlet {
  @Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("Swagger Server")
      .description("The Payments API allows capturing payments from customers using a variety of payment methods. Charges can be created as one-off events, or payment information can be saved for later use. The API has support for all aspects of a transaction's lifecycle, from initial capture to cancellations and refunds. ")
      .termsOfService("")
      .contact(new Contact()
        .email("GCPayments@digitalriver.com"))
      .license(new License()
        .name("")
        .url(""));

    ServletContext context = config.getServletContext();
    Swagger swagger = new Swagger().info(info);

    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
