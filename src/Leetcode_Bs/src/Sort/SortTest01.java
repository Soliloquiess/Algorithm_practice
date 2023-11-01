package Sort;


//compareTo()
public class SortTest01 {
	public static void main(String[] args) {
		String version1 = "8.5.2.4", version2 = "8.5.3";
//		String version1 = "1.0.1", version2 = "1";
		System.out.println(compareVersion(version1, version2));
	}
	public static int compareVersion(String version1, String version2) {
	    String[] level1 = version1.split("\\.");	
	    //     "\\." 이 부분이 점을 제외한다는 뜻임. 그럼 위에 숫자는 8524, 853으로 바뀌게 됨. 
	    String[] level2 = version2.split("\\.");
	    
	    int length = Math.max(level1.length, level2.length);	//4만큼 돌림.
	    for (int i=0; i<length; i++) {	//얘를 돌 동안 없으면 0 채워줘야
	    	Integer v1 = i < level1.length ? Integer.parseInt(level1[i]) : 0;
	    	Integer v2 = i < level2.length ? Integer.parseInt(level2[i]) : 0;
	
	    	int compare = v1.compareTo(v2);
	    	if (compare != 0) {
	    		return compare;
	    	}
	    }
	    
	    return 0;
	}
}