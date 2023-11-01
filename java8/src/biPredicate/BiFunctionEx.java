package biPredicate;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee{
	int eno;
	String name;
	Employee(int eno,String name){
		this.eno=eno;
		this.name=name;
	}
}

public class BiFunctionEx {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		BiFunction<Integer, String, Employee> f = (eno,name)-> new Employee(eno,name);
		l.add(f.apply(100,"Rama"));
		l.add(f.apply(200,"Hanumantha"));
		l.add(f.apply(300,"Krishna"));
		
		for(Employee e:l) {
			System.out.println("Emp No  :" + e.eno);
			System.out.println("Emp Name:" + e.name);
			System.out.println("");
		}
	}
}
