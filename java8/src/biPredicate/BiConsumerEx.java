package biPredicate;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Emp{
	String name;
	double salary;
	Emp(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
public class BiConsumerEx {
	public static void main(String[] args) {
		ArrayList<Emp> l = new ArrayList<Emp>();
		population(l);
		BiConsumer<Emp,Double> c=(e,d)->e.salary=e.salary+d;
		for(Emp e:l) {
			c.accept(e,500.0);
		}
		for(Emp e:l) {
			System.out.println("Empname:"+e.name);
			System.out.println("EmpSal :"+e.salary);
			System.out.println();
		}
	}
	
	public static void population(ArrayList<Emp> l) {
		l.add(new Emp("Rama",1000.0));
		l.add(new Emp("Krishna",2000.0));
		l.add(new Emp("Hanumantha",3000.0));
		l.add(new Emp("shiva",4000.0));
	}
}
