package org.datacare.pettycash.model;

import java.util.Date;

public class Accountability {
	private String ReferenceNumber;
	public Requisition ItemNameRequested;
	private double ItemAmount;
	private Date AccountabilityDate;
	public Staff StaffMember;
	
	public void setReferenceNumber(String referenceNo){
		this.ReferenceNumber=referenceNo;
		
	}
	public void setAccountabilityDate(Date accountabilityDate){
		this.AccountabilityDate=accountabilityDate;
	}
	public void setItemNameRequested(Requisition itemName){
		this.ItemNameRequested=itemName;
	}
	public void setItemAmount(double itemAmt){
		this.ItemAmount=itemAmt;
	}
	public void setStaffMember(Staff staffMember){
		this.StaffMember=staffMember;
	}
	
	public String getReferenceNumumber(){
		return this.ReferenceNumber;
	}
	public Requisition getItemNameRequested(){
		return this.ItemNameRequested;
	}
	public double getItemAmount(){
		return this.ItemAmount;
	}
	public Date getAccountabilityDate(){
		return this.AccountabilityDate;
	}
	public Staff getStaffMember(){
		return this.StaffMember;
	}
}