package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		// Customer를 상속받은 VIPCustomer는 setCustomerID와 setCustomerName이 사용가능하다
		VIPCustomer customerKim = new VIPCustomer(10101,"Kim",100);
	
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
	}
	
}
