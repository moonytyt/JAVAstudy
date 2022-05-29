package string;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1 == str2);
		// false
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);
		// true, 즉 주소값이 같다 왜냐하면 상수 풀에 있으니깐
		
	}

}
