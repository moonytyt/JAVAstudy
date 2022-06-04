package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream= sList.stream();
		
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.println(s));;
		
		
	}

}
