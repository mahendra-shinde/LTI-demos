package com.mahendra.app;

import java.util.Date;

import com.mahendra.dao.AccountDAO;
import com.mahendra.dao.AccountDAOImpl;
import com.mahendra.models.LoanAccount;
import com.mahendra.models.SavingAccount;

public class Main {

	public static void main(String[] args) {
	
		AccountDAO dao = new AccountDAOImpl();	
		SavingAccount account = new SavingAccount();
		account.setAccountNo(154550);
		account.setCustomer("Piyush");
		account.setDateOfOpening(new Date());
		account.setMinBalance(500F);
		account.setRateOfInterest(4.0f);
		
		dao.save(account);
		
		LoanAccount loan = new LoanAccount();
		loan.setAccountNo(1025552);
		loan.setCustomer("Rahul");
		loan.setDateOfOpening(new Date());
		loan.setLoanAmount(2500000F);
		loan.setEmi(22251.45F);
		
		dao.save(loan);
		
		
	}

}
