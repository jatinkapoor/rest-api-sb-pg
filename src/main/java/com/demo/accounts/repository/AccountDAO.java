package com.demo.accounts.repository;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(schema = "accounts", name = "account")
public class AccountDAO {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	private String address;

	@Column(name="phone")
	private String phone;
}
