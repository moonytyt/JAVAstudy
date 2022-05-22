package classpart;

public class Student {

	// 학생이 갖는 속성 : 맴버변수
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 클래스 파일에 생성자가 없는 경우 자바 컴파일러가 디폴트로 넣어줌
	public Student(){}
	
	// 클래스 파일에 생성자가 하나라도 있는 경우 디폴트 생성자는 없어짐
	// 생성자가 생성될 때 무조건 id와 name을 받아 생성하기 위해서 사용 
	public Student(int id, String name){
		studentID = id;
		studentName = name;
	}
	
	// 클래스의 기능 : 메서드
	public void showStudentInfor(){
		System.out.println(studentName + ", " + address);
	}
	
	// 클래스의 studentName을 리턴 
	public String getStudentName(){
		return studentName;
	}
	
	// studentName을 외부에서 매개 변수로 이름을 변경
	public void setStudentName(String name){
		studentName = name;
	}
	

	
}
