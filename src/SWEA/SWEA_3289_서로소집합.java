package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_3289_서로소집합 {

	private static int N,M; //원소수 , 입력으로 주어지는 연산의 개수
	private static int[] parents; //대표자 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int command,a,b;
		
		for(int t = 1; t<=T; ++t) {
			N=sc.nextInt();
			M = sc.nextInt();
			parents = new int[N+1];
			
			//각 원소별 대표자(부모)값 지정
			Arrays.fill(parents, -1);	//make-set

			StringBuilder builder = new StringBuilder();
			
			builder.append("#").append(t).append(" ");
		
			for(int i = 0; i<=M; i++)
			{
				command = sc.nextInt();
				a = sc.nextInt();
				b = sc.nextInt();
				
				//커맨드값이 뭐냐에 따라 다르게 작업 가능
				
				switch(command) {
					case 0:
						union(a,b);
						break;
					case 1:		//같은집합이면 대표자를 찾아 비교하는 작업 해야.
							//a대표자 찾은 결과와 b의 대표자 찾는 결과 비교하면서 나감
						//같으면 1출력 아니면 0 출력.
						//비교해서 무조건 합치는게 아니라 같으면 1 다르면 0
						builder.append(find(a) == find(b)?"1":"0");
						break;
				}//switch
			}//for
			System.out.println(builder);
		}
	}
	
	private static int find(int a) {	//a의 부모 찾는거
		if(parents[a] ==-1) {
			return a;
		}
		return parents[a] = find(parents[a]); 	//a부모의 부모 찾는 작업 그렇게 나온 결과를 자기 자신의 parent에 준다.
	}
	
	private static boolean union(int a, int b) {	//온라인 강의때 풀었던거 그대로 사용
		int aRoot = find(a);
		int bRoot = find(b);
		//얘들은 매개변수로만 쓰고 짱 끼리 합치는 거.
		if(aRoot == bRoot) {	//두 조직의 짱이 같은 상황이면 이미 같은 조직이므로 합칠 필요가 없음.
			return false;	//합치지 못한 결과 리턴.
		}
		
		parents[bRoot] = aRoot;	//aRoot의 값 가져다 b에 넣는게 아니라 b의부모를 연결해서 대표자와 대표자끼리 작업하게 함.
		//b의 대표자 집어넣음.
		//이거 잘 기억하면 문제 풀때 적용하기 쉽다.
		//b루트의 부모를 a루트로 바꿔줌.
		return true;
		//나중에 랭크 이용하면 랭크 비교해서 랭크가 높은 쪽에 낮은 쪽 붙이고 둘의 랭크 같으면 자식의 랭크 하나 올려주는 이런 코드가 필요
		//path 압축햇을때 랭크 관리 쉽지않음.
	}
}
