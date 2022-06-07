package stream2.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		int i = 0;

		try {
			//input.txt라는 파일을 불러온다, 파일이 없을 시 오류 발생하기 때문에 try-catch
			fis = new FileInputStream("input.txt");
			// fis안에 내용이 없을 때까지 반복
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				// fis즉 input.txt파일을 닫는데 애초에 없을 수 있으니 try-catch
				fis.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}