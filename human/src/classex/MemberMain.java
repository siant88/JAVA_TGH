package classex;

import java.util.Scanner;

public class MemberMain {


	public static Object email;
	
	
	
	
	
	public static void showMenu() {
		
		
		System.out.println("1.회원입력\n2.회원조회\n3.회원삭제\n4.회원변경\n5.전체출력\n6.종료\n 번호를 입력하세요.");
		
		
	}
	
	public static void main(String[] args) {
		
		MemberService ms = new  MemberService();
		int N =0;
		
		
		do {
			showMenu();
			
			N = InputScanner.sc.nextInt();
			
		switch(N) {
		
		case 1 : ms.inputData(); break;
		case 2 : 
			System.out.println("회원조회");
			ms.searchData();
			break;
		case 3 : ms.deleteData();break;
		case 4 : ms.updateData();break;
		case 5 : ms.totalPrint();break;
		case 6 : 
			System.out.println("프로그램을 종료함");
			System.exit(0);
		}
			
			
		} while ( N != 0);
		

		
		
		
		
		
	}
	
}
