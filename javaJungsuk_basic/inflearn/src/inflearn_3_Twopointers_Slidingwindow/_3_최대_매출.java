package inflearn_3_Twopointers_Slidingwindow;

import java.util.*;
class _3_최대_매출 {	
	public int solution(int n, int k, int[] arr){
		int answer, sum=0;
		for(int i=0; i<k; i++) sum+=arr[i];
		answer=sum;
		for(int i=k; i<n; i++){
			sum+=(arr[i]-arr[i-k]);	//그 뒤에칸 더하고 그 앞칸 뺸다(슬라이딩 윈도우)
			answer=Math.max(answer, sum);
		}
		return answer;
	}

	public static void main(String[] args){
		_3_최대_매출 T = new _3_최대_매출();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}
}