package net.dainco.container.configuration;

import net.dainco.container.filter.CorsFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * Security configuration.
 * {@link EnableWebSecurity} enables Spring security.
 * {@link EnableGlobalMethodSecurity} enables the annotation @PermitAll, @Secured etc on the
 * controllers.
 * TODO: Add your configuration options, for example OAuth tokens etc.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
  private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfiguration.class);

  @Bean
  public FilterRegistrationBean corsFilter() {
    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
    filterRegistrationBean.setFilter(new CorsFilter());
    // Highest priority to authorise OPTION requests.
    filterRegistrationBean.setOrder(0);
    return filterRegistrationBean;
  }

  @Override
  public void configure(WebSecurity web) throws Exception {
    // Ignore security for the Swagger documentation.
    web.ignoring()
        .antMatchers("/configuration/ui")
        .antMatchers("/images/**")
        .antMatchers("/swagger-resources")
        .antMatchers("/swagger-ui.html")
        .antMatchers("/v2/api-docs")
        .antMatchers("/webjars/**");
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
          .csrf()
          .disable();
  }
}
