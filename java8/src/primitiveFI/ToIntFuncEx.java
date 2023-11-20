package primitiveFI;

import java.util.function.ToIntFunction;

public class ToIntFuncEx {
	public static void main(String[] args) {
		ToIntFunction<String> f= i->i.length();
		System.out.println("Length = " + f.applyAsInt("RamaKrishna"));
	}
}
