package collection.arrylist;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data){
		arrayStack.add(data);
	}
	
	public String pop(){
		
		// 데이터가 없는데 꺼내면 언더플로우 발생한다.
		int len = arrayStack.size();
		if(len == 0){
			System.out.println("스택이 비었습니다");
			return null;
		}
		// remove는 데이터가 삭제됨
		return arrayStack.remove(len - 1);
	}

	
	public String peek(){
		// 데이터가 없는데 꺼내면 언더플로우 발생한다.
		int len = arrayStack.size();
		if(len == 0){
			System.out.println("스택이 비었습니다");
			return null;
		}
		
		// get은 데이터가 사라지지 않음 가져오기만 함
		return arrayStack.get(len - 1);
	}
	
}

public class StackTest {

	public static void main(String[] args) {

		MyStack stack = new MyStack();
		// a,b,c가 순서대로 삽입
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		c
//		b
//		a
//		스택이 비었습니다
//		null


	}

}
