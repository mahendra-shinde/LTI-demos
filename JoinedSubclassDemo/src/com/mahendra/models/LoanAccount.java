package com.mahendra.models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("LA")
public class LoanAccount extends Account{

	@Column(name="loan_amount")
	private Float loanAmount;
	
	private Float emi;

	public Float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Float getEmi() {
		return emi;
	}

	public void setEmi(Float emi) {
		this.emi = emi;
	}
	
}
