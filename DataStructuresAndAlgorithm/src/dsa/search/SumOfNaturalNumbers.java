package dsa.search;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double now = System.currentTimeMillis();
		SumOfNaturalNumbers son = new SumOfNaturalNumbers();
		System.out.println("enter the Natural number that you want sum of it");
		int s = scan.nextInt();
		
//		int result = son.sum(s);
//		System.out.println("Total of natural numbers is " +result);
		
		int res = son.sumOfN(s);
		System.out.println("Result is "+res);
		
		System.out.println("time taken is " + (System.currentTimeMillis()-now) +"milliseconds");
		scan.close();
	}
	
//	public int sum(int n) {
//		return n*(n+1)/2;
//	}
	
	public int sumOfN(int s) {
		int add=0;
		for(int i=1;i<=s;i++) {
			add=add+i;
		}
		return add;
	}
}
