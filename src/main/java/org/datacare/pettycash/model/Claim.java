package org.datacare.pettycash.model;

import java.util.Date;

public class Claim {
	private String ReferenceNumber;
	private double ClaimAmount;
	public Staff Claimer;
	public Date dateOfClaim;
	
	public void setClaimer(Staff claimer){
		this.Claimer=claimer;
	}
	public void setReferenceNumber(String reference){
		this.ReferenceNumber=reference;
	}
	public void setClaimAmount(double claimAmount){
		this.ClaimAmount=claimAmount;
	}
	public void setDateOfClaim(Date dateOfClaim){
		this.dateOfClaim=dateOfClaim;
	}
	
	public Staff getClaimer(){
		return this.Claimer;
	}
	public String getReferenceNumber(){
		return this.ReferenceNumber;
	}
	public double getClaimAmount(){
		return this.ClaimAmount;
	}
	public Date getDateOfClaim(){
		return this.dateOfClaim;
	}

}
