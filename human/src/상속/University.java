package 상속;

public class University extends Student {

	private int courses;
	public University(String name, int grade, int coureses) {
		
		super();
		System.out.println("University 생성자 호출");
		super.name=name;
		super.grade=grade;
		this.courses=coureses;
			
	}
	public University() {
		
		this("이순신",2,20);
	}
	public int getCourses() {
		
		return courses;
	}
	
	
}
