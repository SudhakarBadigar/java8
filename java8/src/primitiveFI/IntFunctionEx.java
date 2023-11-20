package primitiveFI;

import java.util.function.IntFunction;

public class IntFunctionEx {
	public static void main(String[] args) {
		IntFunction<Integer>f = i->i*i;
		System.out.println(f.apply(6));
	}

}
