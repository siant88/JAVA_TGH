package Day02;

import java.util.Scanner;

public class Ex12_SwitchBreak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		
		int num = sc.nextInt();
		
		
		// 입력받은 정수를 5로 나눈 나머지
		// 2보다 작으면 "*" 출력
		// 그렇지 않으면 "**" 출력
		// - switch 
		switch ( num%5  ) 	{				
		case 0:
		case 1: 
			System.out.print("*");
			break;
		
		default:  
			System.out.print("**");
			break;
			
		}
		sc.close();
		
	}
	
}
	
	
	
