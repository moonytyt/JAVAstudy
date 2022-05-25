package abstractex;

public abstract class NoteBook extends Computer{

	// 하위 클래스에서 추상 메서드들을 구현해야한다.
	@Override
	public void display() {
		System.out.println("NoteBook display()");
	}
	
}
