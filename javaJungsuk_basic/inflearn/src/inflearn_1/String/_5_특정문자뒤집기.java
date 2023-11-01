package inflearn_1.String;


import java.util.*;
class _5_특정문자뒤집기 {	
	public String solution(String str){
		String answer;
		char[] s=str.toCharArray();
		int lt=0, rt=str.length()-1;
		while(lt<rt){
			if(!Character.isAlphabetic(s[lt])) lt++;	//알파벳이면 아닐때 참이됨
			else if(!Character.isAlphabetic(s[rt])) rt--;	//얘도 알파벳 아닐떄 참이됨
			else{
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
		}
		answer=String.valueOf(s);	//value를 스트링화 시켜준다.
		return answer;
	}

	public static void main(String[] args){
		_5_특정문자뒤집기 T = new _5_특정문자뒤집기();
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.println(T.solution(str));
	}
}



//---------
//
//
//import java.util.*;
//class _5_특정문자뒤집기 {	
//	public String solution(String str){
//		String answer;
//		char[] s=str.toCharArray();
//		int lt=0, rt=str.length()-1;
//		while(lt<rt){
//			if(!(s[lt] >= 97 && s[lt] <= 122) && !(s[lt] >= 65 && s[lt] <= 90)) lt++;
//			else if(!(s[rt] >= 97 && s[rt] <= 122) && !(s[rt] >= 65 && s[rt] <= 90)) rt--;
//			else{
//				char tmp=s[lt];
//				s[lt]=s[rt];
//				s[rt]=tmp;
//				lt++;
//				rt--;
//			}
//		}
//		answer=String.valueOf(s);
//		return answer;
//	}
//
//	public static void main(String[] args){
//		_5_특정문자뒤집기 T = new _5_특정문자뒤집기();
//		Scanner sc = new Scanner(System.in);
//		String str=sc.next();
//		System.out.println(T.solution(str));
//	}
//}