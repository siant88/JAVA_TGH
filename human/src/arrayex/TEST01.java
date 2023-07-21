package arrayex;

import java.util.Scanner;

import Day07.Ex01_Board.Main;

public class TEST01 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int b = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			
			
				
					
					if(arr[i]> b) {
						arr[i] = b;
					}
						
			
		}
		System.out.println(b);
		
		sc.close();
	}
	
	
}
