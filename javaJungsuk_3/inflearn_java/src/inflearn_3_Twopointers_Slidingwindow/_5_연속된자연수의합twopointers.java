package inflearn_3_Twopointers_Slidingwindow;


import java.util.*;
class _5_연속된자연수의합twopointers {	
	public int solution(int n){
		int answer=0, sum=0;
		int m=n/2+1;
		int[] arr=new int[m];
		for(int i=0; i<m; i++) arr[i]=i+1;
		int lt=0;
		for(int rt=0; rt<m; rt++){
			sum+=arr[rt];
			if(sum==n) answer++;
			while(sum>=n){
				sum-=arr[lt++];	//앞문제와 동일
				if(sum==n) answer++; 
			}
		}
		return answer;
	}

	public static void main(String[] args){
		_5_연속된자연수의합twopointers T = new _5_연속된자연수의합twopointers();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(T.solution(n));
	}
}