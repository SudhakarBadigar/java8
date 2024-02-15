package dsa.search;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		int[] numbers;
		numbers=new int[5];
		numbers[0]=11;
		numbers[1]=-8;
		numbers[2]=0;
		numbers[3]=-23;
		numbers[4]=88;
		
		int num[]= {10,-4,6,-3,-22,-66,0,12};
		String[] name= {"pqr","jkl","abc"};
		
		System.out.println(numbers);
		System.out.println("------------");
		for(int i:numbers) {
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println("...........");
		Arrays.sort(numbers);
	    for(int j:numbers) {
	    	System.out.print(j +" ");
	    }
	    System.out.println();
	    System.out.println("...........");
	    for(int k:num) {
	    	System.out.print(k +" ");
	    }
	    Arrays.sort(num,0,5);
	    System.out.println();
	    System.out.println("...........");
	    for(int m:num) {
	    	System.out.print(m +" ");
	    }
	    System.out.println();
	    System.out.println("..............");
	    for(String a:name) {
	    	System.out.println(a);
	    }
	   System.out.println();
	    System.out.println(".............");
	   
	    Arrays.sort(name);
	    for(String b:name) {
	    	System.out.print(b +" ");
	    }
	    
	}

}
