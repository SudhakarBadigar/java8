package lambdaExpression;

interface test{
	public void m1(int a,int b);
}

class Demo implements test{
	public void m1(int a,int b) {
		System.out.println("Without lambda addition is"+"="+ (a+b));
	}
}

public class Lambda3 {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.m1(10,30);
	}
	
}
