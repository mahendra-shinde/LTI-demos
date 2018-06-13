package com.mahendra.models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("SB")
public class SavingAccount extends Account {
	@Column(name = "min_balance")
	private Float minBalance;

	public Float getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(Float minBalance) {
		this.minBalance = minBalance;
	}
}
