package Day06.Ex02_Encapsulation;

public class Bank {

	
	public static void main(String[] args) {
		
		Encapsulation ec = 
				new Encapsulation(0, "우리은행", "1002-649-355575", "탁광호");
		
		//ec.deposit = 100000; 프리베이트라 접근 안됨
		ec.setDeposit(100000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌 잔액 : " + money);
		
		
	}
	
}
