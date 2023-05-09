package tommy.spring.polymorphism;

public class LgTV implements TV {
	public LgTV() {
		System.out.println("LgTV 객체를 생성한다.");
	}
	
	public void powerOn() {
		System.out.println("LgTV 전원을 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV 전원을 끈다.");
	}

	public void volumeUp() {
		System.out.println("LgTV 볼륨을 올린다.");
	}

	public void volumeDown() {
		System.out.println("LgTV 볼륨을 내린다.");
	}

}
