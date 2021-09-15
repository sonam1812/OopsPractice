package com.bridgelabz.OopsPractice;

public class Student {
String name;
static int rollNo;
public Student(String name, int rollNo) {
	this.name = name;
	this.rollNo = rollNo;
	
}
@Override
public String toString() {
	return "Student [name=" + name + ", rollNo=" + rollNo + "]";
}
	@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	}
	

	


