package singleton;

public class Company {
	// 클래스 밖에서 생성자를 호출하지 못하기 때문에 instance 객체를 생성해준다
	// 이것도 private으로 하는 이유는? 함부로 값이 바뀌면 안되기 때문에
	// 단하나만 있을것이기 때문에 static
	private static Company instance;
	private String companyName;
	
	
	// 외부에서 생성자를 호출하지 못하도록 private으로 만든다
	private Company(){
		companyName="삼성";
	}
	
	// instance가 private이기 때문에 외부에서 사용x -> 외부에서 사용하기 위해 메소드 생성
	// static이 없으면 외부에서 객체를 생성하고 불러야 하기 때문에 static메서드로 생성
	public static Company getInstance(){
		if(instance == null)  
			instance= new Company();
		return instance;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
