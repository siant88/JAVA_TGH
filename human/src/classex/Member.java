package classex;

//dto(data transfer object)
//vo(value object)



public class Member {

	
	private String id;
	private String pwd;
	private String name;
	private String email;
	private int age;
	Address address;
	
	
	public Member() {
		
      
		
		
		
	}
	
	public Member(String id, String pwd) {
		
		this.id=id;
		this.pwd=pwd;
	}
	public Member(String id, int age) {
		
		this.id=id;
		this.age=age;
	}

	
	public Member(String id, String pwd, String email) {
		this.id=id;
		this.pwd=pwd;
		this.email=email;
	}
	
	public Member(String id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	
	
	
	public void setId(String id) {
		
		this.id= id;
	
		
	}
	
	public void setPwd(String pwd) {
			
		this.pwd= pwd;
				
	}
	
	public void setName(String name) {
		
		this.name= name;
				
	}
	
	public void setEmail(String email) {
		
		this.email= email;
				
	}
	
	public String getId() {
		
	return id;
	
	
	}
	
	public String getPwd() {
		
		return pwd;
		
		
		}
	
	public String getName() {
		
		return name;
		
		
		}
	
	public String getEmail() {
		
		return email;
		
		
		}

@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", email=" + email + "]";
	}

	//	@Override
//	public String toString() {
//		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", age=" + age
//				+ ", address=" + address + "]";
//	}
//
	public void printMember() {
		
		
		System.out.println("ID : "+id);
		System.out.println("PWD : "+pwd);
		System.out.println("EMAIL : "+email);
	}
	
	

	
	
}
