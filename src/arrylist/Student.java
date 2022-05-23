package arrylist;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	// 과목에 대한 객체 배열을 만든다
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		subjectList = new ArrayList<Subject>();
	}

	
	public void addSubject(String name, int score) {
		// subject 객체를 생성한다
		Subject subject = new Subject();
		// subject 객체에 이름과 점수를 지정한다
		subject.setName(name);
		subject.setScorePoint(score);
		// subject에 지정된 객체와 이름을 subjectList배열에 추가한다
		subjectList.add(subject);
	}

	public void showStudentInfo() {

		int total = 0;
		// subjectList에 있는 배열들을 subject로 받으며 for문을 돌린다
		for (Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println(
					"학생" + studentName + "님의 " + subject.getName() +
					" 과목의 성적은 " + subject.getScorePoint() + "점 입니다.");
		}
		System.out.println("학생" + studentName + "님의 총점은 " + total + "점 입니다.");
	}

}
