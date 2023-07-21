package class2;

import java.util.Scanner;

public class MemberMain {
   
	static Scanner sc = new Scanner(System.in);
	static Member[] memberlist = new Member[10];
	
	
	public static void showMenu() {
	
		
		System.out.println("1.회원입력\n2.회원조회\n3.회원삭제\n4.회원변경\n5.전체출력\n6.종료\n 번호를 입력하세요.");
		
		
	}
	

	public static void input() {
		
		System.out.println("1.회원입력");
		System.out.print("회원 이름 : ");
		String name = sc.next();
		System.out.print("회원 나이 : ");
		int age = sc.nextInt();
		System.out.print("회원 생년월일 : ");
		String birth = sc.next();
		Member member = new Member(name, age, birth);
		//return member;
	
		
	
	}
	
	public static void write() {

		input();
		member = memberList[];
		
		
	}
	
	public static void join() {
		
		
		
	}
	
	public static void main(String[] args) {
		
		int N =0;
		
		
		do {
			showMenu();
			
			N = sc.nextInt();
			
		switch(N) {
		
		case 1 : write(); break;
		
		
		}
			
			
		} while ( N != 0);
		

		
		
		
		
	}
	
	
}
