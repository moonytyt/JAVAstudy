package arrylist;

public class StudentTest {

	public static void main(String[] args) {

		// studentLee객체가 생성되면서 subjectList도 생성이된다
		Student studentLee = new Student(1001, "Lee");
		// addSubject메서드 호출
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		studentLee.showStudentInfo();
		
		System.out.println("======================");
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 80);
		studentKim.addSubject("수학", 95);
		studentKim.addSubject("영어", 85);
		studentKim.showStudentInfo();
		
	}

}
