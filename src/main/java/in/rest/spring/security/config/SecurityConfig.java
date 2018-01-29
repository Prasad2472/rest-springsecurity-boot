/**
 * 
 */
package in.rest.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Prasad Boini
 *
 */
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/nonsecure/**").permitAll().and().authorizeRequests()
				.antMatchers("/secure/**").hasAnyRole("ADMIN,USER").and().httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Prasad").password("Welcome123").roles("ADMIN").and().withUser("App")
				.password("Hello123").roles("USER");
	}

	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// ALTOUGH THIS SEEMS LIKE USELESS CODE,
		// ITS REQUIRED TO PREVEND SPRING BOOT AUTO-CONFIGURATION
		return super.authenticationManagerBean();
	}
}
