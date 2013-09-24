package org.datacare.pettycash.model;

import java.util.Date;

public class Refund {
	private String referenceNumber;
	private double amountToRefund;
	private Requisition requisition;
	private Date dateOfRefund;
	private MoneyFromAdmin []moneyServicingRefund;
	
	public void setReferenceNumber(String referenceNumber){
		this.referenceNumber = referenceNumber;
	}
	
	public void setAmount( double amount ){
		this.amountToRefund = amount;
	}
	
	public void setRequisition(Requisition requisition){
		this.requisition = requisition;
	}
	
	public void setDateOfRefund(Date dateOfRefund){
		this.dateOfRefund = dateOfRefund;
	}
	
	public void setMoneyServicingRefund(MoneyFromAdmin [] money){
		this.moneyServicingRefund = money;
	}
	
	public double getAmount(){
		return this.amountToRefund;
	}
	
	public String getReferenceNumber(){
		return this.referenceNumber;
	}
	public Requisition getRequisition(){
		return this.requisition;
	}
	
	public Date getDateOfRefund(){
		return dateOfRefund;
	}
	
	public MoneyFromAdmin[] getMoneyServicingRefund(){
		return this.moneyServicingRefund;
	}

}
