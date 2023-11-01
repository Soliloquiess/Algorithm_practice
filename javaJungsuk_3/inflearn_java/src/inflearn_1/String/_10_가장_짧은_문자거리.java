package inflearn_1.String;



import java.util.*;
public class _2_대소문자_변환 {
	public String solution(String str){
		String answer="";	//문자열 하나 생성
		for(char x : str.toCharArray()){
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);

		}
		return answer;
	}

	public static void main(String[] args){
		_2_대소문자_변환 T = new _2_대소문자_변환();
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.print(T.solution(str));
	}
}

//이건 아스키넘버로 구현
//import java.util.*;
//class Main {	
//	public String solution(String str){
//		String answer="";
//		for(char x : str.toCharArray()){
//			if(x>=97 && x<=122) answer+=(char)(x-32);
//			else answer+=(char)(x+32);
//		}
//		return answer;
//	}
//
//	public static void main(String[] args){
//		Main T = new Main();
//		Scanner sc = new Scanner(System.in);
//		String str=sc.next();
//		System.out.print(T.solution(str));
//	}
//}