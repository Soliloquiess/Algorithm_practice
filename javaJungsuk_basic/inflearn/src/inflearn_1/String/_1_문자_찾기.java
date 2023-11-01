package inflearn_1.String;

import java.util.*;
public class _1_문자_찾기 {

	public int solution(String str, char t){
		int answer=0;
		str=str.toUpperCase();
		t=Character.toUpperCase(t);
		//System.out.println(str+" "+t);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/
		for(char x : str.toCharArray()){
			if(x==t) answer++;
		}
		return answer;
	}

	public static void main(String[] args){
		_1_문자_찾기 T = new _1_문자_찾기();
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		char c= sc.next().charAt(0);	//문자열 하나만 가져옴
		System.out.print(T.solution(str, c));
	}
}