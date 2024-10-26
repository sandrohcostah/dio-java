package dio.api.exemplo.webapi.doc;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
  private Contact contato() {
    return new Contact("Seu nome", "x.com", "vc@x.com");
  }

  private ApiInfoBuilder informacoesApi(){

    ApiInfoBuilder aib = new ApiInfoBuilder();

    aib.title("Titulo API rest");
    aib.description("Exemplo descricao");
    aib.version("2.9");
    aib.termsOfServiceUrl("termsOfServiceUrl");
    aib.license("license");
    aib.licenseUrl("x.com");
    aib.contact(this.contato());

    return aib;
  }

  @Bean
  @SuppressWarnings("Convert2Diamond")
  public Docket detalheApi(){
    Docket doc = new Docket(DocumentationType.SWAGGER_2);

    doc
      .select()
      .apis(RequestHandlerSelectors.basePackage("dio.api.exemplo.webapi.controller"))
      .paths(PathSelectors.any())
      .build()
      .apiInfo(this.informacoesApi().build())
      .consumes(new HashSet<String>(Arrays.asList("application/json")))
      .produces(new HashSet<String>(Arrays.asList("application/json")));

    return doc;
  }
}
