package inflearn_2.Array;


import java.util.*;
class _5_소수_에라토스테네스체 {	
	public int solution(int n){
		int cnt=0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++){
			if(ch[i]==0){
				cnt++;
				for(int j=i; j<=n; j=j+i) 
					ch[j]=1;
			}
		}
		return cnt;
	}
	public static void main(String[] args){
		_5_소수_에라토스테네스체 T = new _5_소수_에라토스테네스체();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(T.solution(n));
	}
}