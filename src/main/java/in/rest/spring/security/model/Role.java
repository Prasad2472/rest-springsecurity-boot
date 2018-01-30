package in.rest.spring.security.model;

//@Entity
//@Table(name = "USER_ROLES")
public class Role {

	/**
	 * After enabling spring-boot-starter-data-jpa uncomment the annotations.
	 */
	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	// @Column(name = "role_id")
	private int roleId;

	// @Column(name = "role")
	private String role;

	public Role() {
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(final int roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(final String role) {
		this.role = role;
	}
}
