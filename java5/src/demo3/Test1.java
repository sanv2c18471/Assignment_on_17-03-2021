package demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
public static void main(String[] args) {
	ArrayList <School> al = new ArrayList <School>();
	al.add(new School (2,13,"vanitha"));
	al.add(new School (1,27,"Ram"));
	al.add(new School (4,19,"mani"));
	al.add(new School (3,23,"kiran"));
	
	Collections.sort(al);
	for(School sc : al) {
		System.out.println(sc.rollno+" "+sc.age+" "+sc.name);
	}
	
}
}
