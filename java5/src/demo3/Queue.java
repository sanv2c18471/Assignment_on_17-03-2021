package demo3;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue <Integer>();
	PriorityQueue pq1 = new PriorityQueue <Integer>();
	//pq.add("sam");
	//pq.add("anu");
	//pq.add("priya");
	//pq.add("pavi");
	pq.add(23);
	pq.add(11);
	pq.add(56);
	pq.add(5);
	System.out.println("headelement: " + pq.element());
	System.out.println("headpeek: " + pq.peek());
	Iterator <Integer> it = pq.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
pq.remove();
pq.poll();
System.out.println("After removing");
Iterator <Integer> it1 = pq.iterator();
while(it1.hasNext()) {
	System.out.println(it1.next());
}

System.out.println("headpeek: " + pq1.peek());
//System.out.println("headelement: " + pq1.element());
//pq1.poll();
pq1.remove();

}
}