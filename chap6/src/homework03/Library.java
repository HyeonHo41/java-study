package homework03;

public class Library {
	String a;
	String b;
	int c;
	int d;
	String e;
	String f;
	
	
	//메소드1
	String sum(String a, String b) {
		String result="";
		result=a.concat(b);
		System.out.println(result);
		return result;
	}
	//메소드2
	int multiple(int c, int d) {
		int result = 0;
		if (c<d) {
			System.out.println("계산할 수 없습니다.");
			return result;
		} else {
			result = c*d;
			System.out.println(result);
			return result;
		}
	}
	
	//메소드3
	Boolean check(String e,String f) {
		Boolean result;
		if (e.equals(f)) {
			result=true;
			System.out.println(result);
			return result;
		} else {
			result=false;
			System.out.println(result);
			return result;
		}
	}
	
	
}
