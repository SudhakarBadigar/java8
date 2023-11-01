package predefinedFunctionalIntefrace;

import java.util.function.Function;

class Test{
	String name;
	int marks;
	public Test(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
}
public class StudentGrade {
 public static void main(String[] args) {
	Function<Test, String> f = s-> {
		int marks=s.marks;
		String grade ="";
		if(marks>=80) grade="A[Distinction]";
		else if(marks>=60) grade="B[First class]";
		else if(marks>=50) grade="C[Second class]";
		else if(marks>=35) grade="D[Third class]";
		else grade="E[Fail]";
		return grade;
	};
	
	Test[] t = { new Test("sachin",98),
				 new Test("virat",62),
				 new Test("rohit",55),
				 new Test("shikar",43),
				 new Test("kambli",30)
	};
	
	for(Test t1:t) {
		System.out.println("Student Name: " + t1.name);
		System.out.println("Student marks: " + t1.marks);
		System.out.println("Student grade: " + f.apply(t1));
		System.out.println(" ");
	}
}
	
}
