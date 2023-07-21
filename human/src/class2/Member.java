package class2;

public class Member {

	
	private String name;
	private int age;
	private String birth;
	
	public Member() {
		
	}
	
	public Member(String name, int age, String birth) {
		
		this.name = name;
		this.age = age;
		this.birth = birth;
		
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	
	public void setBirth(String birth) {
		
		
		this.birth = birth;
	}
	
	
	public String getName() {
		
		return name;
		
	}
	
	public int getAge() {
		
		return age;
	}
	
	public String getBirth() {
		
		
		return birth;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", birth=" + birth + "]";
	}
	
	
	
	
	
	
}
