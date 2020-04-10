package Casting;

public class BaseClass {
	public void methodA() {
		System.out.println("Method A from base class");
	}
	public void methodB() {
		System.out.println("Method B from base class");
	}
	public static void main(String args[]) {
		BaseClass bc = new ExtenderClass();
		ExtenderClass ec = new ExtenderClass();
		ec.methodC();
	}
}

class ExtenderClass extends BaseClass {
	
	public void methodC() {
		System.out.println("Method C from extender");
	}
	
}
