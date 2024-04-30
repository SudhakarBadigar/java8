package dsa.search;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx2 {
	
	public static void f1(){
		int[] num = {3,4,6,7,1,14,15,16};
		for(int n:num) {
			System.out.print(n);
		}
		System.out.println();
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(".........");

		for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]  );
		}
		
	}
	
	public static void main(String[] args) {
		f1();
	}



	
}
