package pradeeptest;

public class ExceptionThrowingCheck {



public void methodC() throws Exception {
	methodD();
}

public void methodD() throws Exception{
	
	throw new Exception("some exp");
	
}

}
