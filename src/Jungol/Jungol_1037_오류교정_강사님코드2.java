package Jungol;

public class Jungol_1037_오류교정_강사님코드2 {
	static int [][] a = {
			{1,0,1,0},
			{0,0,0,0},
			{1,1,1,1},
			{0,1,0,1}
	};
	static boolean colsum() {
		for(int j = 0; j<a.length; j++) {
			int sum =0;
			for(int i = 0;i<a.length;i++) {
				System.out.print(a[i][j] + " ");
				sum = sum +a[i][j];
			}
			System.out.println("sum = "+sum);
		}
		return true;
	}
	static boolean rowsum() {
		for(int i = 0; i<a.length; i++) {
			int sum =0;
			for(int j = 0;j<a.length;j++) {
				System.out.print(a[i][j] + " ");
				sum = sum +a[i][j];
			}
//			System.out.println("sum = "+sum);
			if(sum%2==1) return false;
		}
		return true;
	}
	
	static boolean sumCheck() {
		for(int i = 0;i<a.length;i++) {
			int isum=0;
			int jsum=0;
			for(int j =0; j<a.length;j++) {
				isum += a[i][j];
				jsum +=a[j][i];//i,j위치 바꾸자.
			}
			if(isum%2==1) return false;
			if(jsum%2==1) return false;
		}
		return true; //어떻게 보면 백트래킹.
	}
	public static void main(String[] args) {
		
		
		System.out.println(rowsum()&&colsum());//둘다 짝수면 true 아니면 false
//		System.out.println(rowsum());
//		System.out.println(colsum());
//		colsum();
	}
}
