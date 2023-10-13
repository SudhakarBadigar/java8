package predefinedFunctionalIntefrace;

import java.util.function.Predicate;

public class PredicateJoining3 {

	public static void main(String[] args) {
		int[] z = {0,2,3,5,6,8,9,10,12,13,14,15};
		Predicate<Integer> p1 = e-> e%2==0;
		for(Integer i :z) {
			if(p1.negate().test(i)) {
				System.out.println(i);
			}
		}
	}
}
