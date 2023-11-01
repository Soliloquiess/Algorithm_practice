package inflearn_7_Recursive;

import java.util.*;
class _4_피보나치_재귀 {
	public int DFS(int n){
		if(n==1) return 1;
		else if(n==2) return 1;
		else return DFS(n-2)+DFS(n-1);
	}
	public static void main(String[] args){
		_4_피보나치_재귀 T = new _4_피보나치_재귀();
		int n=10;
		for(int i=1; i<=n; i++) System.out.print(T.DFS(i)+" ");
	}	
}




//import java.util.*;
//class _4_피보나치_재귀 {
//	static int[] fibo;
//	public int DFS(int n){
//		if(fibo[n]>0) return fibo[n];
//		if(n==1) return fibo[n]=1;
//		else if(n==2) return fibo[n]=1;
//		else return fibo[n]=DFS(n-2)+DFS(n-1);
//	}
//	public static void main(String[] args){
//		_4_피보나치_재귀 T = new _4_피보나치_재귀();
//		int n=45;
//		fibo=new int[n+1];
//		T.DFS(n);
//		for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
//	}	
//}