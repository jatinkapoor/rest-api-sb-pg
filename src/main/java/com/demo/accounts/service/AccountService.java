package com.demo.accounts.service;

import com.demo.accounts.domain.*;
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
	
	public List<AccountResponse> findAccountsByEmail(String email) {
		List<Account> accounts = accountRepository.findByEmail(email);
		List<AccountResponse> accountResponses = accountMapper.maptoAccountResponse(accounts);
		return accountResponses;
	}
}
