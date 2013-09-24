package org.datacare.pettycash.model;

import java.util.Date;

public class APCMSAccount {
	private String ReferenceNumber;
	private double AmountInput;
	public Staff StaffMember;
	public Date dateOfInsertion;
	
	public void setReferenceNumber(String referenceNumber){
		this.ReferenceNumber=referenceNumber;
	}
	public void setAmountInput(double amount){
		this.AmountInput=amount;
	}
	public void setStaffMember(Staff staffMember){
		this.StaffMember=staffMember;
	}
	
	
	public String getReferenceNumber(){
		return this.ReferenceNumber;
	}
	public double getAmountInput(){
		return this.AmountInput;
	}
	public Staff getStaffMember(){
		return this.StaffMember;
	}
}
