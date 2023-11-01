package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_10867_중복빼고정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(bf.readLine());
        Set<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0;i<test_case;i++){
            int value = Integer.parseInt(st.nextToken());
            set.add(value);
        }

        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}

//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class BOJ_10867_중복빼고정렬하기 {
//
//	public static void main(String[] args) { // 10867번 중복 빼고 정렬하기
//	
//		Scanner sc = new Scanner(System.in);
//		int count= sc.nextInt();
//		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(sc.nextInt());
//		for (int i = 0; i < count-1; i++) {
//			int num = sc.nextInt();
//			for (int j = 0; j < arr.size(); j++) {
//				if (arr.get(j)==num) {
//					break;
//				}
//				if (j==arr.size()-1) {
//					arr.add(num);
//					break;
//				}
//			}
//		}
//		
//		arr.sort(Comparator.naturalOrder());
//		for (Integer integer : arr) {
//			System.out.print(integer+" ");
//		}
//		
//	}
//
//}