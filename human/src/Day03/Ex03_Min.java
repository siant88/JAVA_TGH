package Day03;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		
		

		// 첫째 줄에 입력할 개수 N을 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최솟값을 구하여 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int min = Integer.MAX_VALUE;
		
		for 
		
		(int i = 0; i < arr.length; i++) {
			
			// i는 배열의 칸 번호 배열을 반복문을 통해서 자동으로 만들게함
			// 반복을 실행하는 조건은 총 갯수번까지만 반복
			
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			
			
			if ( min > arr[i] ) {
			
				// 초기값은 가장 작은 값으로 입력받은 수가 무조건 높다. 그 후에 저장하고 
				// min값이 초기값에 저장되기 때문에 
				//초기값과 두번째값을 비교하고 "초기값보다 크면 그 값"은 저장되지 않는다.
				// 그렇기 때문에 가장 적은 값을 추출할 수 있다.
				
			min = arr[i];
				
			}
			}
		
		System.out.println("최솟값 : " + min);
		sc.close();
		
	}
	
}
