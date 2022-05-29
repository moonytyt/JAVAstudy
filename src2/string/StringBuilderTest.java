package string;

public class StringBuilderTest {

	public static void main(String[] args) {

			String str1 = new String("java");
			
			System.out.println(System.identityHashCode(str1));
		
			StringBuilder buffer = new StringBuilder(str1);
			System.out.println(System.identityHashCode(buffer));
			
			buffer.append(" and");
			buffer.append("android");
			System.out.println(System.identityHashCode(buffer));
			// 동일한 주소값을 갖는다
			
			//String클래스로 변환
			String str2 = buffer.toString();
			System.out.println(str2);
	}

}
