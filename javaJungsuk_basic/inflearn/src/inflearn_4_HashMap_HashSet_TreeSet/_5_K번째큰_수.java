package inflearn_4_HashMap_HashSet_TreeSet;


import java.util.*;
class _5_K번째큰_수 {	
	public int solution(int[] arr, int n, int k){
		int answer=-1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				for(int l=j+1; l<n; l++){
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		//Tset.remove(143);
		//System.out.println(Tset.size());
		//System.out.println("first : "+ Tset.first());
		//System.out.println("last : "+ Tset.last());

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