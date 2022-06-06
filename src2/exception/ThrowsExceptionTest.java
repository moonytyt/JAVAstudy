package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionTest {

	// 두개의 Exception을 미룸
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsExceptionTest ex = new ThrowsExceptionTest();
		// 여기서 try catch를 한다
		try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}// 최상위 클래스인 Exception을 제일 마지막에 써야한다. 
		catch (Exception e ){
			System.out.println(e);
		}
		System.out.println("end");
	}

}
