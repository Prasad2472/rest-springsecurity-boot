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
/**
 * Once The Data base Setup is Ready, then uncomment the below line
 */
// @EnableJpaRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * Once The Data base Setup is Ready, then uncomment the below line
	 */
	// @Autowired
	// private CustomUserDetailService customUserDetailService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/nonsecure/**").permitAll().and().authorizeRequests()
				.antMatchers("/console/**").permitAll().and().authorizeRequests().antMatchers("/secure/**")
				.hasAnyRole("ADMIN,USER").and().httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		/**
		 * Once The Data base Setup is Ready, then uncomment the below line, and comment
		 * out the inmemory authentication
		 */
		// auth.userDetailsService(customUserDetailService);

		// auth.jdbcAuthentication().dataSource(appDataSource())
		// .usersByUsernameQuery("select username, password, enabled"
		// + " from users where username=?")
		// .authoritiesByUsernameQuery("select username, authority "
		// + "from authorities where username=?");
		// .passwordEncoder(new BCryptPasswordEncoder());
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
