package com.upgrad.hirewheels;

import javax.persistence.*;

@Entity
@Table(name="transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="transaction_Id ",length=10, nullable=false)
	private int transactionId;
	
	@Column(name="payment_Mode")
	private String paymentMode;
	
	@Column(name="upi_Id", columnDefinition = "default null")
	private String upiId;
	
	@Column(name="card_Number", columnDefinition = "default null")
	private String cardNumber;

	
	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", paymentMode=" + paymentMode + ", upiId=" + upiId
				+ ", cardNumber=" + cardNumber + "]";
	}
}
