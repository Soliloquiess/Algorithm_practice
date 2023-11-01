package inflearn_6_Sort;

import java.util.*;
class _5_중복확인 {	
	public String solution(int n, int[] arr){
		String answer="U";
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++){
			if(arr[i]==arr[i+1]){	//같으면 중복
				answer="D";
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args){
		_5_중복확인 T = new _5_중복확인();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, arr));
	}
}