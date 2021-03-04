package SWEA;

//public class SWEA_1288_새로운_불면증_치료법 {
//
//}

//import java.io.*;
//
//public class SWEA_1288_새로운_불면증_치료법 {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());
//		for(int tc=1; tc<=T; tc++) {
//        
//        	//입력받은 값을 문자열과 정수형으로 각각 저장
//			String s = br.readLine();
//			int n = Integer.parseInt(s);
//            
//            
//            //0-9까지의 숫자를 모두 봤는지 확인
//			boolean check[] = new boolean[10];
//			int count = 0;
//			
//            
//			int x=1; //입력받은 n에 계속 곱해줄 변수
//			while(true) {
//				for(int i=0; i<s.length(); i++) {
//                	//한글자씩 정수로 변환하여 확인
//					int tmp = Integer.parseInt(s.substring(i,i+1));
//					if(check[tmp] == false) {
//						count++;
//						check[tmp] = true;
//					}
//				}
//				
//                //10개를 모두 봤다
//				if(count == 10) break;
//				
//				x++;
//				s = Integer.toString(n*x);
//			}
//			
//			System.out.println("#"+tc+" "+s);
//			
//			
//		}
//	}
//
//}


import java.util.*;
public class SWEA_1288_새로운_불면증_치료법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int N, i, cur, temp, q;
		Set<Integer> seen = new HashSet<Integer>();

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			seen.clear();
			for(i=1; ; i++) {
				cur = N*i;
				for(temp=cur; temp>0; temp/=10) {
					q = temp%10;
					seen.add(q);
				}
				if(seen.size()>9) break;
				if(seen.size()==10) break;
			}
			System.out.format("#%d %d\n", test_case, cur);
		}
		sc.close();
	}
}

