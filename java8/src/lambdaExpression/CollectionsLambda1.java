package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		l.add(78);
		l.add(18);
		l.add(12);
		l.add(20);
		l.add(0);
		System.out.println(l);
		Comparator<Integer> c = (i1,i2)->{return (i1>i2)?1:(i1<i2)?-1:0;};
		Collections.sort(l,c);
		System.out.println("Ascending"+l);
	}

}
