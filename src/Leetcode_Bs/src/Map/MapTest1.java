package Map;


import java.util.*;

public class MapTest1 {

	public static void main(String[] args) {

		String s = "inflearn in love";
		System.out.println(Solve(s));

	}

	public static int Solve(String s) {
		
		//1-1.에러체크
		if (s == null || s.length() == 0)
			return -1;
		//1-2.맵에 담음. 담을 그릇(data structure)
		Map<Character, Integer> map = new HashMap();
		
		//2.
		for (char ch : s.toCharArray()) {	//s를 char형 배열로 만듬.
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			//이 getOrDefault가 실무에서 많이 쓰는데 바로 밑의 주석처리한 31~39를
//			한 메서드로 구현해놓음.
			
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			//ch라는 키가 있고 그 뒤 밸류값을 넣음.
			//ch가 존재하면 ch의 기존값을 가져온다.
			//ch가 존재 안하면 0을 가져온다.
			//결론은 이 getOrDefault함수는 무조건 알아야 한다.
			
			//맵에 아무것도 없음.
		}
		
		//for, while
//		for (char ch : s.toCharArray()) {
		
//			if(!map.containsKey(ch)) {	//i가 처음에 없으면
				//맵에 넣음.
//				map.put(ch,1 );
//			}else {
//				map.put(ch, map.get(ch)+1);
//			}
//		}
		

		//3. i =2 ,n=2, f=1 ,l=2.. a=1
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}