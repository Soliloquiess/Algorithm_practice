package inflearn_2.Array;

import java.util.*;
class _2_보이는_학생 {	
	public int solution(int n, int[] arr){
		int answer=1, max=arr[0];
		for(int i=1; i<n; i++){
			if(arr[i]>max){
				max=arr[i];
				answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args){
		_2_보이는_학생 T = new _2_보이는_학생();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
}