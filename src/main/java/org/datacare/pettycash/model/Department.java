package org.datacare.pettycash.model;

public class Department {
	public Staff staff;
	private String DepartmentName;


	public void setStaff(Staff staffMember){
		this.staff=staffMember;
			}
	public void setDepartmentName(String deptName){
		this.DepartmentName=deptName;
		}

	public Staff getStaff(){
		return this.staff;
		}
	public String getDepartmentName(){
		return this.DepartmentName;
	}

}