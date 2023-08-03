package Interfaceex;

public interface RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(-10);
		rc.setMute(true);
		Television tv=(Television)rc; //다운캐스팅
		tv.print();
		
		rc = new Audio();
		Audio au = (Audio)rc;
		au.amp();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(-10);
		rc.setMute(true);
		
		rc = new SmartTelevision();
		SmartTelevision st = (SmartTelevision)rc;
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(100);
		rc.setMute(true);
		ISearchable ic = new SmartTelevision();
		ic.Search("www.korea.co.kr");
		
		
	}
	
	
}
