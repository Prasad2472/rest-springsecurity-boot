/**
 * 
 */
package in.rest.spring.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Prasad Boini
 *
 */
@RestController
@RequestMapping("/nonsecure")
public class NonSecureController {

	@RequestMapping("/hello/user")
	public String nonSecureMessage() {
		return "Non Secure Hello World ...!";
	}

	@RequestMapping("/hello/admin")
	public String nonSecureHai() {
		return "Non Secure nonSecureHai...!";
	}
}
