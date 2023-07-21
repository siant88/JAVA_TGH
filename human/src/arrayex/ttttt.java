package arrayex;

public class ttttt {

	
	public static void main(String[] args) {
		
		
		int[] arr= {1,2,9,12,15};
		int sum = 0;
		int avg = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
		}
		
		avg = sum/arr.length;
		
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ avg);
		
	}
	
}
