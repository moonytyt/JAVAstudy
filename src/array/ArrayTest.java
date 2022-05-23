package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열 초기화
		int[] numbers1 = new int[] {1,2,3};
		// 1,2,3가 들어가 length는 3이된다
		System.out.println(numbers1.length);
		
		System.out.println("-----------------------");
		
		// 배열 초기화
		int[] numbers2 = new int[3];
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		
		for(int i = 0; i<numbers2.length; i++){
			System.out.println(numbers2[i]);
		}
	}

}
