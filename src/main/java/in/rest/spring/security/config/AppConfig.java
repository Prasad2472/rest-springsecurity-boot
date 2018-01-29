/**
 * 
 */
package in.rest.spring.security.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Prasad Boini
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({ "in.rest.security.controller" })
public class AppConfig {

}
