package predefinedFunctionalIntefrace;

import java.util.function.Predicate;

public class PredicateJoining2 {
	public static void main(String[] args) {
		int y[]= {0,3,5,6,8,10,12,15,18,21,22,24,25,26};
		Predicate<Integer> p1 = e-> e%2==0;
		Predicate<Integer> p2 = e->e>10;
		for(Integer i:y) {
			if(p1.or(p2).test(i)) {
				System.out.println(i);
			}
		}
	}

}
