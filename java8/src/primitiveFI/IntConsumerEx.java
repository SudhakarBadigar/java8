package primitiveFI;

import java.util.function.IntConsumer;

public class IntConsumerEx {
	public static void main(String[] args) {
		IntConsumer c = i-> System.out.println("sum of " + (i+i));
		c.accept(50);
		c.accept(10);
	}

}
