package Interfaceex;

public interface RemoteControl {

	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	//추상메소드: 구현되지 않은 메소드({}가 없다)
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리함");
		else
			System.out.println("무음처리해제");
	}
	static void changeBattery() {
		System.out.println("건전지를 교체합니다");
	}
	
	
}
