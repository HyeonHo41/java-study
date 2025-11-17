package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		String[] choices = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String me = sc.next();
			String result="";
			int count =0;
			int winCount=0;
			int dCount=0;
			int loseCount=0;
			

			int num=(int)(Math.random()*3);
			String com = choices[num];
			count++;
			if (me.equals("stop")) {
				System.out.println(count+"전"+winCount+"승"+dCount+"무"+loseCount+"패");
				break;
			}
			
			if (me.equals("가위")){
				if (com.equals("가위")) {
					result="비겼습니다.";
					dCount++;
				} else if (com.equals("바위")) {
					result="졌습니다 ㅠㅠ";
					loseCount++;
				} else {
					result="이겼습니다.";
					winCount++;
				}
			} else if (me.equals("바위")){
				if (com.equals("가위")) {
					result="이겼습니다.";
					winCount++;
				} else if (com.equals("바위")) {
					result="비겼습니다.";
					dCount++;
				} else {
					result="졌습니다 ㅠㅠ";
					loseCount++;
				}
			} else if (me.equals("보")){
				if (com.equals("가위")) {
					result="졌습니다 ㅠㅠ";
					loseCount++;
				} else if (com.equals("바위")) {
					result="이겼습니다.";
					winCount++;
				} else {
					result="비겼습니다.";
					dCount++;
				}
				
			} else {
				result ="잘못 입력하셨습니다.";
			} System.out.println(result);
		}

	}

}
