package String_Array;

import java.util.Arrays;
import java.util.Comparator;
/*
* Arrays.sort() 
* time complexity of O(n logn n) 
* space complexity of O(1).
*/


//class Interval{
//	int start;
//	int end;
//	Interval(){
//		this.start = 0;
//		this.end =0;
//	}
//	Interval(int s, int e){
//		this.start = s;
//		this.end = e;
//	}
//}
public class _01_MeetingRooms {
	public static void main(String[] args) {
		_01_MeetingRooms a = new _01_MeetingRooms();
		
	
		Interval in1 = new Interval(15,20);
		Interval in2 = new Interval(5,10);
		Interval in3 = new Interval(0,30);
		
		Interval[] intervals = {in1, in2,in3};
		System.out.println(a.solve(intervals));
	}
	
	public boolean solve(Interval[] intervals) {
		if(intervals == null) return false;
		//1 sorting
		print(intervals);
		Arrays.sort(intervals, Comp);	//객체에 대한 sorting
		//객체를 소팅해라 Comp로
		System.out.println("===after sort====");
		print(intervals);
		
		for(int i=1; i<intervals.length; i++) {
			if(intervals[i-1].end >intervals[i].start)
				//앞의 꺼의 end타임과 현재꺼의 start 비교해서 end타임이 더 크면 false
				return false;
		}
			
		return true;
		
		
	}
	public void print(Interval[] intervals) {
		for(int i=0; i<intervals.length; i++) {
			Interval in = intervals[i];
			System.out.println(in.start+" "+in.end);
			
		}
	}
	Comparator<Interval> Comp = new Comparator<Interval>() {
		//소팅하겠다.

		@Override
		public int compare(Interval a, Interval b) {
			// TODO Auto-generated method stub
			return a.start - b.start;	//이렇게 하면 오름차순
		}
		
	};
	
	

}
