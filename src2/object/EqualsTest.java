package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	Student(String studentName){
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student){
			Student std = (Student)obj;
			if(studentID == std.studentID)
				return true;
		}else 
			return false;
		return false;
	}
	
	// hashCode()재정의
	public int hashCode(){
		return studentID;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		
		// 주소값을 비교(false)
		System.out.println(str1 == str2);
		
		// 문자열이 같은지 확인(true), equals의 원형은 주소값을 비교한다
		// String이나 Integer는 재정의가 되어 있기 때문에 true가 나온다
		System.out.println(str1.equals(str2));
		
		System.out.println("================");
		
		Student std1 = new Student(10001, "홍길동");
		Student std2 = new Student(10001, "홍길동");
		
		
		System.out.println(std1 == std2);
		// Student클래스에서 재정의 된 equals가 사용된다
		System.out.println(std1.equals(std2));
		/*false
		true*/
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
	}

}
