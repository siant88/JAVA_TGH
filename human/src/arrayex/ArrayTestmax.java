package arrayex;

public class ArrayTestmax {

	
	public static void main(String[] args) {
		
		
		int[] arr = {300, 200, 600, 790, 900};
		
		int max = arr[0];
		
		
		for (int i = 1; i < arr.length; i++) {
			
			
			if (arr[i]>max) {
				
				max = arr[i];
				
			}
			
		}
		
		
		System.out.println(max);
		
	}
	
	
}
