package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		StringConcatImp1 sImp1 = new StringConcatImp1();
		sImp1.makeString("Hello", "JAVA");
		
		//람다식
		StringConcat concat = (s1,s2)-> System.out.println(s1 + " " + s2);
		concat.makeString("hello", "java");
	}

}
