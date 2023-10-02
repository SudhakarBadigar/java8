package lambdaExpression;

public class AnnonymousInner {
	
	public static void main(String[] args) {
//		 Runnable r = new Runnable() {
//			 public void run() {
//				 for(int i=0;i<5;i++) {
//					 System.out.println("Annonymous-Thread");
//				 }
//			 }
//		 };
	
		//using lambda
		Runnable r = ()->{
			for(int i=0;i<5;i++) {
				System.out.println("Lambda Annonymous-thread");
			}
		};
		 
		 Thread t = new Thread(r);
		 t.start();
		 for(int i=0;i<5;i++) {
			 System.out.println("Main-Thread");
		 }
	}

}
