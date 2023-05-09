package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {

	@Id
	private int projectId;
	private String projectName;
	
	@ManyToMany(mappedBy="projects")
	private List<Emp> employees;
	public Project(int projectId, String projectName, List<Emp> employees) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employees = employees;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Emp> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Emp> employees) {
		this.employees = employees;
	}
	
	
}
