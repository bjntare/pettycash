package org.datacare.pettycash.model;

import java.util.Date;

public class RejectionNoteForAccountability {
	private Accountability accountability;
	private Date dateOfRejection;
	private String reason;

	public void setRequisition(Accountability accountability) {
		this.accountability = accountability;
	}

	public void setDateOfAcceptance(Date dateOfRejection) {
		this.dateOfRejection = dateOfRejection;
	}

	public void setNoteBody(String reason) {
		this.reason = reason;
	}

	public Accountability getRequisition() {
		return this.accountability;
	}

	public Date getDateOfAcceptance() {
		return dateOfRejection;
	}

	public String getNoteBody() {
		return this.reason;
	}

}
