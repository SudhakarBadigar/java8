package defaultAndStaticMethods;

interface Idea{
	public static void m1() {
		System.out.println("static method");
	}
}
public class StaticMethod implements Idea{
	public static void main(String[] args) {
		//m1();
		//StaticMethod s = new StaticMethod();
		//s.m1();
		//StaticMethod.m1();
		System.out.println("main-1");
		Idea.m1();
		System.out.println("main-2");
	}
	

}
