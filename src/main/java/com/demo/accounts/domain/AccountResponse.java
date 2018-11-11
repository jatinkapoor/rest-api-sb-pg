package com.demo.accounts.domain;

import lombok.*;

@Data
public class AccountResponse {
	private Long id;
	private String name;
	private String address;
	private String email;
}
