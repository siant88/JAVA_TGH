package exceptionex;

public class Throws {

	public static void main(String[] args) {
		ArrayUtil t= new ArrayUtil();
		try{
		
		t.call();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello");	
		System.out.println("World");
		
		
	
	}
}
