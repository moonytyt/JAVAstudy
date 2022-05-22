package classpart;

public class FunctionTest {

	// 함수의 이름은 addNum이고 매개변수는 n1,n2 반환 값이 int형이다.
		public static int addNum(int n1, int n2){
			int result = n1+n2;
			return result;
		}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1,num2);
		System.out.println(sum);
	}
}
