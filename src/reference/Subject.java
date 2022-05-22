package reference;

public class Subject {

	String subjectName;
	int score;
	
	// Subject 생성자로 매개변수 name을 받아 subjectName입력
	public Subject(String name){
		subjectName = name;
	}
	
	public void setSubjectName(String name){
		subjectName = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSubjectName() {
		return subjectName;
	}
}
