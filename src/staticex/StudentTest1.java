package staticex;

public class StudentTest1 {

	public static void main(String[] args) {

		Student studentJ = new Student();
		
		Student studentT = new Student();
		
		System.out.println(studentJ.studentID);
		System.out.println(studentT.studentID);
		
		// static 변수들은 사용할 때 클래스 이름으로 참조
		System.out.println(Student.getSerialNum());
	}

}
