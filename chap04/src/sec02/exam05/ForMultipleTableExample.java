package sec02.exam05;

public class ForMultipleTableExample {

	public static void main(String[] args) {
		// 구구단 출력해보기
		
		for (int i=2; i<10; i++) {
			System.out.println("***"+i+"단"+"***");
			for (int j=1; j<10; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}

	}

}
