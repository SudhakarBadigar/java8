package defaultAndStaticMethods;
interface I{
	public void m1();
	public void m2();
	
}

public class Test1 implements I{
	public void m1() {
		System.out.println("Test1");
	}
	public void m2() {
		System.out.println("Test1");
	}
}

class test2 implements I{
	public void m1() {
		System.out.println("Test2");
	}
	public void m2() {
		System.out.println("Test2");
	}
}
