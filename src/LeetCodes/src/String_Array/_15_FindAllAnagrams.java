package String_Array;

import java.util.*;

public class _15_FindAllAnagrams {

	public static void main(String args[])
    {
		_15_FindAllAnagrams a = new _15_FindAllAnagrams();
        String txt = "BACDGABCDA";
        String pat = "ABCD";
        System.out.println(a.findAnagrams(txt, pat));
    }


 public List<Integer> findAnagrams(String txt, String pat) {
   //1 
	 List<Integer> result = new ArrayList<>();
	 if(txt==null||txt.length()==0||pat==null||pat.length()==0||txt.length()<pat.length())
		 return result;
   //2
	 int[] patArr = new int[256];//[0,0,0,0,0,0,1,1,1,1,0,0,0] 아스키코드로 비교
	 for(int i=0; i<pat.length();i++) {
		 patArr[pat.charAt(i)]++;
	 }
	 
	 for(int i=0; i<txt.length()-pat.length()+1; i++) {
		 //6보다 작은 값이 와야
		 int[] txtArr = new int[256];
		 for(int j=0; j<pat.length(); j++) {
			 txtArr[txt.charAt(i+j)]++; //0+, 1+
		 }
		 
		 if(check(patArr, txtArr)) {	//true면 result 에 i 넣음.
			 result.add(i);
		 }
	 }
	return result;
  }
 private boolean check(int[] patArr, int[] txtArr) {
	 for(int i=0; i<patArr.length; i++) {
		if(patArr[i] != txtArr[i]) {
			return false;
		}
	 }
	 return true;
 }
	 
	 
	 
}