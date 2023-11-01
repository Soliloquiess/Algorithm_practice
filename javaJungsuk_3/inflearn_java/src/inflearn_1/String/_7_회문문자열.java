package inflearn_1.String;


import java.util.*;
class _7_회문문자열 {	
	public String solution(String str){
		String answer="YES";
		str=str.toUpperCase();
		int len=str.length();
		for(int i=0; i<len/2; i++){
			if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
		}
		return answer;
	}

	public static void main(String[] args){
		_7_회문문자열 T = new _7_회문문자열();
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.print(T.solution(str));
	}
}



//import java.util.*;
//class _7_회문문자열 {	
//	public String solution(String str){
//		String answer="NO";
//		String tmp=new StringBuilder(str).reverse().toString();	//tmp가 뒤집어짐
//		if(str.equalsIgnoreCase(tmp)) answer="YES";	//이거 대신 uppercase사용해도 됨.
//		뒤집은거랑 같냐
//equalsIgnoreCase는 대소문자 구분 없이 비교
//		return answer;
//	}
//
//	public static void main(String[] args){
//		_7_회문문자열 T = new _7_회문문자열();
//		Scanner sc = new Scanner(System.in);
//		String str=sc.next();
//		System.out.print(T.solution(str));
//	}
//}
//



//import java.util.*;
////toUpperCase 사용
//class _7_회문문자열 {	
//	public String solution(String str){
//		String answer="NO";
//		String tmp=new StringBuilder(str).reverse().toString().toUpperCase();
//		if(str.equals(tmp)) answer="YES";	//이거 대신 uppercase사용해도 됨.
//		return answer;
//	}
//
//	public static void main(String[] args){
//		_7_회문문자열 T = new _7_회문문자열();
//		Scanner sc = new Scanner(System.in);
//		String str=sc.next().toUpperCase();
//		System.out.print(T.solution(str));
//	}
//}
