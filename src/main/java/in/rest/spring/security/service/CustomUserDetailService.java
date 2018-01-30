/**
 * 
 */
package in.rest.spring.security.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import in.rest.spring.security.model.Users;
import in.rest.spring.security.repository.UserRepository;

/**
 * @author Prasad Boini
 *
 */
//@Service
public class CustomUserDetailService 
//implements UserDetailsService 
{

	//@Autowired
	private UserRepository usersRepository;

	//@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> optionalUsers = usersRepository.findByUsername(username);

		optionalUsers.get();
		optionalUsers.orElseThrow(() -> new UsernameNotFoundException("Username not found"));
		// return optionalUsers
		// .map(Users::new);
		return optionalUsers.get();
	}

}
