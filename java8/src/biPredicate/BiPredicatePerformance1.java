package biPredicate;

import java.util.function.Predicate;

public class BiPredicatePerformance1 {

	public static void main(String[] args) {
		Predicate<Integer> p  = i ->i%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(20));
		System.out.println(p.test(15));
		System.out.println(p.test(18));
		System.out.println(p.test(21));
	}
}
