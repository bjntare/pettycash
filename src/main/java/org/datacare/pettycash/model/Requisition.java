package org.datacare.pettycash.model;

import java.util.Date;

public class Requisition {
	private String Purpose,Activity,ReferenceNumber;
		private double Amount;
		public Project Project;
		private Date RequisitionDate;
		public Staff StaffMember;
		private MoneyFromAdmin[] moneyServicingRequisition;
		private BudgetLine budgetLine;
		private boolean requisitionStatus;
		private Date dateOfImplementation;

		public void setMoneyFromAdmin(MoneyFromAdmin[] moneyFromAdmin) {
			this.moneyServicingRequisition = moneyFromAdmin;
		}
		public void setBudgetLine(BudgetLine budgetLine) {
			this.budgetLine = budgetLine;
		}
		public void setDateOfImplementation(Date dateOfImplementation) {
			this.dateOfImplementation = dateOfImplementation;
		}
		public void setRequisitionStatus(boolean requisitionStatus) {
			this.requisitionStatus = requisitionStatus;
		}


		

		
		public void setReferenceNumber(String ref_no){
			this.ReferenceNumber=ref_no;
			
		}
		public void setAmount(double amt){
			this.Amount=amt;
			
		}
	public void setActivity(String activity){
		this.Activity=activity;
		
	}
	public void setPurpose(String purpose){
		this.Purpose=purpose;
	}
	
	
	public void setProject(Project project){
		this.Project=project;
	}
	public void setRequisitionDate(Date reqDate){
		this.RequisitionDate=reqDate;
	}
	public void setStaffMember(Staff staffMember)
	{
		this.StaffMember=staffMember;
	}
    
	public String getReferenceNumber(){
		
		return this.ReferenceNumber;
	}
	 public double getAmount(){
			
			return this.Amount;
		}
	
	public String getActivity(){
		return this.Activity;
		
	}
   
	public String getPurpose(){
		return this.Purpose;
		
	}
	
	
	public Project getProject(){
		return this.Project;
	}
	public Date getRequisitionDate(){
		return this.RequisitionDate;
	}
	public Staff getStaffMember(){
		return this.StaffMember;
	}
	public BudgetLine getBudgetLine() {
		return this.budgetLine;
	}
	public Date getDateOfImplementation() {
		return this.dateOfImplementation;
	}
	public MoneyFromAdmin[] getMoneyServicingRequisition() {
		return this.moneyServicingRequisition;
	}
	

}
