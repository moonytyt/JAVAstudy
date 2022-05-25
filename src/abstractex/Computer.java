package abstractex;

// 추상메서드를 갖으면 클래스도 추상클래스가 되어야한다
public abstract class Computer {

	// 메서드를 선언만 한다, 추상메서드
	public abstract void display();
	public abstract void typing();
	
	// 추상클래스에서 그냥 메서드선언도 가능하다
	public void turnOn(){
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff(){
		System.out.println("전원을 끕니다.");
	}
}
