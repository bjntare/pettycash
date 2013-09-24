package org.datacare.pettycash.model;

import java.util.Date;

public class AcceptanceNoteForRequisition extends NoteSuper{
	private Requisition requisition;
	private Date dateOfAcceptance;
	private String noteBody;

	public void setRequisition(Requisition requisition) {
		this.requisition = requisition;
	}

	public void setDateOfAcceptance(Date dateOfAcceptance) {
		this.dateOfAcceptance = dateOfAcceptance;
	}

	public void setNoteBody(String noteBody) {
		this.noteBody = noteBody;
	}

	public Requisition getRequisition() {
		return this.requisition;
	}

	public Date getDateOfAcceptance() {
		return dateOfAcceptance;
	}

	public String getNoteBody() {
		return this.noteBody;
	}

}
