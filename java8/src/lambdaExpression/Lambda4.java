package lambdaExpression;
//@FunctionalInterface
//interface test2{
//	public void m1(int a,int b);
//}
//
//public class Lambda4 {
//	public static void main(String[] args) {
//		test2 t1 = (a,b)->System.out.println("addition is ="+(a+b));
//		t1.m1(10,60);
//		t1.m1(10,40);
//		t1.m1(10,70);
//	}
//}


//with out functional interface we cannot use lambda expression.
interface test2{
	public void m1(int a,int b);
	public void m2(int x,int y);
}

class Demo2 implements test2{

	@Override
	public void m1(int a, int b) {
		System.out.println("a+b ="+(a+b));
		
	}

	@Override
	public void m2(int x, int y) {
		System.out.println("x+y =" +(x+y));		
	}
	
}
public class Lambda4 {
	public static void main(String[] args) {
		test2 t1 = new Demo2();
		t1.m1(10,60);
		t1.m2(10,40);
	}
}

