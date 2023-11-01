package inflearn_6_Sort;


import java.util.*;
class _8_이분검색 {
	public int solution(int n, int m, int[] arr){
		int answer=0;
		Arrays.sort(arr);
		int lt=0, rt=n-1;
		while(lt<=rt){
			int mid=(lt+rt)/2;
			if(arr[mid]==m){	//찾은 경우
				answer=mid+1;
				break;
			}
			if(arr[mid]>m) rt=mid-1;
			else lt=mid+1;
		}
		return answer;
	}
	public static void main(String[] args){
		_8_이분검색 T = new _8_이분검색();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}