package BOJ;
import java.util.*;

//public class BOJ_13300_방배정 {
	
	

import java.util.*;

public class BOJ_13300_방배정 {
	
	static int male[] = new int[7];
	static int female[] = new int[7];
	public static void main(String[] args) {
		
	
		 Scanner sc = new Scanner(System.in);
	    int n,k;
//	    cin >> n >> k;
	    n = sc.nextInt();
	    k = sc.nextInt();
	    for(int i = 0; i < n; i++){
	        int gender;
	        int grade;
//	        cin >> gender >> grade;
	         gender = sc.nextInt();
	         grade = sc.nextInt();
	        if(gender==0){
	            female[grade]++;
	        }else{
	            male[grade]++;
	        }
	    }
	    int room = 0;
	    for(int i = 1; i <= 6; i++){
	        if(male[i] % k == 0) room += male[i] / k;
	        else room += male[i]/k+1;
	    }
	    for(int i = 1; i <= 6; i++){
	        if(female[i] % k == 0) room += female[i] / k;
	        else room += female[i]/k+1;
	    }
//	    cout << room << '\n';
	    System.out.println(room);
	}
}
	
	
	
//	static int N; // 수학여행에 참가하는 학생 수
//	static int K; // 한 방에 배정할 수 있는 최대 인원 수
//	static int[][] student; // 학생 입력
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		N = sc.nextInt(); // 수학여행에 참가하는 학생 수
//		K = sc.nextInt(); // 한 방에 배정할 수 있는 최대 인원 수
//		
//		student = new int[7][2];
//		
//		for(int i=0;i<N;i++) {
//			int sex = sc.nextInt(); // 성별 입력 여학생은 0, 남학생은 1
//			// 여학생이면 0번 인덱스에 학년만큼 1씩 증가
//			if(sex==0) student[sc.nextInt()][0]++;
//			// 남학생이면 0번 인덱스에 학년만큼 1씩 증가
//			else if(sex==1) student[sc.nextInt()][1]++;
//		}
//		
//		int count = 0; // 방의 개수	
//		
//		//여학생 탐색
//		for(int i=1;i<7;i++) {
//			//학생 수가 없다면 처음으로
//			if(student[i][0]==0) continue;
//			
//			//K보다 작거나 같으면 count 1 증가
//			else if(student[i][0]<=K) count++;
//			//K로 나눴는데 나머지가 0이라면 몫만큼 count 증가
//			else if(student[i][0]%K==0) count += student[i][0] / K;
//			//K로 나눴는데 나머지가 0이아니라면 몫만큼 증가하고, 1증가
//			else if(student[i][0]%K!=0) {
//				count+=student[i][0] / K;
//				count++;
//			}
//		}
//		
//		//남학생 탐색
//		for(int i=1;i<7;i++) {
//			//학생 수가 없다면 처음으로
//			if(student[i][1]==0) continue;
//			
//			//K보다 작거나 같으면 count 1 증가
//			else if(student[i][1]<=K) count++;
//			//K로 나눴는데 나머지가 0이라면 몫만큼 count 증가
//			else if(student[i][1]%K==0) count += student[i][1] / K;
//			//K로 나눴는데 나머지가 0이아니라면 몫만큼 증가하고, 1증가
//			else if(student[i][1]%K!=0) {
//				count+=student[i][1] / K;
//				count++;
//			}
//		}
//		
//		//count 출력
//		System.out.println(count);
//	}
//}


//
//public class Main {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(bf.readLine());
//		int N = Integer.parseInt(st.nextToken());
//		int K = Integer.parseInt(st.nextToken());
//		int room = 0;
//		// 1 ~ 6학년 , 남 & 여 구분
//		int[][] student = new int[7][2];
//		
//		// 각 학년별 남학생, 여학생 구분해서 카운트
//		for(int i=0; i<N; i++) {
//			st = new StringTokenizer(bf.readLine());
//			int a = Integer.parseInt(st.nextToken());	// 성별
//			int b = Integer.parseInt(st.nextToken());	// 학년
//			if(a == 0) student[b][0] ++;	// 여성 => [학년][0] ++
//			else 	student[b][1] ++;       // 남성 => [학년][1] ++
//		}
//		
//		for(int i=1; i<student.length; i++) {
//			for(int j=0; j<student[i].length; j++) {
//				if(student[i][j] == 0)	continue;	// i학년 학생이 없는 경우 => 방 필요없이 통과
//				room += student[i][j] / K;	// 필요한 방 계산
//				if(student[i][j] % K != 0)	// 방이 학생에 나누어 떨어지지 않으면 방 하나 더 필요
//					room += 1;
//			}
//		}
//		System.out.println(room);
//		bf.close();
//	}
//
//}

