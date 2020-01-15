package com.pankaj.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

	
	 

	@GetMapping("/students")
	public Map<String, List<Student>> getStudents(){
		
		ArrayList<Student> stuList= new  ArrayList<Student>();
		 stuList.add(new Student(4,"TUV", "group2"));
		 stuList.add(new Student(3,"PQR", "group1"));
		 stuList.add(new Student(2,"XYZ", "group2"));
		 stuList.add(new Student(1,"Abc", "group1"));
		 stuList.add(new Student(5,"pankaj", "group2") );
		 stuList.add(new Student(6,"Neha", "group2") );
		 stuList.add(new Student(7,"pankaj", "group1") );
		 stuList.add(new Student(8,"Ajay", "group2") );
		 stuList.add(new Student(8,"vijay", "group2") );
		 return  stuList.stream().collect(Collectors.groupingBy(Student::getGroup,
				 							Collectors.toList()));


		
	}
	// group by two field 
	/*"group1": {
        "1": [
            {
                "id": 1,
                "name": "Abc",
                "group": "group1"
            }
        ],
        "3": [
            {
                "id": 3,
                "name": "PQR",
                "group": "group1"
            }
        ],
     	"8": [
            {
                "id": 8,
                "name": "Ajay",
                "group": "group2"
            },
            {
                "id": 8,
                "name": "vijay",
                "group": "group2"
            }
        ]
    }
	 * 
	 * 
	 */
	@GetMapping("/students1")
	public Map<String, Map<Integer, List<Student>>> getStudents1(){
		
		ArrayList<Student> stuList= new  ArrayList<Student>();
		 stuList.add(new Student(4,"TUV", "group2"));
		 stuList.add(new Student(3,"PQR", "group1"));
		 stuList.add(new Student(2,"XYZ", "group2"));
		 stuList.add(new Student(1,"Abc", "group1"));
		 stuList.add(new Student(5,"pankaj", "group2") );
		 stuList.add(new Student(6,"Neha", "group2") );
		 stuList.add(new Student(7,"pankaj", "group1") );
		 stuList.add(new Student(8,"Ajay", "group2") );
		 stuList.add(new Student(8,"vijay", "group2") );
		 return  stuList.stream().collect(Collectors.groupingBy(Student::getGroup,
				 							Collectors.groupingBy(Student::getId,Collectors.toList())));


		
	}
}
