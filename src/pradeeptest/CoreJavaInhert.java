package pradeeptest;

public class CoreJavaInhert {
	public static void main(String[] args) {
		C1 c3 = new C2();
		System.out.println(c3.x);
		c3.message();
	}
}

class C1 {
	int x = 50;

	public void message() {
		System.out.println("C1 message");
	}
}

class C2 extends C1 {
	int x = 40;

	public void message() {
		System.out.println("C2 message");
	}
}

