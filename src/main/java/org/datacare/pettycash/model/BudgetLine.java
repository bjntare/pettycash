package org.datacare.pettycash.model;

public class BudgetLine {
	private String activity;
	private double amount;

	public String getActivity() {
		return this.activity;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
