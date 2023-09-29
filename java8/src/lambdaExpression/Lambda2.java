package lambdaExpression;
@FunctionalInterface
interface C{
	public void m2();
	
}

public class Lambda2 {

	public static void main(String[] args) {
		C c = ()->System.out.println("this is lambda expression");
		c.m2();
		c.m2();
		c.m2();
	}
}
