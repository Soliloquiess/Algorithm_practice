package inflearn_1.String;


import java.util.*;
class _6_중복문자제거 {	
	public String solution(String str){
		String answer="";
		for(int i=0; i<str.length(); i++){
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);	//이게 참일때만 실행
		}
		return answer;
	}

	public static void main(String[] args){
		_6_중복문자제거 T = new _6_중복문자제거();
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.print(T.solution(str));
	}
}