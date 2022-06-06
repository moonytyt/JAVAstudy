package exception;

public class ArrayExeptionTest {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			//return을 하면 end는 찍히지 않는다. 
			// finally가 수행된 후 return이 된다.
//			return;
		}finally{
			System.out.println("finally");
		}
		// 시스템상으로 에러때문에 죽었다면 end는 안찍힌다. 그러나 try catch를 하면 찍힌다
		System.out.println("end");
	}
	
	//return과 finally가 없을 때
	/*1
	2
	3
	4
	5
	java.lang.ArrayIndexOutOfBoundsException: 5
	end*/
	
	// return과 finally가 있을 시
	/*1
	2
	3
	4
	5
	java.lang.ArrayIndexOutOfBoundsException: 5
	finally*/

	// return이 없을 때
/*	1
	2
	3
	4
	5
	java.lang.ArrayIndexOutOfBoundsException: 5
	finally
	end*/
}
