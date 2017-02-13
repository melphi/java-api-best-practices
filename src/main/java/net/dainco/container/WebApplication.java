package net.dainco.container;

import net.dainco.container.configuration.ApplicationContextConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

/**
 * Spring boot application entrypoint.
 */
@EnableAutoConfiguration(exclude = {JmxAutoConfiguration.class})
@Import({ApplicationContextConfiguration.class})
@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {
  public static void main(String[] args) {
    SpringApplication.run(WebApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(WebApplication.class);
  }
}
