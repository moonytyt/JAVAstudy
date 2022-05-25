package template;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new ManualCar();
		myCar.run();
		System.out.println("=========");
		Car yourCar = new AICar();
		yourCar.run();
		
		/*시동을 켭니다
		사람이 운전합니다.
		사람이 핸들을 조작합니다.
		사람이 와이퍼를 조정합니다.
		사람이 브레이크로 정지합니다.
		시동을 끕니다
		=========
		시동을 켭니다
		자율 주행합니다.
		자동차가 스스로 방향을 전환합니다.
		자동차가 자동으로 와이퍼를 조정합니다.
		자동차가 스스로 멈춥니다.
		시동을 끕니다*/

	}

}
