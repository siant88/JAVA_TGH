package Day05;

import java.util.Iterator;
import java.util.Scanner;

public class Ex02_NumberOfCurrency {

	public static void main(String[] args) {

		// 순서도
		// 1. 필요한 변수 선언
		// 입력금액, 화폐매수, 화폐단위
		// 2. 입력금액 입력
		// 3. 화폐매수 계산
		// 조건 : 큰 화폐 단위부터 계산한다
		// 3-1 화폐매수 계산
		// 10 = 537620 / 50000
		// 화폐매수 = 입력금액 / 화폐단위
		// 3-2 잔액계산
		// 37620 = 537620 % 50000
		// 37620 = 537620 = (50000*10)
		// 잔액 = 입력금액 % 화폐단위
		// 잔액 = 입력금액 - (화폐단위 * 화폐매수)
		// 3-3 화폐단위 변환
		// 번갈아 가면서, /5, /2 연산을 반복한다
		// 화폐단위 = 화폐단위 / 5
		// 화폐단위 = 화폐단위 / 2
		// 4. 3번의 과정을 반복
		// 반복조건 : 화폐단위가 1보다 크거나 같으면 반복
		// 5. 3-1 에서 구한 화폐매수를 출력한다.

		// 화폐 매수 구하기
		// 금액 : 547620
		// 50000 : 10개
		// 10000 : 4개
		// 5000: 1개
		// 1000 : 2개
		// 500 : 1개
		// 100 : 1개
		// 50 : 0개
		// 10 : 2개
		// 5 : 0개
		// 1 : 0개

		Scanner sc = new Scanner(System.in);
		// 돈을 입력받고
		// 5만원권으로 나누고

		int N = sc.nextInt();
		int count; // 화폐매수
		int ner; // 화폐단위
		int money; // 잔액
	

		
		ner = 50000;
		count = 0;
		int sw = 1;
		
		while (N>= 1) {

			
			count = N / ner;
			N = N % ner;
			
			System.out.println(ner+ " "+ count + " ");
			
			if (sw == 1) {

				ner = ner / 5;

			}
			// sw= -1;

			else {

				ner = ner / 2;
			}

			// sw=1;

			sw = sw * (-1);

		}

	}

}
