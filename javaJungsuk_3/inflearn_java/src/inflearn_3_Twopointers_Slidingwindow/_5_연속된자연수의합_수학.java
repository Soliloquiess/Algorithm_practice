package inflearn_3_Twopointers_Slidingwindow;

import java.util.*;
class _5_연속된자연수의합_수학 {	
	public int solution(int n){
		int answer=0, cnt=1;
		n--;
		while(n>0){
			cnt++;
			n=n-cnt;
			if(n%cnt==0) answer++;
		}
		return answer;
	}

	public static void main(String[] args){
		_5_연속된자연수의합_수학 T = new _5_연속된자연수의합_수학();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(T.solution(n));
	}
}