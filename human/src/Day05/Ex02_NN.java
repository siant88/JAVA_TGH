package Day05;

import java.util.Scanner;

public class Ex02_NN {

	
	public static void main(String[] args) {
		
		
		// 1. 필요한 변수 선언
		// 입력금액, 화폐매수, 화폐단위
		
		int input; // 입력금액
		int count; // 화폐매수
		int money = 50000; // 화폐단위: 큰 화폐단위부터 시작
		
		// 2. 입력금액 입력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		input = sc.nextInt();
		boolean sw =  true;
		
		// 4. 3번의 과정을 반복
		
		// 5. 3-1 에서 구한 화폐를 출력한다
		while (money >= 1) {
			
			
			// 3-1 화폐매수 계산
			// 화폐매수 = 입력금액 / 화폐단위
			count = input / money;
			
			System.out.println(money+"\t: "+count+ "개");
			
			// \t 탭 만큼의 공백을 적용해서 정렬되게 함 
			// 3-2 잔액계산
			// 잔액 =  입력금액 - (화폐단위 * 화폐매수)
			// 잔액 =  입력금액 % 화폐단위
			// 잔액을 입력금액으로 한 이유는 마이너스를 하기 위함
			input = input - (money*count);
			// intput = intput % money;
			
			// 3-3 화폐단위 변환
			// 화폐단위 = 화폐단위 / 5
			// 화폐단위 = 화폐단위 / 2
			if (sw) 
				money = money /5 ;
				
			 else 
				money = money /2 ;
				sw = !sw;
				
			
		}
		
				
		
		sc.close();
	}
	
}
