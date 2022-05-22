package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		// 주소값이 같음
		System.out.println(c1);
		System.out.println(c2);
		
		// 삼성, 삼성
		System.out.println(c1.getCompanyName());
		System.out.println(c2.getCompanyName());
		
		// LG, LG
		c1.setCompanyName("LG");
		System.out.println(c1.getCompanyName());
		System.out.println(c2.getCompanyName());
		
		// 애플, 애플
		c2.setCompanyName("애플");
		System.out.println(c1.getCompanyName());
		System.out.println(c2.getCompanyName());
	}

}
