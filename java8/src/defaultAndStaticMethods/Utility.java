package defaultAndStaticMethods;
interface utilityInterf{
	public static void add(int a, int b) {
		System.out.println("addition of "+a+","+ b+ "="+(a+b));
	}
	public static void sub(int a, int b) {
		System.out.println("subtraction of"+a+","+ b+ "=" + (a-b));
	}
	public static void product(int a, int b) {
		System.out.println("product of "+a+","+b+"=" + (a*b));
	}
	public static void division(int a, int b) {
		System.out.println("Division of "+a+","+b+"=" + (a/b));
	}
	public static void Module(int a, int b) {
		System.out.println("Module of "+a+","+b+"=" + (a%b));
	}
}
public class Utility implements utilityInterf{
	public static void main(String[] args) {
		utilityInterf.add(5,3);
		utilityInterf.sub(10, 5);
		utilityInterf.product(5, 5);
		utilityInterf.division(50,25);
		utilityInterf.Module(100,21);
	}
}
