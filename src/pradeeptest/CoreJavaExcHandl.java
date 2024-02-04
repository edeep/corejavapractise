package pradeeptest;

public class CoreJavaExcHandl {

	public static void main (String args[]) {
		System.out.println("Start main method");
		new CoreJavaExcHandl().method1();
		System.out.println("End main method");
	}
	
	public void method1() {
		
		try {
			System.out.println("Method 1 begin");
			method2();
			System.out.println("Method 1 Middle");
			System.out.println(1/0);
			System.out.println("Method 1 End");
		}
		catch(Exception ex){
			System.out.println("Exception caught method 1");
			throw ex;
			
		}
		finally {
			System.out.println("Finally method 1");
		}
		
	}
	
	public void method2() {
		
		try {
			System.out.println("Method 2 begin");
			System.out.println(1/0);
			System.out.println("Method 2 end");
		}
		catch(Exception ex){
			System.out.println("Exception caught method 2");
			throw ex;
			
		}
		finally {
			System.out.println("Finally method 2");
		}
		
	}
}
