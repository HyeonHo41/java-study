package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		Label:for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5;j++) {
				if(j==3) {
					break Label;
				}
				System.out.println("i="+i+",j="+j);
			} 
		}
		
		Outter: for (char upper ='A'; upper <='Z'; upper++) {
			for (char lower ='a'; lower <='z'; lower++) {
				System.out.println(upper+ "-"+lower);
				if (lower =='g') {
					break Outter;
					
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
