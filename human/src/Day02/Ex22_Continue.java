package Day02;

import java.util.Scanner;

public class Ex22_Continue {

	public static void main(String[] args) {
		
		
		// 5개의 정수를 입력받아,
		// 입력받은 수 중 양수(+)만 합계를 구하여 출력하시오
		
	Scanner sc = new Scanner(System.in);
	
	int sum = 0;
	
	for (int i = 0; i < 5; i++) {
		
		int n = sc.nextInt();
		
		if ( n<0 )
			continue;
		
		sum+=n;  //sum = sum + n;
		
		//  음수일 때만, 합계에 누적하지 않고 넘어가려면?
		
		//  합계를 구하는 수식
		
	}
	
	System.out.println("양수의 합 : " + sum );
	
	sc.close();
	
	}
	
	
}
