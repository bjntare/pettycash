package org.datacare.pettycash.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
	
	private static final long serialVersionUID = 8561094424821770382L;
	private String RoleName;
	private String RoleDescription;
	private Set<Permission> Permission;

	@Column(name = "role_name", nullable = false)
	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String roleName) {
		RoleName = roleName;
	}

	@Column(name = "role_desc", nullable = true)
	public String getRoleDescription() {
		return RoleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		RoleDescription = roleDescription;
	}

	@ManyToMany
	@JoinTable(name = "role_permissions", joinColumns = @JoinColumn(name = "role_id", nullable = false), inverseJoinColumns = @JoinColumn(name = "permission_id", nullable = false))
	public Set<Permission> getPermission() {
		return Permission;
	}

	public void setPermission(Set<Permission> permission) {
		Permission = permission;
	}
}
