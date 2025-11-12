package sec02.exam01;

public class SignOpearatorExample {

	public static void main(String[] args) {
		int x = 100;
		int	result1	= +x;
		int	result2	= -x;
		System.out.println(result1);
		System.out.println(result2);
		
		byte b = 100;
		int result3= -b; //int 이하 정수의 산술(부호)연산은 int로 변환
		System.out.println(result3);
		
		char c = 22222;
		int result4 = (char)-c;
		System.out.println(result4);
		

	}

}
