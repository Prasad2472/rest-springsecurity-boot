package in.rest.spring.security.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestBootSecurityApplication.class, args);
	}

	/**
	 * To enable H2 DB Console
	 * 
	 * @return
	 */
//	@Bean
//	org.h2.tools.Server h2Server() {
//		Server server = new Server();
//		try {
//			server.runTool("-tcp");
//			server.runTool("-tcpAllowOthers");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return server;
//	}
}
