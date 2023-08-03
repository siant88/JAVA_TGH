package Interfaceex;

public class SmartTelevision implements RemoteControl, ISearchable {

	private int volume;
	private String url;

	@Override
	public void Search(String url) {
		this.url=url;
		System.out.println(this.url+" 검색을 시작합니다");
		
	}

	@Override
	public void turnOn() {
		System.out.println("SmartTelevison 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTelevison 전원을 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume >RemoteControl.MAX_VOLUME)
			this.volume=RemoteControl.MAX_VOLUME;
			else if (volume<RemoteControl.MIN_VOLUME)
				this.volume=RemoteControl.MIN_VOLUME;
			else
			this.volume=volume;
		System.out.println("SmartTelevision의 볼륨은:"+this.volume);
		
	}
	
}
