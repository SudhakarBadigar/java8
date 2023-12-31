package predefinedFunctionalIntefrace;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String name;
	double salary;
	Employee(String name,double salary){
		super();
		this.name=name;
		this.salary=salary;
	}
}


public class PredicateSalary {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Rama",4000));
		l.add(new Employee("Krishna", 2000));
		l.add(new Employee("Hanumantha", 3000));
		l.add(new Employee("shiva", 8000));
		
		Predicate<Employee> p = e -> e.salary >3000;
		for( Employee e1:l) {
			if(p.test(e1)) {
				System.out.println(e1.name +" ----->" +e1.salary);
			}
		}
		
	}
	
}
