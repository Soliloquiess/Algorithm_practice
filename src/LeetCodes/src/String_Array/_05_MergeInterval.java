package String_Array;


import java.util.*;

//1
class Interval {
	int start;
	int end;

	Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}
}

public class _05_MergeInterval {

	public static void main(String[] args) {

//			int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
		Interval in1 = new Interval(1, 3);
		Interval in2 = new Interval(2, 6);
		Interval in3 = new Interval(8, 10);
		Interval in4 = new Interval(15, 18);

		List<Interval> intervals = new ArrayList<>();
		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);
		_05_MergeInterval a = new _05_MergeInterval();
		List<Interval> list = a.merge(intervals);

		System.out.println("----result----");
		a.print(list);
	}

	public List<Interval> merge(List<Interval> intervals) {
		if (intervals.isEmpty())
			return intervals;
         
//		type1
		Collections.sort(intervals,(a,b) -> a.start-b.start);	//오름차순

		Collections.sort(intervals,(a,b) -> b.start-a.start);	//내림차순
//		type2
//		Collections.sort(intervals, comp2);
		//둘중 아무거나 근데 타입 1이 더 많이 쓰임.

		List<Interval> result = new ArrayList<Interval>();
		Interval before = intervals.get(0);
		
		for (int i = 1; i < intervals.size(); i++) {
			Interval current = intervals.get(i);
			if (before.end >= current.start) {	//end가 크면 합쳐짐.
				//현재 end로 합쳐짐(Math.max 이용해서 before의 end와 현재 end를 합침.
				before.end = Math.max(current.end, before.end);
			} else {
				result.add(before);

				//합친다음에 before에 result감
				before = current;
				//before는 current 복사한 값이 들어감.
			}
		}

		if (!result.contains(before)) {	//남은거에result의 마지막 before가 있냐.
			System.out.println("before.end: " + before.end);
			result.add(before);	//result에 마지막 꺼 넣음.
			
		}

		return result;
	}

	//type2
	Comparator <Interval> comp = new Comparator<Interval>() {
		public int compare(Interval a, Interval b) {
			// TODO Auto-generated method stub
			return a.start - b.start;
		}
	};

	
	Comparator<Interval> Comp = new Comparator<Interval>() {
		//소팅하겠다.

		@Override
		public int compare(Interval a, Interval b) {
			// TODO Auto-generated method stub
			return a.start - b.start;	//이렇게 하면 오름차순
		}
		
	};
	
	//type3
	Comparator<Interval> comp2 = new Comparator<Interval>() {
		@Override

		public int compare(Interval o1, Interval o2) {
			if (o1.start > o2.start) {
				return 1;
			} else if (o1.start < o2.start) {
				return -1;
			} else {
				return 0;
			}
		}
	};

	void print(List<Interval> list) {
		for (int i = 0; i < list.size(); i++) {
			Interval in = list.get(i);
			System.out.println(in.start + " " + in.end);
		}
	}

}
