package interfaceex;

public class CustomerTset {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		
		// Buy타입으로 하면 sell()은 호출 할 수 없다
		Buy buyer = customer;
		buyer.buy();
		
		// Sell타입으로 하면 buy()는 호출 할 수 없음
		Sell seller = customer;
		seller.sell();
		
		
		customer.order();
		// Buy와 Sell의 타입이지만 인스턴스는 Customer이므로 Customer에서 재정의 된 order()가 호출된다
		buyer.order();
		seller.order();
		/*고객 판매 주문
		고객 판매 주문
		고객 판매 주문*/

	}

}
