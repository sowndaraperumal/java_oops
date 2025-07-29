package com.oops.inheritance;


class Persons{
	String name;
	void setName(String name) {
		this.name=name;
	}
}

class Student extends Persons{
	void study() {
		System.out.println(name +" is studying");
	}
	
}
class Teacher extends Persons{
	void teach() {
		System.out.println(name +" is teaching");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Student st= new Student();
		st.setName("sowndar");
		st.study();
		Teacher te =new Teacher();
		te.setName("Hari");
		te.teach();
	}
}
