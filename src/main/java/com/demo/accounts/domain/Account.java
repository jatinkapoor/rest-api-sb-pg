package com.demo.accounts.domain;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(schema = "accounts", name = "account")
public class Account {
	
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
