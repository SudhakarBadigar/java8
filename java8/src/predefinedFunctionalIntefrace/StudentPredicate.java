package predefinedFunctionalIntefrace;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student2{
	 String name;
	 int marks;
	 public Student2(String name,int marks){
		 super();
		 this.name=name;
		 this.marks=marks;
	 }
}
public class StudentPredicate {
	public static void main(String[] args) {
		Function<Student2, String> f = s-> {
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A[Distinction]";
			else if(marks>=60) grade ="B[first Class]";
			else if(marks>=50) grade ="c[second Class]";
			else if(marks>=35) grade ="D[pass]";
			else grade ="E[fail]";
			return grade;
		};
		
		Predicate<Student2> p= s1-> s1.marks >= 60;
		
		Consumer<Student2> c = s1->{
			System.out.println("StudentName: " + s1.name);
			System.out.println("StudentMarks: " + s1.marks);
			System.out.println("StudentGrade: " + f.apply(s1));
			System.out.println("");
		};
		
		Student2[] s1 = {new Student2("steve",81),
				     new Student2("warner",66),
				     new Student2("mark",51),
				     new Student2("waugh",38),
				     new Student2("starc",33)
		};
		
		for(Student2 s2:s1) {
			if(p.test(s2)) 
			{
				c.accept(s2);
			}
		}
		                
		}
	}


