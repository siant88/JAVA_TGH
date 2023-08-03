package 상속;

public class Student {
	
	public String name;
	public int grade;
	public Student st;
	public Student(){
		
		System.out.println("Student 생성자 호출");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo()메서드 호출");
		return "이름은: " + name + ", 학년은"+grade;
	}
	
//	public void calcScore(University uni) {
//		
//		System.out.println("시험점수 구하기");
//	}
	
	public void calcScore(Student st) {
		
		if(st instanceof University) 
			System.out.println("University 시험점수 구하기");
		
		else if(st instanceof Elementary) 
			System.out.println("Elementary 시험점수 구하기");
		
	}

}
