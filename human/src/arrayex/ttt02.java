package arrayex;

public class ttt02 {

	
	public static void main(String[] args) {
		
		
		int[] arr = new int[10];
		int len = arr.length;
		int v=1;
		for (int i = 0; i < len; i++) {
			
			arr[i] = v++;
			
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		
		
	}
	
	
	
}
