package org.datacare.pettycash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "permissions")
public class Permission extends BaseEntity {

	private static final long serialVersionUID = 6066130074982708000L;
	private String name;

	@Column(name = "permission_name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
