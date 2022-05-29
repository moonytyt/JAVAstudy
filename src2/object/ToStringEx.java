package object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		
		Book book = new Book("자바","은종님");
		System.out.println(book);
		
		/*toString()을 정의하지 않았을 때
		 *  object.Book@15db9742*/
		
		/*toString()을 재정의한 후 
		 * Book [title=자바, author=은종님]*/
	}

}
