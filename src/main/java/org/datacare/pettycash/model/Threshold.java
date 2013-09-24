package org.datacare.pettycash.model;

public class Threshold {

	private MoneyFromAdmin moneyItBelongsTo;
	private double[] pointsOfAlerts;

	public void setMoneyFromAdmin(MoneyFromAdmin moneyFromAdmin) {
		this.moneyItBelongsTo = moneyFromAdmin;
	}

	public void setPointsOfAlerts(double[] pointsOfAlerts) {
		this.pointsOfAlerts = pointsOfAlerts;
	}

	public MoneyFromAdmin getMoneyItBelongsTo() {
		return this.moneyItBelongsTo;
	}

	public double[] getPointsOfAlerts() {
		return this.pointsOfAlerts;
	}
}
