package com.demo.accounts.service;

import com.demo.accounts.domain.Account;
import com.demo.accounts.repository.*;
import com.demo.accounts.util.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	AccountMapper accountMapper;
	
	public List<Account> getAccountsByEmail(String email) {
		List<AccountDAO> accountDAOList = accountRepository.findAccountsByEmail(email);
		List<Account> accountList = accountMapper.mapToAccountResponse(accountDAOList);
		return accountList;
	}
}
