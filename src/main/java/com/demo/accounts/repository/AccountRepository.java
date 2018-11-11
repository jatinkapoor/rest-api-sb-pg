package com.demo.accounts.repository;

import java.util.*;
import org.springframework.data.jpa.repository.*;

public interface AccountRepository extends JpaRepository<AccountDAO, Long>{
	
	@Query("SELECT a from AccountDAO a where a.email = ?1")
	List<AccountDAO> findAccountsByEmail(String email);
}
