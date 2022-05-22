package thisex;

class Person{
	
	String name;
	int age;
	
	public Person(){
		/*name = "이름없음";
		age= 1;*/
		
		// 밑에 있는 생성자를 불러옴
		this("이름없음", 1);
	}
	
	public Person(String name, int age){
		this.name= name;
		this.age = age;
	}
	
	public Person returnSelf(){
		return this;
	}
	
}


public class CallAnotherConst {

	public static void main(String[] args) {

		// 디폴트생성자가 만들어지는데 this때문에 name = "이름없음", age=1이 된다.
		Person p1 = new Person();
		System.out.println(p1.name);
		
		// p1의 주솟값이 나타난다.
		System.out.println(p1.returnSelf());
	}

}
