package inflearn_4_HashMap_HashSet_TreeSet;


import java.util.*;
class _3_매출액의_종류 {	
	public ArrayList<Integer> solution(int n, int k, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		for(int i=0; i<k-1; i++){
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);	//arr[i]에 이 키값을 넣는다.
		}
		int lt=0;
		for(int rt=k-1; rt<n; rt++){	//k-1인 이유는 0번 인덱스부터 시작이라
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1);
            		if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            		lt++;
		}
		return answer;
	}

	public static void main(String[] args){
		_3_매출액의_종류 T = new _3_매출액의_종류();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
	}
}