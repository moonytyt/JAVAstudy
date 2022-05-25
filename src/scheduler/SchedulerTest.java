package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		//R, L, P
		System.out.println("전화 상담 배분방식을 선택하세요 R, L , P");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch =='r'){
			scheduler = new RoundRobin();
		}else if(ch == 'L' || ch =='l'){
			scheduler = new LeastJob();
		}else if (ch == 'P' || ch =='p'){
			scheduler = new PriorityAllocation();
		}else{
			System.out.println("지원하지 않는 기능입니다.");
		}
		
		// 인스턴스가 무엇인지에 따라서 호출되는 값이 달라진다!
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}

}
