package com.pankaj.practice;

public class ShelloDepartment implements Cloneable{
	
	private int id;
	private String name;
	private EmpCloneable deptName;
	@Override
	protected ShelloDepartment clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (ShelloDepartment) super.clone();
	}

	public ShelloDepartment(int id, String name, EmpCloneable deptName) {
		super();
		this.id = id;
		this.name = name;
		this.deptName = deptName;
	}
	
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the deptName
	 */
	public EmpCloneable getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(EmpCloneable deptName) {
		this.deptName = deptName;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		EmpCloneable emp= new  EmpCloneable(1,"Pankaj Rana");
		
		ShelloDepartment dept1= new ShelloDepartment(1, "IT", emp);
			ShelloDepartment dept2 = dept1.clone();
			
			System.out.println(emp);
			System.out.println(dept1.getDeptName() == dept2.getDeptName());
			//Default implementation of clone method in Object class copy references of contained objects
			//(We do not have a separate copy of the contained object) .
			//If a change is made in the department head of dept 1 , those changes will also be reflected to the dept 2 .
			
			dept1.getDeptName().setId(2);
			
			System.out.println(dept2.getDeptName());
			
			System.out.println(dept1.getDeptName() == dept2.getDeptName());
	}

	@Override
	public String toString() {
		return "ShelloDepartment [id=" + id + ", name=" + name + ", deptName=" + deptName + "]";
	}
	
	
}
