package bookshelf;

public class BookShelf extends Shelf implements Queue{

	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// ArrayList에 있는 책들 중 가장 첫번째 있는 책 반환
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
