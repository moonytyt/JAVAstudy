package coperation;

public class Taxi {

	int taxiNumber;
	int money;
	
	public Taxi(int taxiNumber){
		this.taxiNumber = taxiNumber;
	}
	
	// 택시 이용요금이라서 더하지 않고 선언만 해주었다
	public void take(int money){
		this.money = money;
	}
	
	public void showInfo(){
		System.out.println(taxiNumber + "번 택시요금은 " + money+"원 나왔습니다.");
	}
	
}
