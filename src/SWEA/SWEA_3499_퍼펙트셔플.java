package SWEA;

//public class SWEA_3499_∆€∆Â∆Æº≈«√ {
//
//}
import java.util.*;

public class SWEA_3499_∆€∆Â∆Æº≈«√ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			String[] arr = new String[N];
			String[] result = new String[N];
			int first = 0;
			int mid = 0;
			if(N%2==0) {
				mid = N/2;
			}
			else {
				mid = N/2+1;
			}

			boolean sign = true;
			
			for(int i=0;i<N;i++) {
				arr[i] = sc.next();
			}
			
			
			for(int i=0;i<N;i++) {
				if(sign) {
					result[i] = arr[first];
					first++;
					sign = false;
				}
				else {
					result[i] = arr[mid];
					mid++;
					sign = true;
				}
				
			}
				
			System.out.printf("#%d ", tc);
			for(int i=0;i<N;i++) {
				System.out.print(result[i] + " ");				
			}
			System.out.println();

		}

	}
}