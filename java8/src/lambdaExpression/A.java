package lambdaExpression;

@FunctionalInterface
interface A {
  public void m1();	
  
}

@FunctionalInterface
interface B extends A{
	public void m1();
}


