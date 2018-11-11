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
	Long id;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name = "last_name")
	String lastName;
	
	@Column(name="email")
	String email;
	
	@Column(name="address")
	String address;
}
