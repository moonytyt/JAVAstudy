package lambda;

@FunctionalInterface
public interface MyNumber {
	// 람다식을 위한 함수형 인터페이스는 메서드를 딱 하나 만들어야 한다
	int getMaxNumber(int num1, int num2);
	
}
