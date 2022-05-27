package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		
		
		System.out.println(calc.add(num1, num2));
		
		// 호출된다
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		// Calc에 있는 정적메서드인 total()이 호출된다. 정적메서드는 따로 인스턴스 생성없이 호출 가능
		int sum = Calc.total(arr);
		System.out.println(sum);
		
	}

}
