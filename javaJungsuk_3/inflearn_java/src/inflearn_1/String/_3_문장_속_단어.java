package inflearn_1.String;


import java.util.*;
class _3_문장_속_단어 {	
	public String solution(String str){
		String answer="";
		int m=Integer.MIN_VALUE;
		String[] s = str.split(" ");	//띄어쓰기로 구분	
		for(String x : s){
			int len=x.length();
			if(len>m){
				m=len;	//최대값 갱신
				answer=x;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		_3_문장_속_단어 T = new _3_문장_속_단어();
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		System.out.print(T.solution(str));
	}
}




//import java.util.*;
//class _3_문장_속_단어 {	
//	public String solution(String str){
//		String answer="";
//		int m=Integer.MIN_VALUE, pos;
//		while((pos=str.indexOf(' '))!=-1){	//첫번쨰로 발견된 위치 띄어쓰기 위치를 리턴
//			String tmp=str.substring(0, pos);
//			int len=tmp.length();
//			if(len>m){
//				m=len;
//				answer=tmp;
//			}
//			str=str.substring(pos+1);
//		}
//		if(str.length()>m) answer=str;
//		return answer;
//	}
//
//	public static void main(String[] args){
//		_3_문장_속_단어 T = new _3_문장_속_단어();
//		Scanner sc = new Scanner(System.in);
//		String str= sc.nextLine();
//		System.out.print(T.solution(str));
//	}
//}