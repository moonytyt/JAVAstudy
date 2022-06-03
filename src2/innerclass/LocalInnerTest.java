package innerclass;

class Outer {

	int outNum = 100;
	static int sNum = 200;
	
	// 익명 innerclass
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("runnable");
		}
	};
	
	// 메서드
	public Runnable getRunnable() {
		int localNum = 300;
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		};
		
/*		// 클래스를 만듬, Runnable한 객체 생성
		class MyRunnable implements Runnable {
			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		}
		// 생성된 객체 반환
		return new MyRunnable();*/
	}

}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.getRunnable().run();
		outer.runnable.run();
	}

}
