package inflearn_2.Array;


import java.util.*;
class _1_큰_수_출력하기 {	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(arr[0]);	//맨앞자리는 고정으로 들어가니까
		for(int i =1; i<n;i++) {
			if(arr[i]>arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}

	public static void main(String[] args){
		_1_큰_수_출력하기 T = new _1_큰_수_출력하기();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr = new int [n];
		for(int i =0; i<n ;i++) {
			arr[i] = sc.nextInt();
		}
		for(int x: T.solution(n, arr)) {
			System.out.print(x+" ");
		}
	}
}