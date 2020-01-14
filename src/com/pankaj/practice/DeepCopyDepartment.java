package com.pankaj.practice;

public class DeepCopyDepartment implements Cloneable{
	
	private int id;
	private String name;
	private EmpCloneable deptName;
	@Override
	protected DeepCopyDepartment clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepCopyDepartment cloneObj = (DeepCopyDepartment) super.clone();
		cloneObj.setDeptName(getDeptName().clone());
		return cloneObj;
	}

	public DeepCopyDepartment(int id, String name, EmpCloneable deptName) {
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
		
		DeepCopyDepartment dept1= new DeepCopyDepartment(1, "IT", emp);
			DeepCopyDepartment dept2 = dept1.clone();
			
			System.out.println(emp);
			System.out.println(dept1.getDeptName() == dept2.getDeptName());
		/**
		 * If we clone an object through deep - o - copy, contained object also should be cloned . 
			If a change is made in the department head of dept 1 ,
			 those changes will not be reflected to the dept 2 .
		 */
			dept1.getDeptName().setId(2);
			System.out.println( "dept1 DeptName  "+dept1.getDeptName());
			System.out.println( "dept2 DeptName  "+ dept2.getDeptName());
			
			System.out.println(dept1.getDeptName() == dept2.getDeptName());
	}

	@Override
	public String toString() {
		return "DeepCopyDepartment [id=" + id + ", name=" + name + ", deptName=" + deptName + "]";
	}
	
	
}
