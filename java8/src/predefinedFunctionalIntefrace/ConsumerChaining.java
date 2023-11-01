package predefinedFunctionalIntefrace;

import java.util.function.Consumer;

class Movie{
	String name;
	public Movie(String name) {
		this.name=name;
	}
}

public class ConsumerChaining {

	public static void main(String[] args) {
		Consumer<Movie> m1 = s-> System.out.println("Release Movie: " +s.name);
		Consumer<Movie> m2 = s-> System.out.println("Hit: " +s.name);
		Consumer<Movie> m3 = s-> System.out.println("Flop: " +s.name);
	    Consumer<Movie> mm = m1.andThen(m2).andThen(m3);
	    
		Movie m = new Movie("Spyder");
		m1.accept(m);
		m2.accept(m);
		m3.accept(m);
		System.out.println(".........");
		mm.accept(m);
		
		
	}
}
