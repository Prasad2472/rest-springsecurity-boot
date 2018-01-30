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
@ComponentScan({ "in.rest.spring.security.controller"
		/**
		 * Once The Data base Setup is Ready, then uncomment the below line
		 */
		// "in.rest.spring.security.repository",
		// "in.rest.spring.security.service"
})
public class AppConfig {

}
