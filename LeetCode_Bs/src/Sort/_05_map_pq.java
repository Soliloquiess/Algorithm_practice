package Sort;
import java.util.*;
import java.util.Map.Entry;

public class _05_map_pq {

	public static void main(String[] args) {
//		String[] words= {"i", "study", "inflearn", "i", "study", "coding"};
		int k = 2;
		String[] words= {"a", "b", "c", "a", "b", "c", "a"};
		_05_map_pq a = new _05_map_pq();
		System.out.println(a.solve(words, k));
		
	}
	public List<String> solve(String[] words, int k) {
	//	1
		List<String> result = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		
		//1.map
		for(String w : words) {
			map.put(w, map.getOrDefault(w, 0)+1); //a3 b2 c2	///맵에 넣어줌.
			//map.getOrDefault(w, 0)+1 이 부분은 기존에 있으면 (or를 중심으로 get) w에 대한 값 가져옴
			//기존에 없으면 default로 가서 0으로 가서 +1을 해줌.
		}
		
		//2.pq
		Queue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a,b)->
		//a,b는 기본적으로 value가 큰 값을 뽑아내면 됨.
		a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) : 
		b.getValue()-a.getValue());
		
		
		//2_2.pq comparator(이건 옛날 방식 바로 위 람다방식인 2.pq를 이용하는게 더 쉽다.
		//옛날 방식으로 푼 이유는 compare를 익히기 위해서 이 방식으로 풀어봤다.
		Comparator<Map.Entry<String, Integer>> comp = new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				if(a.getValue()==b.getValue())
					return a.getKey().compareTo(b.getKey());
				return b.getValue()-a.getValue();
			}
		};
		
		Queue<Map.Entry<String, Integer>> pq2 = new PriorityQueue<>(comp);	//여기 comp부분에 comparator를 이용한다. 이 comp는 바로 위에 만들어놨다.
		
		
		
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			//keyset,entryset은 꼭 외워야 한다.
			pq2.offer(entry);
		}
		
		while(k>0) {
			result.add(pq2.poll().getKey());
			k--;
		}
       return result;
    }
}