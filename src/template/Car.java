package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	public void startCar(){
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff(){
		System.out.println("시동을 끕니다");
	}
	
	// 이 시나리오는 재정의 하면 안된다, final 선언하게되면 하위 클래스에서 재정의 안됨.=> 탬플릿 메서드
	public final void run(){
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
	
}
