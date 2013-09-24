package org.datacare.pettycash.model;

import java.util.Date;

public class MoneyFromAdmin {
	private double amoutInjected;
	private String moneyReferenceNumber;
	private Date dateOfInjection;
	private Staff staffWhoInjects;
	private BudgetLine[] budgetLines;

	public void setAmountInjected(double amountInjected) {
		this.amoutInjected = amountInjected;
	}

	public void setMoneyReferenceNumber(String moneyReferenceNumber) {
		this.moneyReferenceNumber = moneyReferenceNumber;
	}

	public void setDateOfInjection(Date dateOfInjection) {
		this.dateOfInjection = dateOfInjection;
	}

	public void setStaffWhoInjects(Staff staffWhoInjects) {
		this.staffWhoInjects = staffWhoInjects;
	}

	public void setBudgetLines(BudgetLine[] budgetLines) {
		this.budgetLines = budgetLines;
	}

	public Date getDateOfInjection() {
		return this.dateOfInjection;
	}

	public Staff getStaffWhoInjects() {
		return this.staffWhoInjects;
	}

	public double getMoneyReferenceNumber() {
		return this.amoutInjected;
	}

	public String getAmountInjected() {
		return this.moneyReferenceNumber;
	}
	
	public BudgetLine[] getBudgetLine(){
		return this.budgetLines;
	}

}
