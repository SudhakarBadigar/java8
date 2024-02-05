package dsa.search;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(5);
		l.add(12);
		l.add(14);
		l.add(4);
		l.add(6);
		
		l.add(25);
		
		
		for(Object list:l) {
			System.out.print(list + " ");
		}
		System.out.println();
		
	}

}
