package Interfaceex;

public class Audio implements RemoteControl  {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오 전원을 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 전원을 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume >RemoteControl.MAX_VOLUME)
			this.volume=RemoteControl.MAX_VOLUME;
			else if (volume<RemoteControl.MIN_VOLUME)
				this.volume=RemoteControl.MIN_VOLUME;
			else
			this.volume=volume;
		System.out.println("오디오의 볼륨은:"+this.volume);
	}

	public void amp() {
		
		System.out.println("소리 증폭한다");
	}
}
