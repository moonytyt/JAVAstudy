package stream2.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요");
		int i = 0;
		try {
			//i가 다음 줄로 넘어가지 않을 때 까지
			while((i = System.in.read())!='\n'){
				// i는 아스키코드인 int로 받아서 char로 변환해준다
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
