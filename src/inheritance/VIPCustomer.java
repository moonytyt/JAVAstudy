package inheritance;

public class VIPCustomer extends Customer{

	// Customer를 상속받기 때문에 필요가 없음
	/*protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;*/
	
	int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	// 상위 클래스인 Customer에 있는 calcPrice를 하위 클래스에서  재정의한다
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public int getAgentID(){
		return agentID;
	}
	
}
