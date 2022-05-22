package coperation;

public class TakeTrans {

	public static void main(String[] args) {

		// 학생 객체를 생성
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		
		// bus100객체 생성
		Bus bus100 = new Bus(100);
		// Bus타입인 bus100을 매개변수로 사용
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi4885 = new Taxi(4885);
		// taxi4885객체와, 이용요금4000원을 매개변수로 사용
		tomas.takeTaxi(taxi4885,4000);
		taxi4885.showInfo();
		tomas.showInfo();
		
	}

}
