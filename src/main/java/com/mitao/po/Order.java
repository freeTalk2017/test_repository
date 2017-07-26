package com.mitao.po;

import java.sql.Timestamp;

public class Order {

	private String orderID;
	private String userID;
	private Timestamp createTimeStamp;
	private String orderStatus;
	private String distribution;
	private String billType;
	private String billHeader;
	private String billDetail;
	private Byte payment;
	private Byte payType;
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public Timestamp getCreateTimeStamp() {
		return createTimeStamp;
	}
	public void setCreateTimeStamp(Timestamp createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getDistribution() {
		return distribution;
	}
	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getBillHeader() {
		return billHeader;
	}
	public void setBillHeader(String billHeader) {
		this.billHeader = billHeader;
	}
	public String getBillDetail() {
		return billDetail;
	}
	public void setBillDetail(String billDetail) {
		this.billDetail = billDetail;
	}
	public Byte getPayment() {
		return payment;
	}
	public void setPayment(Byte payment) {
		this.payment = payment;
	}
	public Byte getPayType() {
		return payType;
	}
	public void setPayType(Byte payType) {
		this.payType = payType;
	}
	
}
