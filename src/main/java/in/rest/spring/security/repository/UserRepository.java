/**
 * 
 */
package in.rest.spring.security.repository;

import java.util.Optional;

import in.rest.spring.security.model.Users;


/**
 * @author Prasad Boini
 *
 */
public interface UserRepository 
//extends JpaRepository<Users, Integer>
{
    Optional<Users> findByUsername(String username);
}
