package com.validator.payment;

public class PaymentDetailsDTO {

	private String accountNumber;
	private Long key;
	
	public PaymentDetailsDTO(final String accountNumber, final Long key) {
		this.accountNumber = accountNumber;
		this.key = key;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(final String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Long getKey() {
		return key;
	}
	public void setKey(final Long key) {
		this.key = key;
	}
	
}
