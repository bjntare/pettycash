package org.datacare.pettycash.model;

public class Project {
	private String ProjectName,ProjectAcronym,ProjectClient,ProjectStatus,ProjectDescription;
	public Staff staff;
	
	public void setProjectName(String projectName){
		this.ProjectName=projectName;
	}
	public void setProjectAcronym(String projectAcron){
		this.ProjectAcronym=projectAcron;
	}
	public void setProjectClient(String projectClient){
		this.ProjectClient=projectClient;
	}
	public void setProjectStatus(String projectStatus){
		this.ProjectStatus=projectStatus;
	}
	public void setProjectDescription(String projectDesc){
		this.ProjectDescription=projectDesc;
	}
	public void setStaff(Staff staff){
		this.staff=staff;
	}
	
	
	public String getProjectName(){
		return ProjectName;
	}
	public String getProjectAcronym(){
		return ProjectAcronym;
	}
	public String getProjectClient(){
		return ProjectClient;
	}
	public String getProjectStatus(){
		return ProjectStatus;
	}
	public String getProjectDescription(){
		return ProjectDescription;
	}
	public Staff getStaff(){
		return staff;
	}
	
}
