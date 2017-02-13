package net.dainco.container.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.AbstractPathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Enables the Swagger API documentation.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
  private Environment environment;

  @Autowired
  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }

  @Bean
  public Docket api() {
    String host = environment.getRequiredProperty("application.apiBaseFullPath");
    if (host.contains("://")) {
      host = host.substring(host.indexOf("://") + 3, host.length());
    }
    return new Docket(DocumentationType.SWAGGER_2)
        .host(host)
        .pathProvider(new CustomPathProvider())
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build();
  }

  private class CustomPathProvider extends AbstractPathProvider {
    @Override
    protected String applicationPath() {
      return "/";
    }

    @Override
    protected String getDocumentationPath() {
      return "/";
    }
  }
}
