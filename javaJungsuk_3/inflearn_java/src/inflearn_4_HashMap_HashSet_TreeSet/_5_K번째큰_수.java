package inflearn_4_HashMap_HashSet_TreeSet;


import java.util.*;
class _5_K번째큰_수 {	
	public int solution(int[] arr, int n, int k){
		int answer=-1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());	//내림차순으로 정렬(기본은 오름차순)
		//treeset이 중복제거+자동정렬까지 한다.
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				for(int l=j+1; l<n; l++){
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		//Tset.remove(143);	//값이 143인 set요소 삭제
		//System.out.println(Tset.size());	//각 set요소 출력(여기선 72개
		//System.out.println("first : "+ Tset.first());	//오름차순이면 최소값, 내림차순이면 최대값(제일 앞의 자료)
		//System.out.println("last : "+ Tset.last());	//오름차순이면 최대값, 내림차순이면 최소값(제일 앞의 자료)

		for(int x : Tset){
			//System.out.println(x);
			cnt++;
			if(cnt==k) return x;
		}
		return answer;
	}

	public static void main(String[] args){
		_5_K번째큰_수 T = new _5_K번째큰_수();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}