package classex;

import java.util.Scanner;

public class MemberTest {
// 속성, 메소드	
	public static void main(String[] args) {
		
		/*
		Address address= new Address("인천", "부평구", "산곡동" );
		
		String city= address.getCity();
		String gu= address.getGu();
		String dong= address.getDong();
		System.out.println(address);
		System.out.println(city+" " + gu+" " +dong);
		System.out.println( );
		
		Member member = new Member();
		// 멤버변수를 초기화 한다. 멤버변수에 값을 대입한다.
		System.out.println(member.toString());
		System.out.println("1번:"+member);
		Member member2 = new Member("아이디", "비밀번호");
		
		member.setId("자바");
		member.setPwd("자바");
		System.out.println("2번:"+member);
		
		
//		member.name="java";
//		System.out.println(member.name);
//		String name = "자바";
//		System.out.println(name);
		
	member.setId("자바...");
	String id=member.getId();
		System.out.println(id);
	
	member.setPwd("패스워드");
	String pwd=member.getPwd();
		System.out.println(pwd);
		
		member.setName("이름");
		String name=member.getName();
		System.out.println(name);
	
		String id2=member2.getId();
		System.out.println(id);
		String pwd2=member2.getPwd();
		System.out.println(pwd);
		System.out.printf("id=%10s, pwd=%10s", id2,pwd2);
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		
		// id에 입력값을받음
		System.out.print("PWD : ");
		String pwd = sc.next();
		// 입력후 Member클래스의 생성자 메소드로 전달하여 출력한다
		
		Member member = new Member(id, pwd);
		//member인스턴스 생성 힙영역에 id 주소 생성 
		
		String id2=member.getId();
		String pwd2=member.getPwd();
		

		System.out.println("ID : " + id2);
		System.out.println("PWD : " + pwd2);
		// 입력 값을 setXXX()로 전달하여 출력하시오
		
		
		member.setId(id2);
		System.out.println("ID : " + id);
		
		System.out.println(id == id2);
		String id3=member.getId();
		String pwd3=member.getPwd();
		// pw3 라는 새로운 변수를 생성해서 pwd의 값을 가져옴 get이라는 메소드를 이해하기 위한 코드언어
		System.out.println("ID : "+ id3 + " PWD : " + pwd);
		// 값 변경
		member.setId("computer");
		
		System.out.println("ID : "+ member.getId() + " PWD : " + pwd);
		
		// 값 조회
		id3=member.getId();
		pwd3=member.getPwd();
		System.out.println(" ID : " + id3 + " PWD : " + pwd);
		
		
		
		
		
		
		
	}
	
	
	
}
