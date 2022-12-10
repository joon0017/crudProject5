package com.crud.bean;

import java.util.Date;

public class BoardVO {

	private String customerName;
	private String customerNumbers;
	private String menu;
	private String contactNum;
	private Date date;
	private String requests;
	private String paymentMethod;
	private int seq;

	public String getOrderNum() {
		return Integer.toString(seq);
	}

	public void setOrderNum(int seq) {
		this.seq = seq;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerNumbers() {
		return customerNumbers;
	}

	public void setCustomerNumbers(String customerNumbers) {
		this.customerNumbers = customerNumbers;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRequests() {
		return requests;
	}

	public void setRequests(String requests) {
		this.requests = requests;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
