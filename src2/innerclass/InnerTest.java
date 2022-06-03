package innerclass;

class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass() {
		inClass = new InClass();
	}

	// 인스턴스 InnerClass
	class InClass {
		int inNum = 200;
		// static 사용 못함
		// static int sInNum = 10l;

		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}

	public void usingInTest() {
		inClass.inTest();
	}

	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;

		void inTest() {
			// 외부클래스의 인스턴수 변수인 num은 사용불가
			// num += 10;
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}

		static void sTest() {
			// 정적변수만 사용 가능
			System.out.println(sNum);
			System.out.println(sInNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInTest();

		// inTest는 인스턴스 메서드이기 때문에 인스턴스 생성 후 사용 가능
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();

		// sTest()는 정적 메서드이기 때문에 바로 사용 가능
		OutClass.InStaticClass.sTest();
	}
}
