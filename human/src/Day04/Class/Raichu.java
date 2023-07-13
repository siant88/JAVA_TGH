package Day04.Class;

//상속
// - 키워드 : 자식클래스 extends 부모클래스 {}

public class Raichu extends Pikachu {

	public Raichu() {

		super(200, "슈퍼전기", 20);
//		energy = 200;
//		type = "슈퍼전기";
//		level = 20;
//		
	}

	public Raichu(int energy, String type, int level) {
		super(energy, type, level);

	}

	// 메소드 오버라이딩 : 메소드 재정의
	// 오버라이딩 자동 완성 : alt + shift + s -> v

	@Override
	public String aAttack() {

		return "백만볼트";
	}

	@Override
	public String bAttack() {

		return "볼트체인지";
	}

	public String cAttack() {

		if (level >= 40) {

			return "아이언테일";
		}
		
		else {
			
			return "(사용불가)";
		}
		
		
		
	}

	// 생성자 자동 완성
	// alt + shigt + s -> c

}
