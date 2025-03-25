package pradeeptest;

public class StringImmutabilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="pradeep";
		String b = a;
		a = a + " updated";
		System.out.println(a); // pradeep updated
		System.out.println(b); //pradeep
		
		
	}

}
