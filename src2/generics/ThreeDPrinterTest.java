package generics;


public class ThreeDPrinterTest {

	public static void main(String[] args) {
		// 사용할 때는 T 문자 대신 사용할 참조형 변수를 쓴다(Powder), T에는 이제 Powder만 가능
		ThreeDPrinter<Powder> printerPowder = new ThreeDPrinter<Powder>();
		// ThreeDPrinter에 material은 Powder material = new Powder();가 된다.
		printerPowder.setMaterial(new Powder());
		//따라서 printer.toString()은 material.toString()을 호출하는데 여기서 material은 Powder 이므로 
		//재료는 Powder입니다.가 출력된다
		System.out.println(printerPowder.toString());
		
		ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		System.out.println(printerPlastic.toString());
		printerPlastic.printing();
		
		// Water는 Material을 상속 받지 않아 오류 발생
		/*ThreeDPrinter<Water> printerWater = new ThreeDPrinter<Water>();
		printerWater.setMaterial(new Water());
		System.out.println(printerWater.toString());*/
	}

}
