package org.datacare.pettycash.model;

public class NoteForMoneyUpload extends NoteSuper{
	private MoneyFromAdmin moneyFromAdmin;
	private String noteBody;

	public void setMoneyFromAdmin(MoneyFromAdmin moneyFromAdmin) {
		this.moneyFromAdmin = moneyFromAdmin;
	}

	public void setNoteBody(String noteBody) {
		this.noteBody = noteBody;
	}

	public MoneyFromAdmin getMoneyFromAdmin() {
		return this.moneyFromAdmin;
	}

	public String getNoteBody() {
		return this.noteBody;
	}

}
