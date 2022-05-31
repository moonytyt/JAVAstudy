package collection.arrylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList(){
		arrayList = new ArrayList<Member>();
	}

	// ArrayList에 멤버를 넣는다
	public void addMember(Member member){
		arrayList.add(member);
	}
	
	// ArrayList 멤버 삭제
	public boolean removeMember(int memberID){
		
		/*for(int i = 0; i < arrayList.size(); i++){
			// arrayList[i]에 있는 member를 member변수에 담는다
			Member member = arrayList.get(i);
			//member의 ID를 가져온다
			int tempID = member.getMemberID();
			// 입력받은 memberID와 tempID비교
			if(memberID == tempID){
				// 참이면 remove실행
				arrayList.remove(i);
				return true;
			}
		}*/
		
		Iterator<Member> iterator = arrayList.iterator();
		// hasNext() : 다음것이 있느냐?
		while(iterator.hasNext()){
			Member member = iterator.next();
			int tempID = member.getMemberID();
			if(memberID == tempID){
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll(){
		// for문으로 arryList에 있는 member를 호출
		for(Member member : arrayList){
			System.out.println(member);
		}
		
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()){
			Member member = iterator.next();
			System.out.println(member);
		}
		
	}
}
