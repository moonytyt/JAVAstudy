package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(100010, "LEE");
		customerLee.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer vipcustomerKim= new VIPCustomer(100010, "KIM",100);
		// VIPCustomer에서 재정의가 된 calcPrice가 호출된다.
		vipcustomerKim.calcPrice(10000);
		System.out.println(vipcustomerKim.showCustomerInfo());
		
		// 참조할 수 있는 메서드나 변수는 Customer이다.
		Customer customerMoon = new VIPCustomer(100010,"Moon",100);
		// 그러나 불리는 메서드는 VIPCustomer에 있는 calcPrice이다 => 가상함수
		int price = customerMoon.calcPrice(10000);
		System.out.println(customerMoon.showCustomerInfo());
		
	}

}
