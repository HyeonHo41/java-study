package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'a';
		
		switch (grade) {
			case 'A':
			case 'a':{
				System.out.println("우수");
				break;
			}
			case 'B': {
				System.out.println("일반");
				break;
			}
			default:{
				System.out.println("손님");
			}
			}
		
		if (grade=='A' ||grade=='a') {
			System.out.println("우수");
		}else if (grade=='B' || grade=='b'){
			System.out.println("일반");
		} else {
			System.out.println("손님");
		}
		}

}
