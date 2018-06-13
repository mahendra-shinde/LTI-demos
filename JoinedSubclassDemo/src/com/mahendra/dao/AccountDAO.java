package com.mahendra.dao;

import com.mahendra.models.LoanAccount;
import com.mahendra.models.SavingAccount;

public interface AccountDAO {

	void save(SavingAccount account);
	void save(LoanAccount account);
	
}
