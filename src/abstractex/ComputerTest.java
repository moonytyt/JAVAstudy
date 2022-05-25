package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		// 생성될 수 없다, 메서드에 수행되어야할 명령어가 없기 때문
		/*Computer c1 = new Computer();*/
		
		Computer c2= new DeskTop();
		
		//생성 불가능
		/*Computer c3 = new NoteBook();*/
		
		Computer c4 = new MyNoteBook();
		
	}

}
