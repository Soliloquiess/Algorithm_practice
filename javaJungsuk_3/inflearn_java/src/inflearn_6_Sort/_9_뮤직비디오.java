package inflearn_6_Sort;


import java.util.*;
class _9_뮤직비디오 {
	public int count(int[] arr, int capacity){
		int cnt=1, sum=0;
		for(int x : arr){
			if(sum+x>capacity){	//sum은 현재 노래가 차지하는 용량들 합ㄴ
				cnt++;
				sum=x;
			}
			else sum+=x;
		}
		return cnt;
	}

	public int solution(int n, int m, int[] arr){
		int answer=0;
		int lt=Arrays.stream(arr).max().getAsInt();	//getAsInt는 기본형 int로 바꿔준다.
		int rt=Arrays.stream(arr).sum();
		while(lt<=rt){
			int mid=(lt+rt)/2;
			if(count(arr, mid)<=m){
				answer=mid;
				rt=mid-1;
			}
			else lt=mid+1;
		}
		return answer;
	}
	public static void main(String[] args){
		_9_뮤직비디오 T = new _9_뮤직비디오();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}