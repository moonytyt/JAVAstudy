package generics;

// 제네릭클래스에서 매개변수 타입<T>, Material을 상속받은 참조변수만 사용 가능해진다.
public class ThreeDPrinter<T extends Material> {
	// 사용할 타입이 대체될 곳에 T를 사용
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	
	public void printing(){
		material.doPrinting();
	}
}
