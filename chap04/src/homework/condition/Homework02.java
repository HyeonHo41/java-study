package homework.condition;

import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int c = sc.nextInt();
		
		String m="";
		String d="";
		
		
		if (month>=1 && month<=12) {
			if (month>=6 && month <=9) {
				m="여름";
				if (c>=35) {
					d="폭염 경보";
				} else if (c<35 && c>=33) {
					d="폭염 주의보";
				}
				
			} else if (month == 1 || month==2 || month==12) {
				m="겨울";
				if (c<=-15) {
					d="한파 경보";
				} else if (c<=-12 && c>=-15) {
					d="한파 주의보";
				}
			}
			else if (month>=3 && month <=5) {
				m="봄";
			
			}
			
		} else {
			m="해당하는 계절 없음";
		}
		System.out.println(m+"  "+d);
	}
}
