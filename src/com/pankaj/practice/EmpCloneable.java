package com.pankaj.practice;

/**
 * 
 * @author panrana1
 *Cloning is
a java
concept
through
which
we
can
create
a
duplicate
object
at
run
time
.

In
contrast
of
creating
a
new
object
of
the
same
type
and
setting
its
property
explicitly,
cloning
create
a
bit
by
bit
copy
of
the
object
at
run
time
.

We
can
not
clone
any
java
object
.
We
can
clone
an
object
if
its
class
is
cloneable
(implements
java
.
lang
.
Cloneable)
.

Object
class
has
clone()
method
that
is
used
to
create
a
clone
of
an
object
.
 */
public class EmpCloneable implements Cloneable {
	
	
	private int id;
	
	
	private String name;

	
	

	@Override
	protected EmpCloneable clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (EmpCloneable) super.clone();
	}




	public EmpCloneable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
	public static void main(String[] args) {
		
		try {
			EmpCloneable emp1= new EmpCloneable(1, "Nitin");
			EmpCloneable emp2= emp1.clone();
			System.out.println("emp1 == emp2 ");
			System.out.println(emp1 == emp2);
			
			System.out.println(emp2.getId());
			System.out.println(emp2.getName());
			
			System.out.println("emp1.hashCode() --->"+emp1.hashCode() );
			System.out.println("emp2.hashCode() --->"+emp2.hashCode() );
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}




	@Override
	public String toString() {
		return "Employee Details [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
