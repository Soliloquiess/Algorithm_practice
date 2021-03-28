package String_Array;

public class _10_PlusOne {

	
	public static void main(String[] args) {
//		int[] digits = {1,2,3};
//		int[] digits = {9,9,9};
//		int[] digits = {9,8,9};
//		int[] digits = {8,9,9};
		int[] digits = {0,0,1};
//		int[] digits = {0,0};
//		int[] digits = {9,0,0,9};
		
		int[] result = plusOne2(digits);
		for (int i : result)
			System.out.println("val: " + i);
	}
	
	  public static int[] plusOne2(int[] digits) //digit어레이의 인덱스 알아내여.
	    {
	        int carry = 1;	//캐리는 넘어가는거
	        int index = digits.length - 1;	//인덱스 알아내자
	        
	        // for, while
	        while (index >= 0 && carry > 0)
	        {
	            digits[index] = (digits[index] + carry) % 10;	//이부분이 핵심(나머지)
	            //10이면 0이 됨 그리고  carry = 1 되게
	            
	            if(digits[index]==0) {	//만약 0이면 carry를 1로 만든다(올라가는 수)
	            	carry =1;
	            }else {
	            	carry =0;
	            }
	            index--;	//인덱스는 한칸 빼준다.
	        }
	        //근데 여기서 999면 000이 나온다.
	        
	        if (carry > 1)	//0,0,1 이 주어지면 1 0 0 2가 되는 경우 방지.
	       //if (carry == 1)	
	        {
	            digits = new int[digits.length + 1];	//초기화된 값 넣자.
//	            {0,0,0,0}
	            digits[0] = 1;
	        }
	        
	        return digits;
	    }
}