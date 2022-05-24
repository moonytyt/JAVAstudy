package inheritance;

class Animal{
	public void move(){
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move(){
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook(){
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move(){
		System.out.println("호랑이가 네발로 걷습니다.");
	}
	public void hunting(){
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move(){
		System.out.println("독수리가 납니다.");
	}
	public void wing(){
		System.out.println("독수리는 날개를 갖고있습니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		
		// Animal animal = new Human();과 같음
		test.moveAnimal(new Human());
		// Animal animal = new Tiger();와 같음
		test.moveAnimal(new Tiger());
		// Animal animal = new Eagle();과 같음
		test.moveAnimal(new Eagle());
		
		/*사람이 두발로 걷습니다.
		사람이 책을 읽습니다.
		호랑이가 네발로 걷습니다.
		호랑이가 사냥을 합니다.
		독수리가 납니다.
		독수리는 날개를 갖고있습니다.*/
	}

	// 매개변수의 자료형이 상위 클래스
	public void moveAnimal(Animal animal){
		// 재정의된 메서드가 각각 호출된다
		animal.move();
		
		// animal이 Human인지 판단
		if(animal instanceof Human){
			Human human = (Human)animal;
			human.readBook();
		}else if(animal instanceof Tiger ){
			Tiger tiger= (Tiger)animal;
			tiger.hunting();
		}else if(animal instanceof Eagle ){
			Eagle eagle= (Eagle)animal;
			eagle.wing();
		}
	}
	
}
