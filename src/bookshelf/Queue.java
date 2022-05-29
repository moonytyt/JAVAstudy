package bookshelf;

public interface Queue {

	// Queue에 삽입
	void enQueue(String title);
	// 책의 제목 반환
	String deQueue();
	int getSize();
	
}
