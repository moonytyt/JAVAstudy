package collection.hashSet;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101,"이순신");
		Member memberKim = new Member(102,"김유신");
		Member memberShin = new Member(103,"신사임당");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		
		memberHashSet.showAll();
		/*신사임당회원님의 아이디는 103입니다.
		이순신회원님의 아이디는 101입니다.
		김유신회원님의 아이디는 102입니다.*/
		
		Member memberLee2 = new Member(101,"이몽룡");
		memberHashSet.addMember(memberLee2);
		memberHashSet.showAll();
		/*신사임당회원님의 아이디는 103입니다.
		이순신회원님의 아이디는 101입니다.
		김유신회원님의 아이디는 102입니다.
		이몽룡회원님의 아이디는 101입니다.*/
		// Member에서 equals()와 hashCode()를 재정의하면 이몽룡은 들어가지 않는다.
		
	}
	
}
