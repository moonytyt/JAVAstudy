package stream2.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// FileInputStream은 byte로 읽기 때문에 한글이 깨지기 때문에 보조스트림인 InputStreamReader를 사용 
		try (InputStreamReader irs= new InputStreamReader(new FileInputStream("reader.txt"))){

			int i = 0;
			while ((i = irs.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
