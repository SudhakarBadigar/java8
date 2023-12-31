package predefinedFunctionalIntefrace;

import java.util.ArrayList;
import java.util.function.Predicate;

class Student{
	String name;
	int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}

public class PredicateEmpOrStu {
	public static void main(String[] args) {
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(new Student("Rama", 5));
		l.add(new Student("Krishna", 6));
		l.add(new Student("Hanumantha", 3));
		l.add(new Student("shiva", 2));
		l.add(new Student("Ganesha", 1));
		l.add(new Student("Subramanya", 4));
		System.out.println(l);
		Predicate<Student> p = e->e.id>2;
		for(Student s :l) {
			if(p.test(s)) {
				System.out.println(s.name +":" +s.id);
			}
		}
	}
	

}
