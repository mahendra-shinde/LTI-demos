package com.mahendra.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


//Use only with "Table per class"
// DO NOT Generate TABLE for this class
// This class acts as a BASE class for other entities
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//Ignore by hibernate(Used only for SINGLE_TABLE)
@DiscriminatorColumn(name = "AccType")  
public class Account implements Serializable {

	@Id
	@Column(name = "account_no")
	private Integer accountNo;

	@Column(name = "customer", length = 15)
	private String customer;

	@Column(name = "date_opening")
	// Convert value into Database "Date" type
	@Temporal(TemporalType.DATE)
	private Date dateOfOpening;

	@Column(name = "rate_of_int")
	private Float rateOfInterest;

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Date getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(Date dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	public Float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

}
