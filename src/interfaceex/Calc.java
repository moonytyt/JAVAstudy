package interfaceex;

// 인터페이스에서는 상수와 추상메서드가 선언된다
public interface Calc {

	// 상수로 선언이 된다
	double PI = 3.14;
	int ERROR = -99999;

	// 추상메서드가 선언된다
	int add(int num1, int num2);

	int substract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	// 디폴트 메서드
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
	}

	// 정적메서드
	static int total(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		return total;
	}
}
