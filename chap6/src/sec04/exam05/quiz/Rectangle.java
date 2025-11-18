package sec04.exam05.quiz;

public class Rectangle {
	int height;
	int width;
	
	
	
	//메소드
	int area() {
		int sum = 0;
		sum=width*height;
		System.out.println("면적 : "+sum);
		return sum;
	}
	int length() {
		int sum = 0;
		sum=(width*2)+(height*2);
		System.out.println("둘레 : "+sum);
		return sum;
	}
}
