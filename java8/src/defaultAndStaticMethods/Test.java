package defaultAndStaticMethods;
interface LeftWing{
	default void m1(){
		System.out.println("Left wing");
	}
}
interface RightWing{
	default void m1(){
		System.out.println("RightWing");
	}
}
public class Test implements LeftWing,RightWing {
	public void m1(){
		System.out.println("our own method"); 
		LeftWing.super.m1();
		RightWing.super.m1();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
