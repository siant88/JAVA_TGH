package arrayex;

public class ArrayTest22 {

	
	public static void main(String[] args) {
		
		
		int[] num1= {11,22,33,44,55};
		int[] num2= {100,200,300,400,500};
		int[] num3= new int[5];
		int total=0;
		
		for (int i = 0; i < num3.length; i++) {
			
			
			System.out.println("num1["+i+"]=" + num1[i]);
		}
		
		for (int i = 0; i < num3.length; i++) {
			
			num3[i]= num1[i]-num2[i];
			
		}
		
		System.out.println();
		
		for (int i = 0; i < num3.length; i++) {
			
			System.out.println("num3["+i+"]="+num3[i]);
			
		}
		
		System.out.println();
		
		for (int i = 0; i < num3.length; i++) {
			
			total += num3[i];
			
		}
		
		System.out.println();
		System.out.println("total="+ total);
		
		
	}
	
	
}
