package Jungol;

public class 배열_더하기_연습 {
	static int [][] a = {
			{1,0,1,0},
			{0,0,0,0},
			{1,1,1,1},
			{0,1,0,1}
	};
		
	
	static boolean colSum() {
		for (int j = 0; j<a.length;j++) {
			int sum =0;
			for(int i =0; i<a.length;i++) {
//				System.out.print(a[i][j]+" ");
				sum = sum+a[i][j];
			}
//			System.out.println("sum="+sum);
			if(sum%2==1) return false;
			
		}
		return true;
	}
	
	static boolean rowSum() {
		for (int i = 0; i<a.length;i++) {
			int sum =0;
			for(int j =0; j<a.length;j++) {
//				System.out.print(a[i][j]+" ");
				sum = sum+a[i][j];
			}
//			System.out.println("sum="+sum);
			if(sum%2==1) return false;
		}	
		return true;
	}
	
	static boolean sumCheck() {
		for (int i = 0; i<a.length;i++) {
			int isum =0;
			int jsum =0;
			for(int j =0; j<a.length;j++) {
//				System.out.print(a[i][j]+" ");
				isum = isum+a[i][j];
				jsum = jsum+a[j][i];
			}
//			System.out.println("sum="+sum);
			if(isum%2==1) return false;
			if(jsum%2==1) return false;
		}	
		return true;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(rowSum()&&colSum());
		System.out.println(rowSum());
		System.out.println(colSum());
	}
}
