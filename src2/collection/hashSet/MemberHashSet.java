package collection.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
private HashSet<Member> hashSet;
	
	public MemberHashSet(){
		hashSet = new HashSet<Member>();
	}

	
	public void addMember(Member member){
		// 여기서 equals()호출
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID){
		
		Iterator<Member> iterator = hashSet.iterator();
		// hasNext() : 다음것이 있느냐?
		while(iterator.hasNext()){
			Member member = iterator.next();
			int tempID = member.getMemberID();
			if(memberID == tempID){
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll(){
		
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()){
			Member member = iterator.next();
			System.out.println(member);
		}
		}
}
