package inflearn_4_HashMap_HashSet_TreeSet;

import java.util.*;
class _1_학급회장_해쉬 {	
	public char solution(int n, String s){
		char answer=' ';
		HashMap<Character, Integer> map=new HashMap<>();//해쉬맵선언
		for(char x : s.toCharArray()){
			map.put(x, map.getOrDefault(x, 0)+1); //map에 해싱 x라는게 키다
			//getOrDefault 은 x의 키값 가져오되 없으면 0을 가져온다.
		}
		//System.out.println(map.containsKey('F'));	//containsKey는 해당 키가 존재하느냐
		//System.out.println(map.size());	//size는 키의 개수를 알려준다 해당 문제에선 5 나옴
		//System.out.println(map.remove('C'));	//해당 키 삭제. 앞으로 문제 풀이에 매우 중요
		
		int max=Integer.MIN_VALUE;
		for(char key : map.keySet()){	//존재하는 키를 다 탐색(map객체 탐색), keySet은 존재하는 키 다 탐색
			//System.out.println(key+" "+map.get(key));
			//x가 키가 됨.
			//맵 탐색은 keySet이 매우 중요하다
			if(map.get(key)>max){
				max=map.get(key);
				answer=key;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		_1_학급회장_해쉬 T = new _1_학급회장_해쉬();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		System.out.println(T.solution(n, str));
	}
}