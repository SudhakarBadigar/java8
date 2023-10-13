package predefinedFunctionalIntefrace;

import java.util.function.Predicate;

public class PredicateJoining1 {
	public static void main(String[] args) {
		System.out.println("start");
		int x[] = {0,4,5,6,8,10,12,15,20,25,30,34,35};
		Predicate<Integer> p1 = e->e%2==0;
		Predicate<Integer> p2 = e->e>10;
		
		for(int i:x) {
		if(p1.and(p2).test(i)) {
			System.out.println(i);
		}
			
	}
		System.out.println("end");
	
	}
}
