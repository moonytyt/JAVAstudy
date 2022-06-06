package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			// 열려고 하는 파일이 없을 수 있기 때문에 try catch
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}finally{
			try {
				// 파일을 닫아줌, 닫으려는 파일이 없을 수 있기 때문에 try catch
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");
	}
}
// a.txt가 있을 시
/*	finally
end
*/

// a.txt가 없을 시
/*	java.io.FileNotFoundException: a.txt (지정된 파일을 찾을 수 없습니다)
Exception in thread "main" java.lang.NullPointerException
	at exception.ExceptionTest.main(ExceptionTest.java:21)
*/