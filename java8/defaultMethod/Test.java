package defaultMethod;

interface Interf{
	public void m1();
	default void m2() {
		System.out.println("default method");
	}
	static void show() {
		System.out.println("static method : ");
	}
}
public class Test implements Interf{
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		// Static method executed
		Interf.show();
	}
	@Override
	public void m1() {
		System.out.println("testing");
		//use super keyword to call non-static m2 method
		Interf.super.m2();
	}
}
