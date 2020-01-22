package com.pakaj.serializable.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SerializationDemo {
public static void main(String[] args) {
	
	AddressSerializabale address=new AddressSerializabale("G 38 A", "Nangaloi", "DELHI", "Delhi", "INdia");
	Date dob = null;
	try {
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		dob =df.parse("28/01/1989") ;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Person person1= new Person("Pankaj Rana", dob, 30.0, address);
	
	  final String fileName = System.getProperty("user.dir")+"//person1.ser";
	  // serializing
	  Util.serialzeObject(person1, fileName);
	  
	  
	  try {
		   // deserializing
		   person1 = (Person)Util.deserializedObject(fileName);
		  } catch (Exception e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  System.out.println("deserialized object ---- ");
		  System.out.println("Name " + person1.getName());
		  System.out.println("DOB " + person1.getDob());
		  System.out.println("Age " + person1.getAge());
		  System.out.println("Address Line1 " + person1.getAddress().getAddressLine1());
		  System.out.println("Address Line2 " + person1.getAddress().getAddressLine2());
		  System.out.println("City " + person1.getAddress().getCity());
		  System.out.println("State " + person1.getAddress().getState());
		  System.out.println("Country " + person1.getAddress().getCountry());
	  
}
}
