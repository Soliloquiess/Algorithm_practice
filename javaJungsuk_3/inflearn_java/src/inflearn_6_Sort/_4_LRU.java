package inflearn_6_Sort;

import java.util.*;
class _4_LRU {	
	public int[] solution(int size, int n, int[] arr){
		int[] cache=new int[size];	//캐시 사이즈만큼
		for(int x : arr){	//이 x가 캐시에 있는지 없는지 살펴야 한다.
			int pos=-1;	//i는 0부터 돌면서 늘려간다.
			for(int i=0; i<size; i++) if(x==cache[i]) pos=i;
			//히트된 지점의 인덱스 저장.
			if(pos==-1){	//미스상황 
				for(int i=size-1; i>=1; i--){
					cache[i]=cache[i-1];
				}
			}
			else{	//히트처리
				for(int i=pos; i>=1; i--){
					cache[i]=cache[i-1];
				}
			}
			cache[0]=x;//미스처리
		}
		return cache;
	}
	public static void main(String[] args){
		_4_LRU T = new _4_LRU();
		Scanner kb = new Scanner(System.in);
		int s=kb.nextInt();
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		for(int x : T.solution(s, n, arr)) System.out.print(x+" ");
	}
}