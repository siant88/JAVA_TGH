package Day02;

import java.util.Scanner;

public class Ex20_Star1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i <= N ; i++) {
			
			for (int j = 0; j <= i; j++) {
				
				// i : 1, j : 1
				// i : 2, j : 1 2
				// i
				
				
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
			
		}
		
		sc.close();
		
	}
	
}
