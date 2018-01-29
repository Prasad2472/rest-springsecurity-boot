/**
 * 
 */
package in.rest.spring.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Prasad Boini
 *
 */
@RestController
@RequestMapping("/secure")
public class HelloWorldSecureController {

	public HelloWorldSecureController() {
		System.out.println("HelloWorldSecureController........>");
	}

	@RequestMapping("/hello/user")
	@PreAuthorize("hasRole('USER')")
	public String secureMessage() {
		return "Secure Hello World User Message...!";
	}

	@RequestMapping("/hello/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String secureMessageAdmin() {
		return "Secure Hello World Admin Message...!";
	}

}
