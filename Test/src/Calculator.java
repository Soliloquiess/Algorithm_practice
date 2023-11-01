
public class Calculator {
	public int sum(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator(); 
		int result = c.sum (10, 20 );
		System.out.println(result);
	}
}