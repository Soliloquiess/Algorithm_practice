package String_Array;

import java.util.HashMap;

public class _14_FindAnagramMapping {
		
		public static void main(String[] args) {
			int[] A = {12, 28, 46, 32, 50};
			int[] B = {50, 12, 32, 46, 28};
			int [] result = anagramMappings(A, B);
			print(result);
		}
		
		public static void print(int[] result) {
			for(int i=0; i< result.length; i++) {
				System.out.print(result[i]+" ");
			}
		}

		    public static int[] anagramMappings(int[] A, int[] B) {
		        int l = A.length;
		        int[] res = new int[l];
		        HashMap<Integer,Integer> map = new HashMap<>();
		        for(int i=0;i<l;i++){	//A.length만큼.
		            map.put(B[i],i);		//B의 값을 세팅(진짜 위치)
		            //1 4 3 2 0 
		        }
		        for(int i=0;i<l;i++){
		            res[i] = map.get(A[i]);	//A에서 꺼낸 값을 배열에 담음.
		        }        
		        return res;
		 }
}