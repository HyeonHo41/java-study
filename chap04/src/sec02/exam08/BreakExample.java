package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random()*6)+1;
			System.out.println(num);
			
			if (num==6) {
				break;
			}
			
			// Quiz
//			1부터 n까지의 합을 구하는 중 합계가 1000이 넘는 순간의 
//			n과 n까지의 합을 출력하는 프로그램을 구현하시오.
//			
//			[출력]
//			45까지의 합: 1035
		}
		int i=1;
		int sum=0;
		while (true) {
			sum+=i;
			
			if(sum>1000) {
				break;
			}
			i++;
		}
		System.out.println(i+":"+sum);
	
	}

}
