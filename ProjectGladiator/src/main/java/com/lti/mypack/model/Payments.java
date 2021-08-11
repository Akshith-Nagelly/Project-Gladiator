package com.lti.mypack.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="payments")
public class Payments {
	@Id
	private int payment_id;
	private double amount_paid;
	private String payment_status;
	private double refund_amount;
	private String refund_status;
	private int booking_id;
	public Payments() {
		super();
		
	}
	public Payments(int payment_id, double amount_paid, String payment_status, double refund_amount,
			String refund_status, int booking_id) {
		super();
		this.payment_id = payment_id;
		this.amount_paid = amount_paid;
		this.payment_status = payment_status;
		this.refund_amount = refund_amount;
		this.refund_status = refund_status;
		this.booking_id = booking_id;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public double getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(double amount_paid) {
		this.amount_paid = amount_paid;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	public double getRefund_amount() {
		return refund_amount;
	}
	public void setRefund_amount(double refund_amount) {
		this.refund_amount = refund_amount;
	}
	public String getRefund_status() {
		return refund_status;
	}
	public void setRefund_status(String refund_status) {
		this.refund_status = refund_status;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	
	

}
