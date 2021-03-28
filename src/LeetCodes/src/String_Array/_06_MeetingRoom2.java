package String_Array;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//class Interval{	//다른 클래스에 이미 선언.
//	int start, end;
//	Interval(){
//		this.start =0;
//		this.end =0;
//	}
//	Interval(int s, int e){
//		this.start = s;
//		this.end = e;
//	}
//}
public class _06_MeetingRoom2 {
	
	public static void main(String[] args) {
		_06_MeetingRoom2 a = new _06_MeetingRoom2();
		Interval in1 = new Interval(5,10);
		Interval in2 = new Interval(15,20);
		Interval in3 = new Interval(0,30);
		Interval[] intervals = {in1,in2,in3};
		System.out.println(a.solve1(intervals));

//		System.out.println(a.solve2(intervals));
	}
	
	
	public int solve1(Interval[] intervals) {
		Arrays.sort(intervals, (Interval a, Interval b) -> a.start - b.start);
		//이러면 소트 된거.
		if(intervals == null || intervals.length==0)
			//에러체크 조건
			return 0;
		
		//우선순위 큐 최소힙(end를 넣은 최소힙을 생성) = a.end-b.end
		//1. 앞 .End > 뒤 start: 회의실 1개 필요
		//2. 앞.end<뒤.start : 회의실 필요 없음.
		
		Queue<Interval> pq = new PriorityQueue<>((Interval a, Interval b) -> a.end - b.end);
		//얘도 위에 소트 그대로 사용.(end타입에 대한 우선순위 큐 생성)
		pq.add(intervals[0]);	//우선순위 큐에 맨 처음꺼 하나 넣어놓고.

		for (int i = 1; i < intervals.length; i++) {
        	System.out.println("pq.peek(): "+pq.peek().end+" intervals[i].start "+intervals[i].start);
			if (pq.peek().end <= intervals[i].start) {//poll은 삭제하지만 peek는 맨위로 하기만.
				//이 조건에 걸리면 뽑아내고.
				pq.poll();
			}
			pq.add(intervals[i]);
		}

		return pq.size();
	}
	
	
	public int solve2(Interval[] intervals) {
		if(intervals == null || intervals.length==0)
			//에러체크 조건
			return 0;
		Arrays.sort(intervals, Comp);
		Queue<Interval> heap = new PriorityQueue<Interval>(intervals.length, Comp2);
		
		heap.offer(intervals[0]);
		
		for(int i=1; i<intervals.length; i++) {
			Interval interval = heap.poll();
			if( interval.end <= intervals[i].start  ) {
				interval.end = intervals[i].end;
			}else {
				heap.offer(intervals[i]);
			}
			 heap.offer(interval);
		}
		return heap.size();
		
		
		
	}
	
	Comparator<Interval> Comp2 = new Comparator<Interval>() {
		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			return o1.end - o2.end;
		}
	};
	
	Comparator<Interval> Comp = new Comparator<Interval>() {
		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			return o1.start - o2.start;
		}
	};
}