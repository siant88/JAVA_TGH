package arrayex;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest0720 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int v=1;
		int[] arr = new int[10];
		int sum=0;
		int avg=0;
		int max=0;
		int temp=0;
		
		System.out.println("=========================");
		System.out.println("10개의 값을 입력해주세요.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(v++ + "번째 값:");
			arr[i]=sc.nextInt();
			
		}
		
		
		System.out.println("**************************");
		System.out.println("\nResult");
		
		for (int i = 0; i < arr.length; i++) {
						sum+= arr[i];						
		}
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i]>max) max = arr[i];						
		}		
			avg=sum/arr.length;
			
			System.out.println("합산:"+sum+"/평균:"+avg+"/최대값:"+max);
			System.out.println("=========================");
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			
			for (int i = 0; i < arr.length; i++) {
				
				for (int j = i; j < arr.length; j++) {
					
					if (arr[i]<arr[j]) {
						
						temp = arr[i];
						arr[i] = arr[j];
						arr[j]=temp;
					}
					
				}
			}
			System.out.println();
			System.out.println("=========================");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			
		
		
	}
	
	
}
