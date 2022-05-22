package coperation;

public class Student {
	
	String studentName;
	int grade;
	int money;

	// 객체를 생성할 때 studentName과 money를 받아 변수 생성
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// Bus클래스의 bus객체를 매개변수로 받는다
	public void takeBus(Bus bus) {
		// 매개변수로 받은 bus의 take메소드 호출
		bus.take(1000);
		money -= 1000;
	}

	public void takeSubway(Subway subway) {
		subway.take(1000);
		money -= 1000;
	}

	// Taxi클래스의 taxi와 ,이용요금인 money를 매개변수로 받는다.
	public void takeTaxi(Taxi taxi, int money) {
		// 매개변수로 받은 money를 다시 매개변수로 사용해 take메소드를 호출
		taxi.take(money);
		this.money -= money;
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}

}
