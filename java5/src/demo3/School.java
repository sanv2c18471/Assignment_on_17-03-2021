package demo3;

class School implements Comparable <School>{
	

int rollno,age;
String name;

public School(int rollno, int age, String name) {
	super();
	this.rollno = rollno;
	this.age = age;
	this.name = name;
}

public int  compareTo(School s) {
	//if(name.equals(name)) {
	if(age==s.age) {
		return 0;
	}
	else if(age>s.age) {
			return 1;
	}
else {
				return -1;
			}
		
}
}
