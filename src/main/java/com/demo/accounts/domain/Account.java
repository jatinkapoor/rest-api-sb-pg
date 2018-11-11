package com.demo.accounts.domain;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Data
public class Account {
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("email_address")
	private String email;
}
