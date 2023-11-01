package inflearn_4_HashMap_HashSet_TreeSet;


import java.util.*;
class _2_아나그램 {	
	public String solution(String s1, String s2){
		String answer="YES";
		HashMap<Character, Integer> map=new HashMap<>();
		for(char x : s1.toCharArray()){
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char x : s2.toCharArray()){
			if(!map.containsKey(x) || map.get(x)==0) return "NO";
			map.put(x, map.get(x)-1); 
		}
		return answer;
	}

	public static void main(String[] args){
		_2_아나그램 T = new _2_아나그램();
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		System.out.print(T.solution(a, b));
	}
}