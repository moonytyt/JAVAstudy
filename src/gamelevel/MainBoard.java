package gamelevel;

// PlayerLevel에 따라 메서드가 다르기 때문에 추상 클래스로 만든다
abstract class PlayerLevel {

	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();
	
	// 이 메서드는 반복적이기 때문에 재정의 되면 안된다
	final public void go(int count){
		run();
		for(int i = 0; i< count ; i++){
			jump();
		}
		turn();
	}
}


class Player{
	
	// 상위 클래스인 PlayerLevel을 참조해야 level에 따른 showLevelMessage()를 보여준다.
	private PlayerLevel level;
	
	
	public Player(){
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgardeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count){
		// go() 안에 run(),jump(),turn()은 하위 클래스에서 재정의된 메서드가 호출된다.
		level.go(count);
	}
}

class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump할 줄 모릅니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn할 줄 모릅니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****초보자 레벨입니다****");
	}
	
}

class AdvencedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump 합니다");
		
	}

	@Override
	public void turn() {
		System.out.println("turn할 줄 모릅니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****중급자 레벨입니다****");
	}
	
}

class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("엄청 높이 jump 합니다");
		
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 돕니다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****고급 레벨입니다****");
	}
	
}

public class MainBoard {

	public static void main(String[] args) {
		
		// Player의 player객체 생성될 때 level은 BeginnerLevel의 객체가 생성된다.
		Player player = new Player();
		// 따라서 play(1)의 level.go()는 BeginnerLevel에 정의된 메서드들이 호출된다. 
		player.play(1);

		// AdvencedLevel객체 생성
		AdvencedLevel alevel = new AdvencedLevel();
		//alevel을 매개변수로 사용하면서  AdvencedLevel에 재정의된 메서드가 호출된다.
		player.upgardeLevel(alevel);
		player.play(2);

		SuperLevel sLevel = new SuperLevel();
		//sLevel을 매개변수로 사용하면서  SuperLevel에 재정의된 메서드가 호출된다.
		player.upgardeLevel(sLevel);
		player.play(3);
	/*	****초보자 레벨입니다****
		천천히 달립니다.
		jump할 줄 모릅니다.
		turn할 줄 모릅니다.
		****중급자 레벨입니다****
		빨리 달립니다.
		높이 jump 합니다
		높이 jump 합니다
		turn할 줄 모릅니다.
		****고급 레벨입니다****
		엄청 빨리 달립니다.
		엄청 높이 jump 합니다
		엄청 높이 jump 합니다
		엄청 높이 jump 합니다
		한바퀴 돕니다*/

	}

}
