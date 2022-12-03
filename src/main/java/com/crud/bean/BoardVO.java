package com.crud.bean;

import java.util.Date;

public class BoardVO {

	private String customerName;
	private int customerNumbers;
	private String menu;
	private int contactNum;
	private Date date;
	private String requests;
	private String paymentMethod;
	private int orderNum;

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerNumbers() {
		return customerNumbers;
	}

	public void setCustomerNumbers(int customerNumbers) {
		this.customerNumbers = customerNumbers;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getContactNum() {
		return contactNum;
	}

	public void setContactNum(int contactNum) {
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
