package com.demo.accounts.repository;

import com.demo.accounts.domain.*;
import java.util.*;
import org.springframework.data.jpa.repository.*;

public interface AccountRepository extends JpaRepository<Account, Long>{
	
	@Query("SELECT a from Account a where a.email = ?1")
	List<Account> findByEmail(String email);
}
