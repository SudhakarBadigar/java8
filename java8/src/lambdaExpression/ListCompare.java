package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListCompare {
	String ename;
	int eno;
	
	public ListCompare(String name,int no) {
		this.ename= name;
		this.eno=no;
	}
	
	
	@Override
	public String toString() {
		return "Name = " + ename + " Id = " + eno;
	}
	public static void main(String[] args) {
		ListCompare l = new ListCompare("gandhi", 244);
		System.out.println(l);
		System.out.println(".........................");
		ArrayList<ListCompare>l1 = new ArrayList<ListCompare>();
		l1.add(new ListCompare("Rama", 11000));
		l1.add(new ListCompare("Krishna", 125));
		l1.add(new ListCompare("Hanumantha",825));
		l1.add(new ListCompare("Balarama",126));
		System.out.println(l1);
		System.out.println(".......................");
		Collections.sort(l1,new Mycompare());
		System.out.println(l1);
		System.out.println("........................");
		System.out.println("sort by names" + l1);
	}

}

class Mycompare  implements Comparator<ListCompare>{
	public int compare(ListCompare i1,ListCompare i2) {
		return (i1.eno>i2.eno)?1:(i1.eno<i2.eno)?-1:0;
	}
}
 
class mycomparable extends ListCompare implements Comparable<ListCompare>{
	public mycomparable(String name, int no) {
		super(name, no);

	}
	public int compareTo(ListCompare i) {
		return this.ename.compareTo(i.ename);
	}
}