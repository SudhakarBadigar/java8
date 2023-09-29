package lambdaExpression;
interface interf{
	public void m1();
}

class interf1 implements interf
{
	public void m1() {
		System.out.println("Hello this is normal way of coding before java 8");
	}
}
public class Lambda1{
	public static void main(String[] args) {
		
		interf1 i = new interf1();
		i.m1();
	}
}