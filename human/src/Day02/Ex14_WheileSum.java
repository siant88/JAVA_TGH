package Day02;

public class Ex14_WheileSum {

	public static void main(String[] args) {
		
		
		// 1부터 100까지의 합계를 구하시오.
		// 1+2+3+ ...+100 =5050
		
		int sum = 0;
		int a = 1;
		
		while (a <= 100) {
			
			sum +=  a++;
			
			//sum = sum + a;
			//a = a + 1;
			
		}
		
		
		System.out.println("합계 : " + sum);
		
	}
	
}
