package com.demo.accounts.web;

import com.demo.accounts.domain.*;
import com.demo.accounts.service.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountControlller {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public ResponseEntity<List<Account>> getAccounts(@RequestParam String email) {
		
		return ResponseEntity.ok().body(accountService.getAccountsByEmail(email));
	}
}
