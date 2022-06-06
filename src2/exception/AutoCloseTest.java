package exception;

public class AutoCloseTest {

	public static void main(String[] args) {

		
		// Exception이 발생하지 않으면 close가 자동으로 불린다, finally를 입력할 필요가 없다
		try(AutoCloseObj obj = new AutoCloseObj()){
			// 인위적으로 exception 발생
			throw new Exception();
		}catch(Exception e ){
			System.out.println("Exception");
		}
	
/*		close()
		Exception*/
	}

}
