package inflearn_1.String;


import java.util.*;
class _3_����_��_�ܾ� {	
	public String solution(String str){
		String answer="";
		int m=Integer.MIN_VALUE;
		String[] s = str.split(" ");	//����� ����	
		for(String x : s){
			int len=x.length();
			if(len>m){
				m=len;	//�ִ밪 ����
				answer=x;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		_3_����_��_�ܾ� T = new _3_����_��_�ܾ�();
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		System.out.print(T.solution(str));
	}
}




//import java.util.*;
//class _3_����_��_�ܾ� {	
//	public String solution(String str){
//		String answer="";
//		int m=Integer.MIN_VALUE, pos;
//		while((pos=str.indexOf(' '))!=-1){	//ù������ �߰ߵ� ��ġ ���� ��ġ�� ����
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
//		_3_����_��_�ܾ� T = new _3_����_��_�ܾ�();
//		Scanner sc = new Scanner(System.in);
//		String str= sc.nextLine();
//		System.out.print(T.solution(str));
//	}
//}