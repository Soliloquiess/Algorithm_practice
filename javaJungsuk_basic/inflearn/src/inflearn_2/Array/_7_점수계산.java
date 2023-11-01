package inflearn_2.Array;


import java.util.*;
class _7_점수계산 {	
	public int solution(int n, int[] arr){
		int answer=0, cnt=0;
		for(int i=0; i<n; i++){
			if(arr[i]==1){
				cnt++;
				answer+=cnt;
			}
			else cnt=0;
		}	
		return answer;
	}
	public static void main(String[] args){
		_7_점수계산 T = new _7_점수계산();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
}