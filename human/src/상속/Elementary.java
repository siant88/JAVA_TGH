package 상속;

public class Elementary extends Student {

	
public Elementary(String name, int grade, int coureses) {
		
		super();
		System.out.println("Elementary 생성자 호출");
		super.name=name;
		super.grade=grade;
		
			
	}
}
