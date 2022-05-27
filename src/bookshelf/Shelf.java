package bookshelf;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
	// 상속 받을 때 ArrayList인 shelf를 생성하기 위해서
	public Shelf(){
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getSehlf(){
		return shelf;
	}
	
	public int getCount(){
		return shelf.size();
	}
	
}
