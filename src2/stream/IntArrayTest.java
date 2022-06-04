package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr ={1,2,3,4,5,};
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
		// 스트림은 최종연산에서 소모가 되므로 다시 생성해야함
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
		//15
		//5

	}

}
