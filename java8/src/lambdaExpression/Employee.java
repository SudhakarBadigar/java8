package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

class Test1{
	String name;
	int eno;
	public Test1(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}
	@Override
	public String toString() {
		return "name=" + name + " eno=" + eno;
	}
	
}

public class Employee {
	public static void main(String[] args) {
		Test1 t1 = new Test1("madan", 10);
		System.out.println(t1);
		System.out.println("........................");
		ArrayList<Test1> a = new ArrayList<Test1>();
		a.add(new Test1("sunny",86));
		a.add(new Test1("Danny", 675));
		a.add(new Test1("bunny", 435));
		a.add(new Test1("mannny", 787));
		a.add(new Test1("vinny", 3433));
		a.add(new Test1("kianny", 1275));
		System.out.println(a);
		System.out.println("...............");
		Collections.sort(a,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println(a);
		System.out.println(".............");
		System.out.println("Ascending order by ids");
		System.out.println(".............");
		for(Test1 ids: a) {
			System.out.println(ids);
		}
		System.out.println(".......................");
		Collections.sort(a,(e1,e2)-> e1.name.compareToIgnoreCase(e2.name));
		System.out.println(a);
		System.out.println(".....................");
		System.out.println("sorting by Name");
		System.out.println(".....................");
		
		for(Test1 names:a) {
			System.out.println(names);
		}
	}
	
}
