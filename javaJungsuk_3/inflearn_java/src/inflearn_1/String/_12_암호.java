package inflearn_1.String;

import java.util.*;
class _12_암호 {	
	public String solution(int n, String s){
		String answer="";
		for(int i=0; i<n; i++){
			String tmp=s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num=Integer.parseInt(tmp, 2);	//정수화 시키는거 tmp넘어가고 2진수화 시킴.
			answer+=(char)num;
			s=s.substring(7);
		}
		return answer;
	}

	public static void main(String[] args){
		_12_암호 T = new _12_암호();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		System.out.println(T.solution(n, str));
	}
}