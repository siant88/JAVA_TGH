package arrayex;

import java.util.Scanner;

public class ArrayTestInputMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int N= sc.nextInt();
		int[] arr= new int[N];		
		int max = arr[0];
		int min = arr[0];
		
		System.out.print("입력한 정수의 개수만큼 숫자를 입력하시오 : ");
		for (int i = 0; i < arr.length; i++) {
			
			
			arr[i] = sc.nextInt();
			
		}
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i]>max) max = arr[i];
				
			
		    if (arr[i]<min) min = arr[i];
						
			
		}
		
		
		System.out.println("입력한 가장 큰 숫자는 : "+ max);
		
	
		
		System.out.println("입력한 가장 작은 숫자는 : "+ min);
		
		
		
		sc.close();
		
	}
	
	
	
	
	
}
