package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n",value);
		System.out.printf("상품의 가격: %4d원\n",value);
		System.out.printf("상품의 가격: %-4d원\n",value);
		
		double area = 3.14159 * 10 *10;
		System.out.printf("반지름이 %1$d인 원의 넓이:%2$.2f \n",10,area);
		System.out.printf("반지름이 %d인 원의 넓이:%.2f \n",10,area);

		String name = "홍길동";
		String job = "도적";
		System.out.printf("     1 | %-7s| %8s",name,job);
	}

}
