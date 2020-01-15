package com.pankaj.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
	private static final String List = null;

	private Integer id;

	private String name;
	private String group;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public Student(Integer id, String name, String group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", group=" + group + "]";
	}
	public static void main(String[] args) {
		 Student s1= new Student(1,"Abc", "group1");
		 Student s2= new Student(2,"XYZ", "group2");
		 Student s3= new Student(3,"PQR", "group1");
		 Student s4= new Student(4,"TUV", "group2");
		 
		 ArrayList<Student> stuList= new  ArrayList<Student>();
		 stuList.add(s4);
		 stuList.add(s2);
		 stuList.add(s3);
		 stuList.add(s1);
		 stuList.add(new Student(5,"pankaj", "group2") );
		 stuList.add(new Student(6,"Neha", "group2") );
		 stuList.add(new Student(7,"pankaj", "group1") );
		 stuList.add(new Student(8,"Ajay", "group2") );
		 
		 Map<String, List<Student>> studentGtroupList = stuList.stream().collect(Collectors.groupingBy(Student::getGroup,Collectors.toList()));
		 studentGtroupList.entrySet().stream().forEach(s->System.out.println(s.getKey()+" --->\n"+s.getValue()));
	}
}
