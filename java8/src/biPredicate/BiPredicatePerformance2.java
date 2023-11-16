package biPredicate;

import java.util.function.Predicate;

public class BiPredicatePerformance2 {

	public static void main(String[] args) {
		int x[] = {5,10,15,18,20,21,22};
		Predicate<Integer> p = i->i%2==0;
		for(int x1:x) {
			System.out.println(p.test(x1));
			System.out.println(".......");
		}
	}
}
