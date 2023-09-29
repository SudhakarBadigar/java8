package lambdaExpression;
@FunctionalInterface
interface test3{
	public int square(int n);
}

public class SquareIt{
	public static void main(String[] args) {
		test3 t = (n)->{return n*n;};
		System.out.println(t.square(5));
		System.out.println(t.square(6));
		System.out.println(t.square(7));
	}
}


//interface test3{
//	public void square(int n);
//}
//
//class Demo3 implements test3{
//	public void square(int n) {
//		System.out.println("square of "+n +" = " +(n*n));
//	}
//}
//
//public class SquareIt {
//	public static void main(String[] args) {
//		Demo3 d = new Demo3();
//		d.square(5);
//		d.square(6);
//		d.square(7);
//		d.square(10);
//	}
//
//}
