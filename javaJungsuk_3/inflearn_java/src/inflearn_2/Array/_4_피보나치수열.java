package inflearn_2.Array;


import java.util.*;
class _4_피보나치수열 {	
	public int[] solution(int n){
		int[] answer=new int[n];
		answer[0]=1;
		answer[1]=1;
		for(int i=2; i<n; i++){
			answer[i]=answer[i-2]+answer[i-1];
		}
		return answer;
	}
	public static void main(String[] args){
		_4_피보나치수열 T = new _4_피보나치수열();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int x :T.solution(n)) System.out.print(x+" ");
	}
}







//import java.util.*;
//class _4_피보나치수열 {		//배열 안 쓰고 풀어야 할 경우.
//	public void solution(int n){
//		int a=1, b=1, c;
//		System.out.print(a+" "+b+" ");
//		for(int i=2; i<n; i++){
//			c=a+b;
//			System.out.print(c+" ");
//			a=b;
//			b=c;
//		}
//	}
//	public static void main(String[] args){
//		_4_피보나치수열 T = new _4_피보나치수열();
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		T.solution(n);
//	}
//}