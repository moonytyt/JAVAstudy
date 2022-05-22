package reference;

public class Student {

	int studentID;
	String studentName;
	
	// 학생이 갖고있는 요소이기는 하지만 Subject라는 클래스를 만드는 것이 더 효율적
	/*int koreaScore;
	int mathScore;
	String koreaSubject;
	String mathSubject;
	
	int engScore;
	String engSubject;*/
	
	//Student클래스에서 Subject클래스를 참조하는 참조변수 생성
	Subject korea;
	Subject math;
	
	//Student생성자가 만들어 질 때 id와 name을 매개 변수로 받고 korea와 math객체 생성
	public Student(int id, String name){
		studentID = id;
		studentName = name;
		
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	// 만들어진 객체에 점수 입력
	public void setKorea( int score){
		korea.setScore(score);
	}
	
	// 만들어진 객체에 점수 입력
	public void setMath(int score){
		math.setScore(score);
	}
	
	// 총점을 보여주는 메소드
	public void showStudentInfo(){
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "학생의 총점은 " + total+"입니다.");
	}
	
}
