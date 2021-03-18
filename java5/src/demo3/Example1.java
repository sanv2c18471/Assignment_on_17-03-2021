package demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		ArrayList <Customer> al = new ArrayList <Customer>();
		al.add(new Customer ("vanitha", 45, 1500));
		al.add(new Customer ("ram", 56, 3500));
		al.add(new Customer ("mani", 36, 500));
		al.add(new Customer ("kiran", 49, 4000));
		
		System.out.println("Sorting by name.....");
		Collections.sort(al,new NameComparator());
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Customer cu = (Customer)it.next();
			System.out.println(cu.name+" "+cu.age+" "+cu.money);
		}
		
		System.out.println("Sorting by age.....");
		Collections.sort(al,new AgeComparator());
		Iterator it1 = al.iterator();
		while(it1.hasNext()) {
			Customer cu = (Customer)it1.next();
			System.out.println(cu.name+"  "+cu.age+"  "+cu.money);
	}
	}
}
