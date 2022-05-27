package bookshelf;


public class BookShelfTest {

	public static void main(String[] args) {

		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥1");
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		
		//shelfQueue는 Queue타입이기 때문에 Queue인터페이스에 있는 메서드들만 호출 가능하다
		// Shelf클래스의 메서드를 호출하기 위해서는 BookShelf로 다운캐스팅 해야한다.
		if(shelfQueue instanceof BookShelf){
			BookShelf bookShelf = (BookShelf)shelfQueue;
			System.out.println(bookShelf.getSehlf());
			/*[태백산맥1, 태백산맥2, 태백산맥3]*/
		}
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		/*태백산맥1
		태백산맥2
		태백산맥3*/
		
		
	}

}
