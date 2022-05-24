package inheritance;

public class Customer {

	// private은 외부클래스에서 접근하지 못함.
	/*private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;*/
	
	// protected는 같은 패키지와, 상속받는 클래스에서 사용 가능(패키지가 달라도 사용가능)
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	// 디폴트는 같은 패키지내에서만 가능
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo(){
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
}
