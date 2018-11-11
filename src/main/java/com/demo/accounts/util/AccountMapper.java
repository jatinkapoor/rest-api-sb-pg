package com.demo.accounts.util;

import com.demo.accounts.domain.*;
import com.demo.accounts.repository.*;
import java.util.*;
import org.springframework.stereotype.*;

@Component
public class AccountMapper {
	
	public List<Account> mapToAccountResponse(List<AccountDAO> accountDAOList) {
		
		List<Account> accountList = new ArrayList<>();
		accountDAOList.stream().forEach(accountDAO -> {
			Account account = new Account();
			account.setName(accountDAO.getFirstName() + " " + accountDAO.getLastName());
			account.setEmail(accountDAO.getEmail());
			account.setId(accountDAO.getId());
			account.setAddress(accountDAO.getAddress());
			account.setPhone(accountDAO.getPhone());
			accountList.add(account);
		});
		
		return accountList;
	}
	
}
