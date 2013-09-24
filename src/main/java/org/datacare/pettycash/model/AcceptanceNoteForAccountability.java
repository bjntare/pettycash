package org.datacare.pettycash.model;

import java.util.Date;

public class AcceptanceNoteForAccountability extends NoteSuper{
	private Accountability accountability;
	private Date dateOfAcceptance;
	private String noteBody;

	public void setAccountability(Accountability accountability) {
		this.accountability = accountability;
	}


	public void setDateOfAcceptance(Date dateOfAcceptance) {
		this.dateOfAcceptance = dateOfAcceptance;
	}

	public void setNoteBody(String noteBody) {
		this.noteBody = noteBody;
	}

	public Accountability getAccountability() {
		return this.accountability;
	}

	public Date getDateOfAcceptance() {
		return dateOfAcceptance;
	}

	public String getNoteBody() {
		return this.noteBody;
	}

}
