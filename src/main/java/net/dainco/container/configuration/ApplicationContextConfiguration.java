package net.dainco.container.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Configuration root.
 * TODO: Register all package names of the modules in @ComponentScan.
 */
@ComponentScan({"net.dainco.module.user"})
@Configuration
@EnableScheduling
@Import(value = {
    PersistenceConfiguration.class,
    SecurityConfiguration.class,
    SwaggerConfiguration.class})
public class ApplicationContextConfiguration {
}
