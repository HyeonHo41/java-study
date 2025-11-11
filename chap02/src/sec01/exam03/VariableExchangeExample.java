package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x +", y: " + y);
		
		y = x;
		System.out.println("x: " + x +", y: " + y);
		y = 5;
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x +", y: " + y);

	}

}
