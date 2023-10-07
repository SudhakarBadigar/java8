package predefinedFunctionalIntefrace;

import java.util.function.Predicate;

public class PedicateLengthOfString {
	public static void main(String[] args) {
		String[] s = {"Rama","shiva","Hanumantha","subramanya","ganesha"};
		Predicate<String> p = s1->s1.length()>5;
		for(String s1: s) {
			if(p.test(s1)) {
				System.out.println(s1);
			}
		}
	}

}
