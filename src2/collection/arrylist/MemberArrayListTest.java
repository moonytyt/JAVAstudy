package collection.arrylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101,"이순신");
		Member memberKim = new Member(102,"김유신");
		Member memberShin = new Member(103,"신사임당");
	
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberShin);
		
		memberArrayList.showAll();
		
		System.out.println(" ");
		
		memberArrayList.removeMember(101);
		memberArrayList.showAll();
		
		/*이순신회원님의 아이디는 101입니다.
		김유신회원님의 아이디는 102입니다.
		신사임당회원님의 아이디는 103입니다.
		 
		김유신회원님의 아이디는 102입니다.
		신사임당회원님의 아이디는 103입니다.*/

	}

}
