package classpart;

public class StudentTest {

	public static void main(String[] args) {

		// Student는 객체 타입 studentLee는 참조변수, Student(int ID, String name) 생성자
		Student studentLee = new Student(100,"이순신");
		studentLee.address = "대전";

		// Student는 객체 타입 studentKim은 참조변수, 디폴트 생성자 
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "대구";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
	}
}
