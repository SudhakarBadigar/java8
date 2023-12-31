package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//class comparatorEx implements Comparator<Integer>{
//    public int compare(Integer i1,Integer i2){
//    	return (i1>i2)?1:(i1<i2)?-1:0;
//    	
//    }
//}

public class CollectionsLambda1 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(8);
		l.add(75);
		l.add(13);
		l.add(12);
		l.add(21);
		l.add(0);
		System.out.println(l);
		Comparator<Integer> c = (i1,i2)->{return (i1>i2)?1:(i1<i2)?-1:0;};
		Collections.sort(l,c);
		System.out.println(".................");
		System.out.println("Ascending"+l);
		System.out.println("................");
		l.stream().forEach(System.out::println);
		System.out.println("................");
		List l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("prints only even numbers"+l2);
	}

}
