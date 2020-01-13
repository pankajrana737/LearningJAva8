package com.pankaj.practice;

import java.util.Date;
/**
 * 
 * @author panrana1
 * 
 * Rule For Immutable  Class

Ensure class can’t be extended ( 
final class
)

Make all fields 
final
.

Make all fields 
private

Don’t provide any method that modify the object’s state i.e. don’t provide 
setters 
methods.

Ensure exclusive access to any mutable components. 

If class has any field that refer to a mutable objects, ensure that clients of that class can not obtain references to these 
obj
ects.

If instance variable  are mutable, return  a new object  with copied content from there  getter methods
 *
 */
final public class ImmutbaleClass {
	
	private final  Integer integer;
	
	private  final String str;
	// muttable filed 
	private final  Date date;

	public Integer getInteger() {
		return integer;
	}

	public String getStr() {
		return str;
	}
	//
	public Date getDate() {
		
		// If instance variable  are mutable,
		//return  a new object  with copied content from there  getter methods
		// return date;
		return new Date(this.date.getTime());
	}

	public ImmutbaleClass(Integer integer, String str, Date date) {
		super();
		this.integer = integer;
		this.str = str;
		this.date = new Date(date.getTime());
	}
	
	

}
