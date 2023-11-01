package inflearn_4_HashMap_HashSet_TreeSet;

import java.util.*;
class _4_모든아나그램찾기 {	
	public int solution(String a, String b){
		int answer=0;
		HashMap<Character, Integer> am=new HashMap<>();
		HashMap<Character, Integer> bm=new HashMap<>();
		for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
		//있으면 키값 가져오고(x)아니면 0 가져와라
		int L=b.length()-1;
		for(int i=0; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		int lt=0;
		for(int rt=L; rt<a.length(); rt++){
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			if(am.equals(bm)) answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));	//키를 삭제해버림
			lt++;
		}
		return answer;
	}
		

	public static void main(String[] args){
		_4_모든아나그램찾기 T = new _4_모든아나그램찾기();
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		System.out.print(T.solution(a, b));
	}
}