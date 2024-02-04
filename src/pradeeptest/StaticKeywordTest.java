package pradeeptest;

public class StaticKeywordTest {

	public static void main(String[] args) {
		System.out.println("first time" + new ChildClass().getPrice());
		System.out.println("second time" +new ChildClass().getPrice());
		System.out.println("third time" +new ChildClass().getPrice());
	}
	
}

class ChildClass{
	static int MRP = 100;
	int GST = 200;
	
	public int getPrice() {
		MRP = MRP + 100;
		GST = GST + 100;
		return MRP + GST;
	}
	
}
