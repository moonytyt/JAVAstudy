package abstractex;

public class DeskTop extends Computer{

	
	// 하위 클래스에서 추상 메서드들을 구현해야한다.
	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}
	
}
