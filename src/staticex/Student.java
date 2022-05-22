package staticex;

public class Student {
	
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student(){
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		
		// 멤버변수 사용 X
		// studentName = "홍길동"; 
		return serialNum;
	}

	
	
}
