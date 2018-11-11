package com.demo.accounts.util;

import com.demo.accounts.domain.*;
import java.util.*;
import org.springframework.stereotype.*;

@Component
public class AccountMapper {
	
	public List<AccountResponse> mapToAccountResponse(List<Account> accounts) {
		
		List<AccountResponse> accountResponses = new ArrayList<>();
		accounts.stream().forEach(account -> {
			AccountResponse accountResponse = new AccountResponse();
			accountResponse.setName(account.getFirstName() + " " + account.getLastName());
			accountResponse.setEmail(account.getEmail());
			accountResponse.setId(account.getId());
			accountResponse.setAddress(account.getAddress());
			accountResponses.add(accountResponse);
		});
		
		return accountResponses;
	}
	
}
