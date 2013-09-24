package org.datacare.pettycash.model;

public class Staff {
	private String FirstName,LastName,UserName,Email,Password,Status,UserGroup;
	public Department[] department;
	public void setFirstName(String firstN){
		this.FirstName=firstN;
}	
	public void setLastName(String lastN){
		this.LastName=lastN;
	}
	public void setUserName(String uName){
		this.UserName=uName;
	}
	public void setEmail(String mail){
		this.Email=mail;
	}
	public void setPassword(String pass){
		this.Password=pass;
	}
	public void setStatus(String st){
		this.Status=st;
	}
	public void setUserGroup(String userG){
		this.UserGroup=userG;
	}
	public void setDepartment(Department[] dept){
		this.department=dept;
	}
	
	
	public String getFirstName(){
		return this.FirstName;
	}
	public String getLastName(){
		return this.LastName;
	}
	public String getUserName(){
		return this.UserName;
	}
	public String getEmail(){
		return this.Email;
	}
	public String getPassword(){
		return this.Password;
	}
	public String getStatus(){
		return this.Status;
	}
	public String UserGroup(){
		return this.UserGroup;
	}
	public Department[] department(){
		return this.department;
	}

}
