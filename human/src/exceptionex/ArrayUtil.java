package exceptionex;

public class ArrayUtil {

	
	public void call() {
	
		System.out.println("call 메서드 시작");
		
		try {
		int[] num= new int[2];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		}
		
		catch(Exception e) {
		System.out.println("call 메서드 종료");
	}
		
	}
	
	
}
