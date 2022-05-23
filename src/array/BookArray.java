package array;

public class BookArray {

	public static void main(String[] args) {

		// 책이 만들어질 주소 5가지를 만든것이다
		Book[] library = new Book[5];
		// 따라서 출력은 null값이 된다
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥2","조정래");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		// 향상된 for문
		String [] strArr={"Java","Android","C"};
		
		for(String s : strArr){
			System.out.println(s);
		}
		
	}
		
}
