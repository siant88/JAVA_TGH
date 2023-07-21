package arrayex;

public class ArrayTestmin {

	public static void main(String[] args) {
		
		
		int[] arr = {300,200,600,790,900};
		
		int min = arr[0];
		
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i]<min) {
				
				min = arr[i];
				
			}
			
		}
		
		
		System.out.println(min);
		
		
	}
	
	
	
	
}
