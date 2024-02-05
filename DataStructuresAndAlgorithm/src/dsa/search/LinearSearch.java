package dsa.search;

public class LinearSearch {

	public static void main(String[] args) {

		int num[]= {10,12,13,15,17,18,19,20,22,24,21};
		int target=24;
		//int steps =0;
		int result =linearSearch(num,target);
		int result2 = binarySearch(num,target);
		if(result != -1) {
		System.out.println("Element found at index : " + result);
		System.out.println("Element found at index : " + result2);
		}
		else
			System.out.println("Element Not Found");
	}

		public static int linearSearch(int[] num, int target) {
			int steps=0;
			
			for(int i=0;i<=num.length-1;i++) {
				steps++;
			 ///  System.out.println("Number of steps :" + steps++);
				if(num[i] == target) {
					System.out.println("steps taken by linear search" +steps);
					return i;
				}
			}
			System.out.println("steps taken by linear search" +steps);
			return -1;
	}
		
		public static int binarySearch(int[] num, int target) {
			int step =0;
			int left =0;
			int right = num.length -1;
			while(left<=right) {
				step++;
				int mid = (left+right)/2;
				if(num[mid] == target) {
					System.out.println("steps taken by binary search" +step);
					return mid;
				}
				else if(num[mid]<target) {
					left = mid + 1;
					
				}
				else right =mid - 1;
				
			
			}
			System.out.println("steps taken by binary search" +step);
			return - 1;
		}

}
