package homework04;

import java.util.Iterator;

public class Library {
	String a;
	int b;
	String c;
	String d;
	int e;
	char dd;

	
	
	//메소드1
	String path(String a) {
		String result="";
		result=a;
		System.out.println(result);
		return result;
	}
	//메소드2
	int sum() {
		int sum= 0;
		for (int i = 1; i <=100; i++) {
			sum +=i;
		} 
		System.out.println(sum);
		return sum;
	}
	//메소드3
	String numberCheck(int b) {
		String result="";
		if (b%2==0) {
			result="짝수";
			System.out.println("짝수");
		} else {
			result="홀수";
			System.out.println("홀수");
		}
		return result;
	}
	//메소드4
	String enCheck(String c) {
		String result="";
		char en;
		for (int i = 0; i <c.length(); i++) {
			en=c.charAt(i);
			if ((en>='a'&&en<='z')||(en>='A'&&en<='Z')) {
				result ="영문자 있음";
				break;
			} else {
				result="영문자 없음";
				
			}
		}
		System.out.println(result);
		return result;
	}
	//메소드5
	int charCheck(String d,char dd) {
		int count=0;
		char ch;
		for (int i = 0; i < d.length(); i++) {
			ch=d.charAt(i);
			if (ch==dd) {
				count++;
			}
		}
		System.out.println("같은 문자 : "+count);
		return count;
	}
	//메소드6
	int gugu(int e) {
		for (int i = e; i <= 9; i++) {
			System.out.println(e+"단");
			for (int j= 0; j<=9; j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
		}
		return e;
	}
}
