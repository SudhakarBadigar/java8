package predefinedFunctionalIntefrace;

import java.util.function.Predicate;

public class PredicateEven {

	public static void main(String[] args) {
		Predicate<Integer> p = i->i%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(15));
		System.out.println(p.test(14));
		System.out.println(p.test(11));
	}
}
