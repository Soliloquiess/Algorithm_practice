package inflearn_1.String;


import java.util.*;
class _4_단어_뒤집기 {	
	public ArrayList<String> solution(String[] str){
		ArrayList<String> answer=new ArrayList<>(); 
		for(String x : str){
			String tmp=new StringBuilder(x).reverse().toString();
			//stringbuilder로 문자열 다룬다.
			//왜 스트링이라는 객체 있는데 스트링 빌더 쓰나?
			//스트링끼리 더하거나 리플레이스 하면 새로운 객체 만듬.
			//그러면 문자열을 변경할 수없다.
			//근데 특정 조건에 맞는거만 뒤집어야 하면 이렇게 하면 안된다(다 바꾸게 되므로)
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args){
		_4_단어_뒤집기 T = new _4_단어_뒤집기();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0; i<n; i++){
			str[i]=sc.next();
		}
		for(String x : T.solution(str)){
			System.out.println(x);
		}
	}
}








//import java.util.*;
//class _4_단어_뒤집기 {	
//	public ArrayList<String> solution(int n, String[] str){
//		ArrayList<String> answer=new ArrayList<>(); 
//		for(String x : str){
//			char[] s=x.toCharArray();
//			int lt=0, rt=x.length()-1;	//0번 인덱스 부터 시작이므로 -1
//			while(lt<rt){
//				char tmp=s[lt];
//				s[lt]=s[rt];
//				s[rt]=tmp;
//				lt++;
//				rt--;
//			}
//			String tmp=String.valueOf(s);	//valueOf는 스태틱으로 선언된 메서드
//			answer.add(tmp);
//		}
//		return answer;
//	}
//
//	public static void main(String[] args){
//		_4_단어_뒤집기 T = new _4_단어_뒤집기();
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		String[] str=new String[n];
//		for(int i=0; i<n; i++){
//			str[i]=sc.next();
//		}
//		for(String x : T.solution(n, str)){
//			System.out.println(x);
//		}
//	}
//}



