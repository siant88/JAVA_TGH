package classex;

public class Address {

	
	private String city, gu, dong;
	
	public Address(String city, String gu, String dong) {
		
		this.city=city;
		this.gu=gu;
		this.dong=dong;
		
	}
	
	public void setCity(String city) {
		
		this.city = city;
		
	}
	
	public void setGu(String gu) {
		
		this.gu = gu;
	}
	
	public void setDong(String dong) {
		
		this.dong = dong;
	}
	
	public String getCity() {
		
		return city;
		
	}
	
	public String getGu() {
		
		
		return gu;
	}
	
	public String getDong() {
		
		
		return dong;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", gu=" + gu + ", dong=" + dong + "]";
	}
	
	
}
