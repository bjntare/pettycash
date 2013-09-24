package org.datacare.pettycash.model;

import java.util.Date;

public class RejectionNoteForRequisition {
	private Requisition requisition;
	private Date dateOfRejection;
	private String reason;

	public void setRequisition(Requisition requisition) {
		this.requisition = requisition;
	}

	public void setDateOfAcceptance(Date dateOfRejection) {
		this.dateOfRejection = dateOfRejection;
	}

	public void setNoteBody(String reason) {
		this.reason = reason;
	}

	public Requisition getRequisition() {
		return this.requisition;
	}

	public Date getDateOfAcceptance() {
		return dateOfRejection;
	}

	public String getNoteBody() {
		return this.reason;
	}

}
